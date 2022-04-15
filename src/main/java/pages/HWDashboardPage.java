package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HWDashboardPage {

	WebDriver driver;
	public HWDashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BANK_AND_CASH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")
	WebElement NEW_ACCOUNT_ELEMENT;




	public void clickOnBankAndCash() {
		BANK_AND_CASH_ELEMENT.click();
	}
	public void clickOnNewAccountAfterBankAndCash() {
		NEW_ACCOUNT_ELEMENT.click();
	}


}
