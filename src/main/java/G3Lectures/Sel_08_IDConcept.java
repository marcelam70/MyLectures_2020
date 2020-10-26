package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.util.logging.resources.logging;

public class Sel_08_IDConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //ChromeOptions --maximize
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//ID is a locator in DOM (HTML) id is unique element
		//First usage
//		WebElement userElement = driver.findElement(By.id("username"));
//		userElement.sendKeys("marcelam70@yahoo.es");
//		WebElement userPass = driver.findElement(By.id("password"));
//		userPass.sendKeys("12345&^%");
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		loginBtn.click();
		
		//Second usage
//		driver.findElement(By.id("username")).sendKeys("marcelam70@yahoo.es");
//		driver.findElement(By.id("password")).sendKeys("12345#@!");
//		 driver.findElement(By.id("loginBtn")).click();
		 
		 // Third usage
		 
		 By username = By.id("username");
		 By password = By.id("password");
		 By loginBtn = By.id("loginBtn");
		
//		 WebElement userElement = driver.findElement(username);
//		 userElement.sendKeys("marcelam70@yahoo.es");
		
		 // Fourth usage
		 ElementUtil.getElement(driver, username).sendKeys("marcelam70@yahoo.es");
		 ElementUtil.getElement(driver, password).sendKeys("test4321@");
		 ElementUtil.getElement(driver, loginBtn).click();

	}

}
