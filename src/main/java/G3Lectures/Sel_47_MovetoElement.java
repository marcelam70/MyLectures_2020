package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_47_MovetoElement {

	public static void main(String[] args) {
	
           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           
            driver.get("https://www.verizonwireless.com/");
            
            WebElement phoneMenu = driver.findElement(By.xpath("//button[contains(text(),'Phones list')]"));
            
           System.out.println(driver.getTitle());
            Actions actions = new Actions(driver);
            actions.moveToElement(phoneMenu).build().perform();
           By smartPhone = By.id("thirdLevel00");
           WebElement locator = driver.findElement(smartPhone);
           locator.click();

	}

}
