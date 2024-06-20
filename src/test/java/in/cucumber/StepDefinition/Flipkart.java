package in.cucumber.StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart extends BaseClass {
	public static BaseClass base = new BaseClass();
	public static Flipkart f = new Flipkart();
	//public static WebDriver driver;

	@Given("Launch the browser and appilication {string}")
	public void launch_the_browser_and_appilication(String url) {
		base.launchApplication(url);
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions ops = new EdgeOptions();
//		ops.addArguments("disable-notifications");
//		ops.addArguments("disable-popups");
//		ops.addArguments("start-maximized");
//		driver = new EdgeDriver(ops);
//		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user click login button")
	public void user_click_login_button() {
		WebElement c = driver.findElement(By.xpath("//span[text()='Login']"));
	base.button(c);

	}

	@When("enter mobile number with one dim list")
	public void enter_mobile_number_with_one_dim_list(io.cucumber.datatable.DataTable dataTable) {

		List<String> List = dataTable.asList();
		String S1 = List.get(0);
		WebElement mn = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		base.inputKeys(mn, S1);
	}
		
		@When("user click the request OTP button")
		public void user_click_the_request_OTP_button1() {
		   WebElement ro= driver.findElement(By.xpath("//button[text()='Request OTP']"));
		   base.button(ro);
		}

	@When("user Become a seller button")
	public void user_Become_a_seller_button() {
		WebElement Bs = driver.findElement(By.xpath("//a[text()='Become a Seller']"));
		base.button(Bs);
		WebElement s = driver.findElement(By.xpath("//button[text()='Login']"));
		base.button(s);
	}

	@When("enter Username with one dim list")
	public void enter_Username_with_one_dim_list(io.cucumber.datatable.DataTable dataTable) {
		WebElement c  = driver.findElement(By.xpath("//input[@name='username']"));
		base.button(c);
		List<String> List = dataTable.asList();
		String r = List.get(0);
		WebElement s = driver.findElement(By.xpath("//input[@name='username']"));
		base.inputKeys(s, r);

	}

	@When("user click the Next button")
	public void user_click_the_Next_button() {
	WebElement click = driver.findElement(By.xpath("//button[@class='styles__ButtonStyle-sekd9q-0 klTPPh styles__ButtonBig-sc-fj5lxd-7 dEVACi']"));
base.button(click);
	}

	
	@When("user seaching products")
	public void user_seaching_products() {

		WebElement cl = driver.findElement(By.name("q"));
		base.button(cl);

	}

	@When("user enter mobile  with one dim map")
	public void user_enter_mobile_with_one_dim_map(io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		String S2 = map.get("mobile1");
		WebElement pass = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		base.inputKeys(pass, S2);
	}

	@When("user click search button")
	public void user_click_search_button() {
		WebElement k = driver.findElement(By.xpath("//button[@type='submit']"));
	base.button(k);
	}

	

	// s4

	@When("user searching the mobile")
	public void user_searching_the_mobile(DataTable dataTable) {
		List<String> datas = dataTable.asList();
		WebElement user_search = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		base.button(user_search);
		user_search.sendKeys(datas.get(0), Keys.ENTER);
		WebElement w = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[last()]"));
		base.button(w);
		String pwin = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for (String x : allwin) {
			if (!x.equals(pwin)) {
				driver.switchTo().window(x);
			}
		}
	}

	@When("user click on add to cart")
	public void user_click_on_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		base.button(cart);
		WebElement v = driver.findElement(By.xpath("//span[text()='Add Item']"));
		base.button(v);
	}

	@Then("user should go to home page")
	public void user_should_go_to_home_page() {
		WebElement f = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		base.button(f);

	}

	@Then("navigate into cart and check order updated")
	public void navigate_into_cart_and_check_order_updated() {
		WebElement na = driver.findElement(By.xpath("//span[@role='button']"));
		base.button(na);

	}
}
