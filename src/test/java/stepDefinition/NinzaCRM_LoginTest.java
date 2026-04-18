package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NinzaCRM_LoginTest {
	WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Given("Navigate to NinzaCRM application")
	public void navigate_to_ninza_crm_application() {
	    driver.get("http://49.249.28.218:8098/");
	}
	@When("enter username and password for login")
	public void enter_username_and_password_for_login() {
	    driver.findElement(By.id("username")).sendKeys("rmgyantra");
	    driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	}
	@When("click on login button for ninzaCRM")
	public void click_on_login_button_for_ninza_crm() {
	   driver.findElement(By.cssSelector("[type='submit']")).click();
	   driver.switchTo().alert().accept();
	}
	
	@When("click on create campaign")
	public void click_on_create_campaign() {
	    driver.findElement(By.className("btn btn-info")).click();
	}
	@When("enter campaign name and target size")
	public void enter_campaign_name_and_target_size() {
	    driver.findElement(By.name("campaignName")).sendKeys("BOOOBOO");
	    driver.findElement(By.name("targetSize")).sendKeys("3");
	}
	@When("click on submit button")
	public void click_on_submit_button() {
	    driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	@Then("verify campaign name")
	public void verify_campaign_name() {
	    
	}
	@When("click on user profile")
	public void click_on_user_profile() {
	    driver.findElement(By.xpath("//div[@class='user-icon-container']//div[@class='user-icon']")).click();
	}
	@When("click on Logout button")
	public void click_on_logout_button() throws InterruptedException {
		// Locate profile icon
		WebElement profile = driver.findElement(By.xpath("//div[@class='user-profile']")); 
		// (Change XPath based on your DOM)

		// Create Actions object
		Actions actions = new Actions(driver);

		// Hover on profile
		actions.moveToElement(profile).perform();

		// Wait a bit (important for dropdown to appear)
		Thread.sleep(2000);

		// Now click logout
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
	}
}
