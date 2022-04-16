package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddContactPage extends BasePage {

	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-country-container\"]") WebElement COUNTRY__ELEMENT;
	
	//li[contains(text(), 'United States')]
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}
	public void insertFullName(String fullname) {
		FULL_NAME_ELEMENT.sendKeys(fullname + generateRandomNo(999));
	}
	
	public void selectCompany(String company) {
		
		selectFromDropDown(COMPANY_NAME_ELEMENT, company);
	}
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(999) + email);
	}
	
	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + generateRandomNo(9999));
	}
	
//	public void selectCountry(String country) {
//		selectFromDropDown(COUNTRY__ELEMENT, country);
//	}
	public void clickCountry(String countryName) {
		COUNTRY__ELEMENT.click();
		WebElement COUNTRY_NAME_ELEMENT = driver.findElement(By.xpath("//li[contains(text(), '"+ countryName + "')]"));
		COUNTRY_NAME_ELEMENT.click();
	}
}
