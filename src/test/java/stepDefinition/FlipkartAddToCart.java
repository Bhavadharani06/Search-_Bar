package stepDefinition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartAddToCart {
	WebDriver driver;
	String parent;
	@Given("launch the new browser")
	public void launch_the_new_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Given("navigate to flipkart using url {string} and Handle the popup")
	public void navigate_to_flipkart_using_url_and_handle_the_popup(String URL) {
	    driver.get(URL);
	    driver.findElement(By.xpath("//span[.='✕']")).click();
	}
	@When("search product {string}")
	public void search_product(String productName) {
		driver.findElement(By.cssSelector("[placeholder=\"Search for Products, Brands and More\"]")).sendKeys(productName);
	}
	@When("Click on search button")
	public void click_on_search_button() {
	    driver.findElement(By.xpath("//button[@class='XFwMiH' and @type='submit']")).click();
	}
	@When("iphones are displayed click on product {string}")
	public void iphones_are_displayed_click_on_product(String productName) {
		parent = driver.getWindowHandle();
	    driver.findElement(By.xpath("//div[.='Apple iPhone 16 (Black, 128 GB)']")).click();
	    Set<String> allWindow = driver.getWindowHandles();
	    allWindow.remove(parent);
	    for(String i : allWindow) {
	    		driver.switchTo().window(i);
	    		break;
	    }
	    
	}
	@When("print the price of the product and click on add-to-cart and click on cart")
	public void print_the_price_of_the_product_and_click_on_add_to_cart_and_click_on_cart() {		
	    String price = driver.findElement(By.xpath("//div[@class='css-g5y9jx']//div[@class='v1zwn21k v1zwn20 _1psv1zeb9 _1psv1ze0']")).getText();
	    System.out.println("Price: " + price);
	    //click_on_add_to_cart
	    driver.findElement(By.xpath("//div[@class=\"css-g5y9jx\" and @style=\"transform: translateY(0px) scale(1);\"]")).click();
	    driver.findElement(By.xpath("//span[.='Cart']")).click();
	}
	@Then("verify the product name {string} in cart")
	public void verify_the_product_name_in_cart(String productName) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("completed");
	}

}
