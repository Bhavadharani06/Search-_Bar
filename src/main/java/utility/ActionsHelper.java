package utility;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
	WebDriver driver;
	Actions act;
	public ActionsHelper(WebDriver driver) {
		this.driver = driver;
		act=new Actions(driver);
	}
	
	//MoveToElement and click
	public void clickOnElement(WebElement element) {
		act.moveToElement(element).click().perform();
	}
	
	public void navigateDownDropdown(WebElement element, long timeInSec, int downArrowIndex) {
//		act.click(element).pause(3000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).perform();
		act.click(element).pause(Duration.ofSeconds(timeInSec)).perform();
		for(int i = 1; i <= downArrowIndex; i++) {
			act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		}
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}
	
	public void scrollDownAutoSuggestion(String text, WebElement element, long timeInSec,int downArrowIndex) {
		act.sendKeys(element, text).pause(Duration.ofSeconds(timeInSec));
		for(int i = 1; i <= downArrowIndex; i++) {
			act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		}
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}
	
}
