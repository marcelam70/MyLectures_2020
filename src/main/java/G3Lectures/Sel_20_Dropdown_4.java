package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_20_Dropdown_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/marcelavinueza/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		selectDropdownByIndex(driver, day, 23);
		selectDropdownByIndex(driver, month, 12);
		selectDropdownByIndex(driver, year,14);
		

	}
	/**
	 * Visibe Text
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropdownByIndex(WebDriver driver, By locator, int index){
		WebElement element = getElement(driver, locator);
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * Get elemet
	 * @param driver
	 * @param locator
	 * @return
	 */
public static WebElement getElement(WebDriver driver, By locator){
	WebElement element = driver.findElement(locator);
	return element;
}

	}


