package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTestBase {

	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void initDriver() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//		driver.get("https://techfios.com/billing/?ng=admin/");
	}
}
