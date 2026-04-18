package pom_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	@FindBy(className = "inventory_item_name")
	private WebElement itemInfo;
	
	@FindBy(xpath = "//button[.='Remove']")
	private WebElement remove;
	
	public WebElement getItemInfo() {
		return itemInfo;
	}
	
	public WebElement getRemove() {
		return remove;
	}
	
	public String captureTextName() {
		return itemInfo.getText();
	}
}
