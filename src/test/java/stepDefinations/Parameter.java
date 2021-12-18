package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Parameter {
WebDriver driver;

@Given("^Initialize the browser with chrome$")
public void initialize_the_browser_with_chrome() {
	System.setProperty("webdriver.chrome.driver",
			"C://Users//Admin//eclipse-workspace//Cucumber//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().refresh();
}

	@And("^Navigate to OrangeHRMlive site$")
	public void navigate_to_orangehrmlive_site() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

	@Then("^User enters loginID (.+) and password (.+)$")
	public void user_enters_loginid_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	}

	@And("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Then("^Login Home page is displayed$")
	public void login_home_page_is_displayed() throws Throwable {
		driver.getTitle().equals("OrangeHRM");
	}

	@Then("^browser is closed$")
	public void browser_is_closed() throws Throwable {
		driver.quit();
	}
	
	
}
