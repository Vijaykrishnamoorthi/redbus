package in.redbus;

import java.time.Duration;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
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
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Thiruvannamalai");
	driver.findElement(By.xpath("//text[text()='Thiruvannamalai']")).click();
	}
	@Test
	public void method3() {
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//text[text()='Bangalore']")).click();
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
		List<WebElement> gt=driver.findElements(By.xpath("//div[@class='bus-type f-12 m-top-16 l-color evBus']"));
		List<WebElement> gg=driver.findElements(By.xpath("//div[@class='dp-time f-19 d-color f-bold']"));
		List<WebElement> gh=driver.findElements(By.xpath("//div[@class='dur l-color lh-24']"));////span[@class='f-19 f-bold']
		List<WebElement> gz=driver.findElements(By.xpath("//div[@class='bp-time f-19 d-color disp-Inline']"));
		List<WebElement> gy=driver.findElements(By.xpath("//span[@class='f-19 f-bold']"));
		System.out.println("Available Buses:");
		for(WebElement wh:gt) {
			System.out.println(wh.getText());	
		}
		System.out.println("Departure Time:");
		for(WebElement wh:gg) {
			System.out.println(wh.getText());
		}
		System.out.println("Duration:");
		for(WebElement wh:gh) {
			System.out.println(wh.getText());
		}
		System.out.println("Arrival Time:");
		for(WebElement wh:gz) {
			System.out.println(wh.getText());
		}
		
		System.out.println("BusFare:");
		for(WebElement wh:gy) {
			System.out.println(wh.getText());
		}
	}

	@AfterClass
	public static void method8() {
		driver.close();
	}	
}