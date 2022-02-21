package omecenBDDPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

/*	//username
	@FindBy(how=How.NAME, using="username")private WebElement uName;// for example not working
	public WebElement userName (String enterYourName) {
		uName.sendKeys(enterYourName);
		return uName;
	}*/
	@FindBy(how=How.ID, using="signup_link") private WebElement sgnUplik;
	public WebElement getSignUpLink() {
		sgnUplik.click();
		return sgnUplik;
	}
	// here we chose an xpath (start with)
	@FindBy(how=How.XPATH, using="//input[starts-with(@id,'UserFirstName')]") private WebElement userFirstN;
	public WebElement firstName(String firstName) {
		userFirstN.sendKeys(firstName);
		return userFirstN;
	}
	
	@FindBy(how=How.XPATH, using="//input[starts-with(@id,'UserLastName')]") private WebElement userLastN;
	public WebElement lastName(String lastName) {
		userLastN.sendKeys(lastName);
		return userLastN;
	}
	
	@FindBy(how=How.XPATH, using="//input[starts-with(@id,'UserTitle')]") private WebElement jobTitle;
	public WebElement getjob(String job) {
		jobTitle.sendKeys(job);
		return jobTitle;
	}
	
	@FindBy(how=How.XPATH, using="//input[starts-with(@id,'UserEmail')]") private WebElement emailId;
	public WebElement getemail(String email) {
		emailId.sendKeys(email);
		return emailId;
	}
	@FindBy(how=How.XPATH, using="//input[starts-with(@id, 'UserPhone')]") private WebElement phoneN;
	public WebElement getPhone(String phone) {
		phoneN.sendKeys(phone);
		return phoneN;
	}
	@FindBy(how=How.XPATH, using="//select[@name='CompanyEmployees']") private WebElement employees;
	public WebElement getemployees() {
		employees.click();
		return employees;
	}
	@FindBy(how=How.XPATH, using="//option[@value='500']") private WebElement employeesN;
	public WebElement getemployeesN() {
		employeesN.click();
		return employeesN;
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='CompanyName']") private WebElement companyN;
	public WebElement getcompanyName(String companyName) {
		companyN.sendKeys(companyName);
		return companyN;
		
	}
	
	@FindBy(how=How.XPATH, using="//select[@name='CompanyCountry']") private WebElement countryN;
	public WebElement getcountryName() {
		countryN.click();
		return countryN;
	}
	@FindBy(how=How.XPATH, using="//option[@value='US']") private WebElement USAn;
	public WebElement getUSAname() {
		USAn.click();
		return USAn;
	}
	
	@FindBy(how=How.XPATH, using="//div[starts-with(@class,'checkbox')]") private WebElement iAgree;
	public WebElement getIAgree() {
		iAgree.click();
		return iAgree;
	}
	/*@FindBy(how=How.XPATH, using="//button[@type='submit']") private WebElement freeTrial;
	public WebElement getStartFreeTrail() {
		freeTrial.click();
		return freeTrial;
	}*/
}