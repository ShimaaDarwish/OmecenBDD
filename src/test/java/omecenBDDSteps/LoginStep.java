package omecenBDDSteps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omecenBDDPages.LoginPage;
import omecenBDDWebDriverManager.BrowserFactory;
import omecenBDDWebDriverManager.FileReadManager;
import omecenBDDWebDriverManager.PageObjectManager;

public class LoginStep{
	WebDriver driver;
	BrowserFactory browserFactory;
	FileReadManager fileReadManager;
	PageObjectManager pageObjectManager;
	LoginPage loginPage;
	
	@Given("user open the application")
	public void user_open_the_application() {
		browserFactory = new BrowserFactory();
		driver=browserFactory.getDriver();
		//LoginPage lp=new LoginPage(driver);2323
		//lp.userName("admin");
	}
	
	@When("I enter valid userName and Password")
	public void i_enter_valid_user_name_and_password() {
		pageObjectManager= new PageObjectManager(driver);
		loginPage=pageObjectManager.getLoginPage();
		loginPage.userName("adimn");
	}
	
	@Then("I successfuly login")
	public void i_successfuly_login() {
		
	}
	
		
}
