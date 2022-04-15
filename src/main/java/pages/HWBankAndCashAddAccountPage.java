package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.bytebuddy.agent.builder.AgentBuilder.RawMatcher.Conjunction;

public class HWBankAndCashAddAccountPage {

	WebDriver driver;


	public HWBankAndCashAddAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='account'][@name='account']")
	WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement INTERNET_BANKING_URL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@type='submit'][@class='btn btn-primary']")
	WebElement SUBMIT_BUTTON_ELEMENT;

	public void insertAccountTitle(String accTitle) {
		ACCOUNT_TITLE_ELEMENT.sendKeys(accTitle);
	}

	public void insertDescription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description);
	}

	public void insertInitialBalance(String initBalance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(initBalance);
	}

	public void insertAccountNumber(String accNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(accNumber);
	}

	public void insertContactPerson(String contactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson);
	}

	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone);
	}

	public void insertInternetBankingUrl(String url) {
		INTERNET_BANKING_URL_ELEMENT.sendKeys(url);
	}
	
	public void clickOnSubmitButton() {
		SUBMIT_BUTTON_ELEMENT.click();
	}

}
