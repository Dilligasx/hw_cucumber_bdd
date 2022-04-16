package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {

	WebDriver driver;
	
	//GLOBAL DATA VARIABLES SHOULD BE HERE
	
	@Test
	public void validUSerShouldBeAbleToAddCustomer() {
		driver = BrowserFactory.init();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickSignInButton();
		
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();	
		dashboard.clickCustomerButton();
		dashboard.clickAddCustomerButton();
//		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "Dashboard" , "Wrong Page");
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		
		addContactPage.insertFullName("TEST NG");
		addContactPage.selectCompany("Techfios");
		addContactPage.insertEmail("testng@techfios.com");
		addContactPage.insertPhone("123-521-");
		addContactPage.clickCountry("Angola");
	}
	
	
}
