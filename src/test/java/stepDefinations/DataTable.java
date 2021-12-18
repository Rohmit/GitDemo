package stepDefinations;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataTable {
	WebDriver driver;

	@Given("^User is in OrangeHRM Login Application$")
	public void user_is_in_OrangeHRM_Login_Application() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Admin//eclipse-workspace//Cucumber//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	/*@Then("^User enters the userID and password$")
	public void user_enters_the_userID_and_password() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	}
*/
@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^navigate to PIM section$")
	public void navigate_to_PIM_section() throws Throwable {
		WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions act = new Actions(driver);
		act.moveToElement(PIM).click().build().perform();
	}

	@Then("^click on Add Employee$")
	public void click_on_Add_Employee() {
		driver.findElement(By.id("menu_pim_addEmployee")).click();
	}

	@Then("^enter firstname and last name$")
	public void enter_firstname_and_last_name() {
		driver.findElement(By.id("firstName")).sendKeys("Rohit");
		driver.findElement(By.id("lastName")).sendKeys("Mahto");
	}

	@Then("^click on save button$")
	public void click_on_save_button() throws Throwable {
		driver.findElement(By.id("btnSave")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
	
}
