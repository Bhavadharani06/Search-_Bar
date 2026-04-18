package pom_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {
	@FindBy(id = "react-burger-menu-btn")
	private WebElement burgerMenu;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement cartIcon;
	
	@FindBy(id = "logout_sidebar_link")
	private WebElement logoutBtn;
	
	public WebElement getBurgerMenu() {
		return burgerMenu;
	}
	
	public WebElement getCartIcon() {
		return cartIcon;
	}
	
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	//business logic 
	public void logout() {
		getLogoutBtn().click();
	}
	
	//dynamic xpath
	public void clickOnProduct(WebDriver d,String Productname) {
		d.findElement(By.xpath("//div[text()='"+Productname+"']")).click();
	}
}
