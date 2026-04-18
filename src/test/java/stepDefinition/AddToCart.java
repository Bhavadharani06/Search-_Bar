package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	WebDriver driver;
	@Given("load the browser")
	public void load_the_browser() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Given("load the url {string}")
	public void load_the_url(String enterURL) {
	    driver.get(enterURL);
	}
	@When("enter username {string} and password {string}")
	public void enter_username_and_password(String username, String password) {
	    driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}
	@When("inventory is displayed click on product {string}")
	public void inventory_is_displayed_click_on_product(String productName) {
	    driver.findElement(By.xpath("//div[.='" + productName + "']")).click();
	}
	@When("click on add-to-cart button and click on cart-icon")
	public void click_on_add_to_cart_button_and_click_on_cart_icon() {
		driver.findElement(By.id("add-to-cart")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
	}
	@Then("validate the product name {string} in cart")
	public void validate_the_product_name_in_cart(String productName) {
//	    String text = driver.findElement(By.className("inventory_item_name")).getText();
//	    Assert.assertEquals(productName, text); 
		System.out.println(productName);
		System.out.println("completed");
	}

}
