package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_9_NameConcept {

	public static void main(String[] args) throws InterruptedException {
		
	      WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.get("http://the-internet.herokuapp.com/login");
	       
	       Thread.sleep(2000);
	       
	       //First usage
//	       WebElement usElement = driver.findElement(By.name("username"));
//	       usElement.sendKeys("marcelam70@yahoo.es");
	       
	       //Second usasge
	     //  driver.findElement(By.name("username")).sendKeys("marcelam70@yahoo.com");
	       
	       //Third usage
	       By username = By.name("username");
	       By pass = By.name("password");
	      // WebElement element = driver.findElement(username);
	      // element.sendKeys("jorgevin62@yahoo.com");;
	       
	       // Fourth usage
	       ElementUtil.getElement(driver, username).sendKeys("marcrlam70@yahoo.es");
	       ElementUtil.getElement(driver, pass).sendKeys("1234^%$");;

	}

}
