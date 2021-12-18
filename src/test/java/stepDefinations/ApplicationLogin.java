package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


/*public class ApplicationLogin {
WebDriver driver;
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() {
		System.setProperty("webdriver.chrome.driver","C://Users//Admin//eclipse-workspace//Cucumber//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().refresh();
	}
	   
	@Given("^Navigate to OrangeHRMlive site$")
	public void navigate_to_OrangeHRMlive_site() {
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   
    }

@Then("^User enters loginID  \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_loginID_and_password(String username, String password)  {
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	    
	}

	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button()  {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	   
	}

	@Then("^Login Home page is displayed$")
	public void login_Home_page_is_displayed() {
	   driver.getTitle().equals("OrangeHRM");
		}
	
	@Then("^browser is closed$")
	public void browser_is_closed()
	{
	   driver.quit();
	}

}
*/
