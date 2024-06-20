package in.cucumber.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbaccount extends BaseClass {
	//public static WebDriver driver;
	public static BaseClass base = new BaseClass();
	
	@Given("User Launch Facebook Application {string}")
	public void user_Launch_Facebook_Application(String url) throws IOException {
		File f = new File("C:\\Users\\91637\\eclipse-workspace1\\redbus\\src\\test\\resources\\Utilities.property");
		FileInputStream f1 = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(f1);
		String file = prop.getProperty("file");
		String urll = prop.getProperty("url");
		
		FileOutputStream fo = new FileOutputStream(f);
		prop.setProperty("urllQa", "https://www.facebook.com/");
		prop.save(fo, "Upadate QA URL");
		System.out.println(file +" and "+ urll);
		base.launchApplication(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("disable-notifications");
//		options.addArguments("disable-popups");
//		options.addArguments("start-maximized");
//		driver = new EdgeDriver(options);


	}

	@Given("user click Create new account")
	public void user_click_Create_new_account() {
		WebElement clk = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		base.button(clk);
	}

	@When("user pass first name {string}")
	public void user_pass_first_name(String firstname) {
		WebElement user_firstname = driver.findElement(By.xpath("//input[starts-with(@class,'inputtext') and @name='firstname']"));
		base.button(user_firstname);
		base.inputKeys(user_firstname, firstname);
	}

	@When("user pass surname {string}")
	public void user_pass_surname(String surname) {
		WebElement user_surname = driver.findElement(By.xpath("//input[starts-with(@class,'inputtext') and @name='lastname']"));
		base.button(user_surname);
		base.inputKeys(user_surname, surname);

	}
	@When("user pass mobile number {string}")
	public void user_pass_mobile_number(String phonenum) {
		WebElement user_phonenum = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		base.button(user_phonenum);
		base.inputKeys(user_phonenum, phonenum);

	}
	@When("user pass password {string}")
	public void user_pass_password(String password) {
		WebElement user_password = driver.findElement(By.xpath("//input[@data-type='password']"));
		base.button(user_password);
		base.inputKeys(user_password, password);

	}

	@When("user pass date {string}")
	public void user_pass_date(String string) {
		WebElement user_birthday = driver.findElement(By.xpath("//select[@aria-label='Day']"));
	       Select s = new Select(user_birthday);
	       base.valueSelect(user_birthday, string);
	}

	@When("user pass month {string}")
	public void user_pass_month(String string) {
		WebElement user_birthmonth = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	       Select s = new Select(user_birthmonth);
	      base.visibleTextSelect(user_birthmonth, string);
	}

	@When("user pass year {string}")
	public void user_pass_year(String string) {
		WebElement user_birthyear = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	       Select s = new Select(user_birthyear);
	      visibleTextSelect(user_birthyear, string);
	}

	@When("user click gender")
	public void user_click_gender() {
		 WebElement t = driver.findElement(By.xpath("//label[text()='Male']"));
		 base.button(t);
	}
	@Then("user click signup {string}")
	public void user_click_signup(String screenshot) throws IOException {
		 WebElement lo = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		base.button(lo);


	}
}
