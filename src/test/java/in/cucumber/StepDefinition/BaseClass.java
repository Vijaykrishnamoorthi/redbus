package in.cucumber.StepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass implements IBaseClass {
	public static WebDriver driver;
	public static Actions ac;

	@Override
	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new EdgeDriver(options);

	}

	public void launchApplication(String url) {
		driver.get(url);
	}

	@Override
	public void inputKeys(WebElement ele, String value) {
		ele.sendKeys(value);

	}

	@Override
	public void button(WebElement ele) {
		ele.click();

	}

	@Override
	public boolean displayed(WebElement ele) {
		boolean display = ele.isDisplayed();
		return display;

	}

	@Override
	public boolean selected(WebElement ele) {
		boolean selected = ele.isSelected();
		return selected;

	}

	@Override
	public boolean enabled(WebElement ele) {
		boolean enabled = ele.isEnabled();
		return enabled;

	}

	@Override
	public void moveForward() {
		driver.navigate().forward();
	}

	@Override
	public void moveBackward() {
		driver.navigate().back();

	}

	@Override
	public String returnText(WebElement ele) {
		String text = ele.getText();
		return text;

	}

	@Override
	public String returnAttribute(WebElement ele, String attribute) {
		String attribute2 = ele.getAttribute(attribute);
		return attribute2;

	}

	@Override
	public String returnCssValue(WebElement ele, String cssName) {
		String cssvalue = ele.getCssValue(cssName);
		return cssvalue;

	}

	@Override
	public void valueSelect(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);

	}

	@Override
	public void indexSelect(WebElement ele, int i) {
		Select sv = new Select(ele);
		sv.deselectByIndex(i);

	}

	@Override
	public List<WebElement> returnOptions(WebElement ele) {
		Select sl = new Select(ele);
		List<WebElement> options = sl.getOptions();
		return options;

	}

	@Override
	public void parentWindow() {
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);

	}

	@Override
	public void childWindow() {
		String parentWindows = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		for (String x : childwindow) {
			if (!parentWindows.equals(x)) {
				driver.switchTo().window(x);
			}
		}

	}

	@Override
	public void inputkeys(Alert a, String value) {
		Alert al = driver.switchTo().alert();
		if (value.equals("ok")) {
			al.accept();
		} else {
			al.dismiss();
		}

	}

	@Override
	public void screenshot(String imageName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File f1 = new File("C:\\Users\\balap\\eclipse-workspace\\browser\\Cucumber\\target\\" + imageName + ".png");
		FileUtils.copyFile(f, f1);
	}

	@Override
	public void browserClose() {
		driver.close();

	}

	@Override
	public String pageUrl() {
		String text = driver.getCurrentUrl();
		return text;

	}

	@Override
	public String pageTitle() {
		String text = driver.getTitle();
		return text;

	}

	@Override
	public void dragDrop(WebElement src, WebElement tar) {
		ac = new Actions(driver);
		ac.dragAndDrop(src, tar).perform();

	}

	@Override
	public void moveTo(WebElement ele) {
		ac = new Actions(driver);
		ac.moveToElement(ele).perform();

	}

	public void actionClick(WebElement ele, String value) {
		ac = new Actions(driver);
		switch (value) {
		case "double":
			ac.doubleClick(ele).perform();
			;
		case "rightclick":
			ac.contextClick(ele).perform();
			;
		}

	}

	public void enterFrame(String value, int i, String frame) {
		switch ((value).toLowerCase()) {
		case "name":
			driver.switchTo().frame(frame);
			break;
		case "i":
			driver.switchTo().frame(i);
			break;
		}

	}

	public void exitFrame(String value) {
		if (value.equals("parent")) {
			driver.switchTo().parentFrame();
		} else if (value.equals("default")) {
			driver.switchTo().defaultContent();

		}

	}

	public void visibleTextSelect(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}

	public WebDriverWait waits() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait;
	}

}
