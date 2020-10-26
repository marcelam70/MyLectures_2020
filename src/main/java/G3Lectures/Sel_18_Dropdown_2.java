package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_18_Dropdown_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/marcelavinueza/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
	}
	/**
	 * selectbyvisibletext
	 * @param element
	 * @param value
	 */
	public static void selectDropdownValueByText(WebElement element,String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	/**
	 * index
	 * @param element
	 * @param index
	 */
	public static void selectDropdownByIndex(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
