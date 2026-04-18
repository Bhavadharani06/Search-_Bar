package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom_pages.CartPage;
import pom_pages.InventoryItemPage;
import pom_pages.InventoryPage;
import pom_pages.LoginPage;

public class Pages {
	//this class is used to initialize the pom classes
	public static LoginPage lp;
	public static InventoryPage ip;
	public static InventoryItemPage itp;
	public static CartPage cp;
	
	//this method are initialize all the pom class at once
	public static void loadAllPages(WebDriver driver) {
		lp=PageFactory.initElements(driver, LoginPage.class);
		ip=PageFactory.initElements(driver, InventoryPage.class);
		itp=PageFactory.initElements(driver, InventoryItemPage.class);
		cp=PageFactory.initElements(driver, CartPage.class);
	}
}
