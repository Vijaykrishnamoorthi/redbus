package in.redbus;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New2 {
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// bus
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(
				By.xpath("//span[text()='Buses' and @class='headerIconTextAlignment chNavText darkGreyText']")).click();
		// from
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Tiruvannamalai, Tamil Nadu");
		driver.findElement(By.xpath("//span[text()='Tiruvannamalai, Tamil Nadu']")).click();
		// to
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//span[text()='Bangalore, Karnataka']")).click();
		// date
		driver.findElement(By.xpath("//div[@aria-label='Thu Jun 06 2024']")).click();
		driver.findElement(By.xpath("//button[@id='search_button']")).click();

		List<String> b1 = new LinkedList<>();
		List<String> d2 = new LinkedList<>();
		List<String> a3 = new LinkedList<>();
		List<String> r4 = new LinkedList<>();
		List<WebElement> buses = driver.findElements(By.xpath("//p[@class='makeFlex hrtlCenter appendBottom8 latoBold blackText appendRight15']"));
		List<WebElement> deptime = driver.findElements(By.xpath("//span[@class='font18 latoBlack blackText appendRight4']"));
		List<WebElement> arrtime = driver.findElements(By.xpath("//span[@class='font18 blackText appendRight4 latoRegular']"));
		List<WebElement> farerate = driver.findElements(By.xpath("//span[@placeholder='true']"));

		for (int i = 0; i < buses.size(); i++) {
			String bus = buses.get(i).getText();
			b1.add(bus);
			String dept = deptime.get(i).getText();
			d2.add(dept);
			String arrival = arrtime.get(i).getText();
			a3.add(arrival);
			String rate = farerate.get(i).getText();
			r4.add(rate);
			System.out.println(
					"BusesNames:" + bus + "DepartureTime:" + dept + "ArrivalTime:" + arrival + "Rate:" + rate);
		}

		File f = new File("D:\\selinium\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet s = wb.createSheet("Sheet1");
		for(int i=0; i<b1.size(); i++) {
			Row r = s.getRow(i);
			if (r == null) {
				r = s.createRow(i);
			}
			Cell c = r.createCell(0);
			c.setCellValue(b1.get(i));
		}
		for(int i=0; i<d2.size(); i++) {
			Row r = s.getRow(i);
			if (r == null) {
				r = s.createRow(i);
			}
			Cell c = r.createCell(1);
			c.setCellValue(d2.get(i));
		}
		for(int i=0; i<a3.size(); i++) {
			Row r = s.getRow(i);
			if (r == null) {
				r = s.createRow(i);
			}
			Cell c = r.createCell(2);
			c.setCellValue(a3.get(i));
		}
		for(int i=0; i<r4.size(); i++) {
			Row r = s.getRow(i);
			if (r == null) {
				r = s.createRow(i);
			}
			Cell c = r.createCell(3);
			c.setCellValue(r4.get(i));
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileOutputStream f1 = new FileOutputStream(f);
		wb.write(f1);
		f1.close();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='GreenLine Travels And  Holidays']"));
		driver.findElement(By.xpath("//span[text()='660'][1]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'darkGreyText' and text()='775')])[17]")).click();;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Type here' and @type='text' and @id='fname']")).sendKeys("vijay");
     	driver.findElement(By.xpath("//input[@id='age']")).sendKeys("22");
		WebElement male = driver.findElement(By.xpath("//span[starts-with(@class,'listingSprite male')]"));
		male.click();
		driver.findElement(By.xpath("//input[@id='dt_state_gst_info']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil Nadu']")).click();
		driver.findElement(By.xpath("//p[text()='Confirm and save billing details to your profile']")).click();
		driver.findElement(By.xpath("//input[@name='email id']")).sendKeys("Vijaykrishnamorrthi98@gmail.com");
		driver.findElement(By.xpath("//input[@name='Mobile Number']")).sendKeys("6379695997");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Continue']")).click();	
	}
}
