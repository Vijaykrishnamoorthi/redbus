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

public class New1 {
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
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Tiruvannamalai");
	driver.findElement(By.xpath("//text[text()='Tiruvannamalai']")).click();
	}
	@Test
	public void method3() {
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("//text[text()='Bangalore']")).click();
		}
	@Test
	public void method4() {
	driver.findElement(By.xpath("//span[text()='4' and contains(@class,'fgdqFw')]")).click();
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
		List<WebElement> ab=driver.findElements(By.xpath("//div[contains(@class='travels lh-24 f-bold d-color')]"));
		List<WebElement>cd=driver.findElements(By.xpath("//div[conatain(@class='dp-time f-19 d-color f-bold')]"));
		List<WebElement>ef=driver.findElements(By.xpath("//div[contains(@class='bp-time f-19 d-color disp-Inline')]"));
		List<WebElement> gh=driver.findElements(By.xpath("//div[contains(@class='fare d-block')]"));

		for(int i=0;i<ab.size();i++) {
			if(i==ab.size()-1) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)",ab.get(i));
			    ab=driver.findElements(By.xpath("//div[contains(@class='travels lh-24 f-bold d-color')]"));
				cd=driver.findElements(By.xpath("//div[contains(@class='dp-time f-19 d-color f-bold')]"));
				ef=driver.findElements(By.xpath("//div[contains(@class='bp-time f-19 d-color disp-Inline')]"));
				gh=driver.findElements(By.xpath("//div[contains(@class='fare d-block')]"));
				
				
			}

			else {
				String bus =ab.get(i).getText();
				String dp =cd.get(i).getText();
				String ap=ef.get(i).getText();
				String fare =gh.get(i).getText();
				System.out.println("Bus Name : "+ bus+" pickup Time "+dp +" Arival Time :" +ap+" Bus Fare :"+fare);
			}
			
		}}
		
	
	@AfterClass
	public static void method8() {
		//driver.close();
	}	
}	


