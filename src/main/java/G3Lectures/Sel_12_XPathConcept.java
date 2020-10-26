package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_12_XPathConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //ChromeOptions --maximize
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
//		WebElement userElement = driver.findElement(By.xpath("//input[@id='username']"));
//		userElement.sendKeys("jorgevin62@yahoo.com");
//		WebElement userEl = driver.findElement(By.xpath("//input[@id='password']"));
//		userEl.sendKeys("1234@#");
//		WebElement loginBt = driver.findElement(By.xpath("//input[@id='loginBtn']"));
//		loginBt.click();
		
		By userElemt = By.xpath("//input[@id='username']");
		By userEl  = By.xpath("//input[@id='password']");
		By loginBtn = By.xpath("//input[@id='loginBtn']");
		ElementUtil.getElement(driver, userElemt).sendKeys("marcelam70@yahoo.es");
		ElementUtil.getElement(driver, userEl).sendKeys("1234@@@!");
		ElementUtil.getElement(driver,loginBtn).click();
  

	}

}
