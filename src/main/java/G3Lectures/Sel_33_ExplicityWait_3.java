package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_33_ExplicityWait_3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		getElement(driver, email, 2).sendKeys("lucas@gmail.com");
		getElement(driver, password, 1).sendKeys("123%$#");
		getElement(driver, loginBtn, 2).click();

	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator, int timeout){
		waitForPresenceOfElement(driver, locator, timeout);
		WebElement element = driver.findElement(locator);
		return element;
	}
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param timeout
	 */
public static void waitForPresenceOfElement(WebDriver driver, By locator, int timeout){
	WebDriverWait wait = new WebDriverWait(driver, timeout);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}
 }

