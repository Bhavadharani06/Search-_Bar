package pom_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id = "user-name")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login-button")
	private WebElement loginBtn;
	
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//business logic
	public void logintoApp(String un, String pw) {
		userName.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();
	}
}
