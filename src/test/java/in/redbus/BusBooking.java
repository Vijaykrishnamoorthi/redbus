package in.redbus;

import java.time.Duration;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BusBooking {
	public static WebDriver driver;
	@BeforeClass
	public static void method1(){
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new EdgeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test
	public void method2() {
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//text[text()='Chennai']")).click();
	}
	@Test
	public void method3() {
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Trichy");
	driver.findElement(By.xpath("//text[text()='Trichy']")).click();
		}
	@Test
	public void method4() {
	driver.findElement(By.xpath("//span[text()='3' and contains(@class,'fgdqFw')]")).click();
		}
	@Ignore
	@Test
	public void method5() {
		driver.quit();
	}
	@Test
	public void method6() {
	driver.findElement(By.xpath("//button[@id='search_button']")).click();
	}
	@Test
	public void method7() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> a= driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
		List<WebElement> b = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
		List<WebElement> c = driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
		List<WebElement> d = driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
		for (int i = 0; i < a.size(); i++) {
			if (i == a.size()-1) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)",a.get(i));
		    a=driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
			b=driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
			c=driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
			d=driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
			}else {
			String e = a.get(i).getText();
			String f = b.get(i).getText();
			String g = c.get(i).getText();
			String h = d.get(i).getText();
			System.out.println("Bus Name: "+e+"Departure Time: "+f+"Arrival Time: "+g+"Fare rate: "+h);
			}
	}
	}
	}
//		List<WebElement> ab=driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
//		List<WebElement>cd=driver.findElements(By.xpath("//div[@class='dp-time f-19 d-color f-bold']"));
//		List<WebElement>ef=driver.findElements(By.xpath("//div[@class='bp-time f-19 d-color disp-Inline']"));
//		List<WebElement> gh=driver.findElements(By.xpath("//div[@class='fare d-block']"));
//
//		for(int i=0;i<ab.size();i++) {
//			if(i==ab.size()-1) {
////				JavacriptExecutor js = (JavascriptExecutor)driver;
////				js.executeScript("window.scrollTo(0,docment.body.scrollHeight)",ab.get(i));
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("window.scrollTo(0,document.body.scrollHeight)",ab.get(i));
//			    ab=driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
//				cd=driver.findElements(By.xpath("//div[@class='dp-time f-19 d-color f-bold']"));
//				ef=driver.findElements(By.xpath("//div[@class='bp-time f-19 d-color disp-Inline']"));
//				gh=driver.findElements(By.xpath("//div[@class='fare d-block']"));
//				System.out.println(ab.size());
//				
//			}
//
//			else {
//				String bus =ab.get(i).getText();
//				String dp =cd.get(i).getText();
//				String ap=ef.get(i).getText();
//				String fare =gh.get(i).getText();
//				System.out.println("Bus Name : "+ bus+" pickup Time "+dp +" Arival Time :" +ap+" Bus Fare :"+fare);
//			}
//			
//		}}
//		
//	
//	@AfterClass
//	public static void method8() {
//		driver.close();
//	}	
//}