package pom_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryItemPage {
	@FindBy(xpath = "")
	private WebElement addToCart;
	
	public WebElement getAddToCart() {
		return addToCart;
	}
}
