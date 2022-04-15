package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.HWAccountsListPage;
import pages.HWBankAndCashAddAccountPage;
import pages.HWDashboardPage;
import pages.HWLoginPage;
import pages.HWTestBase;

public class LoginAndCreateAccountStepDefinition extends HWTestBase {

	HWLoginPage loginPage;
	HWDashboardPage dashboardPage;
	HWBankAndCashAddAccountPage AddAccountPage;
	HWAccountsListPage accountsListPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, HWLoginPage.class);
		dashboardPage = PageFactory.initElements(driver, HWDashboardPage.class);
		AddAccountPage = PageFactory.initElements(driver, HWBankAndCashAddAccountPage.class);
		accountsListPage = PageFactory.initElements(driver, HWAccountsListPage.class);
	}
	
	@After 
	public void tearDown() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		driver.close();
//		driver.quit();
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String username) {
		loginPage.insertUsername(username);
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		loginPage.insertPassword(password);
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		loginPage.clickSignIn();
	}

	@Then("^User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
	}

	@When("User clicks on bank cash")
	public void user_clicks_on_bank_cash() {
		dashboardPage.clickOnBankAndCash();
	}

	@When("User clicks on new account")
	public void user_clicks_on_new_account() {
		dashboardPage.clickOnNewAccountAfterBankAndCash();
	}

	@Then("User enters accountTitle as {string} in accounts page")
	public void user_enters_account_title_as_in_accounts_page(String string) {
		AddAccountPage.insertAccountTitle(string);
	}

	@Then("User enters description as {string} in accounts page")
	public void user_enters_description_as_in_accounts_page(String string) {
		AddAccountPage.insertDescription(string);
	}

	@Then("User enters initialBalance as {string} in accounts page")
	public void user_enters_initial_balance_as_in_accounts_page(String string) {
		AddAccountPage.insertInitialBalance(string);
	}

	@Then("User enters accountNumber as {string} in accounts page")
	public void user_enters_account_number_as_in_accounts_page(String string) {
		AddAccountPage.insertAccountNumber(string);
	}

	@Then("User enters contactPerson as {string} in accounts page")
	public void user_enters_contact_person_as_in_accounts_page(String string) {
		AddAccountPage.insertContactPerson(string);
	}

	@Then("User enters Phone as {string} in accounts page")
	public void user_enters_phone_as_in_accounts_page(String string) {
		AddAccountPage.insertPhone(string);
	}

	@Then("User enters internetBankingURL as {string} in accounts page")
	public void user_enters_internet_banking_url_as_in_accounts_page(String string) {
		AddAccountPage.insertInternetBankingUrl(string);
	}

	@Then("User clicks on submit")
	public void user_clicks_on_submit() {
		AddAccountPage.clickOnSubmitButton();
	}

	@SuppressWarnings("deprecation")
	@Then("User should be able to validate account created succesfully and delete")
	public void user_should_be_able_to_validate_account_created_succesfully_and_delete() {
		// //tr/td[contains(text(),'Personal checking.zia')]/following-sibling::td[1]/a[3]   THIS FINDS THE DELETE BUTTON CORRESPONDING TO THE FIRST ACCOUNT CREATED WITH THIS CODE 

		Assert.assertEquals("Accounts- iBilling", loginPage.getPageTitle());
		
		accountsListPage.verifyCreatedAccount();
		accountsListPage.deleteCreatedAccount();
		
	}

}
