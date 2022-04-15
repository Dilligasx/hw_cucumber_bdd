package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HWLoginPage {

	public HWLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	WebDriver driver;
	// 
//	By username_field = By.xpath("//input[@type='text']");
//	By password_field = By.xpath("//input[@type='password']");
//	By signIn_field = By.xpath("//button[@class='btn btn-success block full-width']");
	
	@FindBy(how = How.XPATH, using = "//input[@type='text']")WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@type='password']")WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success block full-width']")WebElement SIGN_IN_FIELD;
	
	
	public void insertUsername(String username) {
		USERNAME_FIELD.sendKeys(username);
	}
	public void insertPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}
	public void clickSignIn() {
		SIGN_IN_FIELD.click();
	}

	public String getPageTitle() {
			return driver.getTitle();
	}
}
