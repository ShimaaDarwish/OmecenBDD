package omecenBDDSteps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import omecenBDDPages.LoginPage;
import omecenBDDWebDriverManager.BrowserFactory;
import omecenBDDWebDriverManager.FileReadManager;
import omecenBDDWebDriverManager.PageObjectManager;


public class LoginScenarioOutlineStep {
	WebDriver driver;
	BrowserFactory browserFactory;
	FileReadManager fileReadManager;
	PageObjectManager pageObjectManager;
	LoginPage loginPage;
	

@Given("validator open application")
public void validator_open_application() {
	browserFactory = new BrowserFactory();
	driver=browserFactory.getDriver();
	//LoginPage lp=new LoginPage(driver);2323
	//lp.userName("admin");
   
}

@When("validator enter {string} and enter {string} in the app")
public void validator_enter_and_enter_in_the_app(String userName, String password) {
	pageObjectManager= new PageObjectManager(driver);
	loginPage=pageObjectManager.getLoginPage();
	loginPage.userName(userName);
	loginPage.getPassWord(password);
  
}

@Then("validator click login button")
public void validator_click_login_button() {
	pageObjectManager= new PageObjectManager(driver);
	
	loginPage=pageObjectManager.getLoginPage();
	loginPage.getLogin();

}

@Then("validate successfully login message")
public void validate_successfully_login_message() {
	
	   String actualURL = "https://login.salesforce.com/";
       String expectedURL = driver.getCurrentUrl();
       System.out.println("Url is "+expectedURL);
       assertEquals(actualURL, expectedURL);
	   driver.quit();
    
  }
}
