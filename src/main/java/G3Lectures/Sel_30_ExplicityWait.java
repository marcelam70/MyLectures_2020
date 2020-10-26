package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_30_ExplicityWait {

	public static void main(String[] args) {
		// It works with webelement and non-webelement
		// It waits available in webdriverwait class
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		
		// non-element
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		System.out.println("Tilte is: " + driver.getTitle());
		By email = By.id("username");
		// element
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		WebElement username = driver.findElement(email);
		username.sendKeys("jake@gmail.com");
		
		System.out.println("title is:" + driver.getTitle());
	}

}
