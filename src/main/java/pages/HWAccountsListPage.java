package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HWAccountsListPage {

	WebDriver driver;

	public HWAccountsListPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//tr/td[contains(text(),'Personal checking.zia')]")
	WebElement CREATED_ACCOUNT_FIELD;
	@FindBy(how = How.XPATH, using = "//tr/td[contains(text(),'Personal checking.zia')]/following-sibling::td[1]/a[3]")
	WebElement CREATED_ACCOUNT_DELETE_BUTTON_FIELD;
	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'OK')]")
	WebElement ALERT_OK_FIELD;
	
	String description;

	public void verifyCreatedAccount() {
		description = "Personal checking.zia";
		if (CREATED_ACCOUNT_FIELD.getText().equals(description)) {
			System.out.println("The created account is verified and will now be deleted.");
		} else {
			System.out.println("The created account could not be verified");
		}
	}

	public void deleteCreatedAccount() {
		CREATED_ACCOUNT_DELETE_BUTTON_FIELD.click();
		ALERT_OK_FIELD.click();
		System.out.println("The account was deleted");
	}

	public String getAccountsListPageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();

	}

}
