package in.redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.exec.ExecuteResultHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.metrics.internal.state.SynchronousMetricStorage;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));

		WebElement f = driver.findElement(By.xpath("//input[@name='q']"));
		f.sendKeys("iphone15");
		Thread.sleep(1000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro Max (Black Titanium, 256 GB)']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

		String pwin = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if (!x.equals(pwin)) {
				driver.switchTo().window(x);
			}
		}
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();

		String parent = driver.getWindowHandle();
		Set<String> childwin = driver.getWindowHandles();
		for(String x: childwin) {
			if(!x.equals(parent)) {
			driver.switchTo().window(x);
			}
		}
		WebElement value = driver.findElement(By.xpath("//input[@type='text']"));
		value.sendKeys("6379695997");

		// //move to element in amazone
		// WebElement f = driver.findElement(By.id("nav-link-accountList"));
		// Actions a = new Actions(driver);
		// a.moveToElement(f).perform();
		// driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		// driver.findElement(By.linkText("Wish from Any Website")).click();

		// windowshandling

		//
		// String a = driver.getWindowHandle();
		// System.out.println("parent"+a);
		// Set<String> w = driver.getWindowHandles();
		// System.out.println("parent+child"+w);
		// List<String> L = new ArrayList<String>(w);
		// driver.switchTo().window(L.get(1));
		// driver.findElement(By.id("firstName")).sendKeys("vijay");
		// Thread.sleep(1000);
		// System.out.println(driver.getCurrentUrl());

		//
		// driver.switchTo().window(L.get(0));
		// driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("Resh");
		//
		// driver.findElement(By.id("newWindowBtn")).click();
		// driver.switchTo().window(L.get(1));
		// Thread.sleep(1000);
		// driver.findElement(By.id("lastName")).sendKeys("vijayresh");
		// Thread.sleep(1000);
		//
		// for(String s : w) {
		// System.out.println(s);
		// if(!s.equals(a)) {
		// driver.switchTo().window(s);
		// driver.findElement(By.id("firstName")).sendKeys("vijay");
		// Thread.sleep(1000);
		// driver.findElement(By.id("lastName")).sendKeys("vijayresh");
		// System.out.println(driver.getCurrentUrl());
		// }
		// }
		//
		//

	}

}
