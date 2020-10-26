package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_14_LoginPage {
	public static WebDriver driver;
	static By email = By.id("username");
	static By password = By.xpath("//input[@id='password']");
	static By loginBtn = By.cssSelector("#loginBtn");

	public static void main(String[] args) throws InterruptedException {
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		ElementUtil.getElement(driver, email).sendKeys("jorgevin62@yahoo.com");
		Thread.sleep(2000);
		ElementUtil.getElement(driver, password).sendKeys("test12345");
		Thread.sleep(2000);
		ElementUtil.getElement(driver, loginBtn).click();
		Thread.sleep(2000);
		ElementUtil.quitBrowser(driver);







	}		
}
