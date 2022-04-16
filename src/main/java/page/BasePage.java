package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public int generateRandomNo(int boundaryNo) {
		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNo);
		return generatedNo;
	}
	
	public void selectFromDropDown(WebElement companyElement, String visibleText) {
		Select sel = new Select(companyElement);
		sel.selectByVisibleText(visibleText);
	}
}
