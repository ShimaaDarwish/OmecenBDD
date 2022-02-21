package omecenBDDSteps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omecenBDDPages.RegistrationPage;
import omecenBDDWebDriverManager.BrowserFactory;
import omecenBDDWebDriverManager.FileReadManager;
import omecenBDDWebDriverManager.PageObjectManager;

public class RegistrationStep {
	WebDriver driver;
	BrowserFactory browserFactory;
	FileReadManager fileReadManager;
	PageObjectManager pageObjectManager;
	RegistrationPage registrationPage;

	
	@Given("tester open application")
	public void tester_open_application() {
		System.out.println("Hello");
		browserFactory = new BrowserFactory();
		driver=browserFactory.getDriver();
	}

	@When("tester fillup registration page")
	public void tester_fillup_registration_page() {
		pageObjectManager = new PageObjectManager(driver);
		registrationPage = pageObjectManager.getRegistrationPage();
		registrationPage.getSignUpLink();
		registrationPage.firstName("Shimaa");
		registrationPage.lastName("Darwish");
		registrationPage.getjob("SoftwareTester");
		registrationPage.getemail("Shimaa@email.com");
		registrationPage.getPhone("1234567891");
		registrationPage.getemployees();
		registrationPage.getemployeesN();
		registrationPage.getcompanyName("ABCCompany");
		registrationPage.getcountryName();
		registrationPage.getUSAname();
		registrationPage.getIAgree();
		//registrationPage.getStartFreeTrail();
		
		
	}

	@Then("tester validate success messeage")
	public void tester_validate_success_messeage() {
		
	}
}
