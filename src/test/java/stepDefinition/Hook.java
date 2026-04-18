package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.AllFunctionality;
import utility.Base;
import utility.Pages;

public class Hook extends AllFunctionality {
	// call the driver Base using dependency injection -D1
	private Base b;

	public Hook(Base b) {
		this.b = b;
	}
	// this is DI

	// setup precondition
	@Before
	public void setUp() throws IOException {
		// read data from property file
		String URL = getPropertyKeyvalue("url");
		String USERNAME = getPropertyKeyvalue("username");
		String PASSWORD = getPropertyKeyvalue("password");
		// launch the browser
		b.driver = new EdgeDriver();
		configMaximizedBrowser(b.driver);
		implicit(b.driver);
		b.driver.get(URL);

		// initialize the pages
		Pages.loadAllPages(b.driver);

		// login
		Pages.lp.logintoApp(USERNAME, PASSWORD);
	}

	@After
	public void tearDown() {
		// Logout of Application
		Pages.ip.logout();
		b.driver.quit();
	}
}
