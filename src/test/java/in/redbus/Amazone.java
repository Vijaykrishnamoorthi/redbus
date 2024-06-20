package in.redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazone {
	
	public static void main(String[]args) throws IOException, InterruptedException, AWTException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//is Displayed
		
		WebElement allbtn = driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
		boolean displayed = allbtn.isDisplayed();
		allbtn.click();
		System.out.println("Dispalyed:"+displayed);
//click to all button
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
	    Thread.sleep(2000);
//takes Screenshot
	    
	    TakesScreenshot ts =(TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dec = new File("C:\\Users\\91637\\eclipse-workspace1\\Amazone\\target\\amozone\\src.png");
	    FileHandler.copy(src, dec);
//dropdown
	    
	    WebElement ec = driver.findElement(By.id("searchDropdownBox"));
	    Select e = new Select(ec);
	    Thread.sleep(1000);
	    e.selectByVisibleText("Electronics");
//JavascriptExecutor pass the values
//	    
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//	    WebElement pass = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']"));
//	    js.executeScript("arguments[0].value='vivo'",pass);
////Using Robot	 
//	    
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    Robot r = new Robot();
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    r.keyPress(KeyEvent.VK_ENTER);
//	    r.keyRelease(KeyEvent.VK_ENTER);
////using javascipt excuster scroll down
//	    
//	    Thread.sleep(1000);
//	    WebElement down = driver.findElement(By.xpath("//span[text()='Previous']"));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)",down);
//		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[last()]")).click();
////get window handle	
//		
//		
//		String pWin = driver.getWindowHandle();
//		Set<String> allWin = driver.getWindowHandles();
//		for(String x : allWin) {
//			if(!x.equals(pWin)) {
//				driver.switchTo().window(x);	
//			}
//		}
////click buynow button
//		
//		//driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
//		
		
	}

}


