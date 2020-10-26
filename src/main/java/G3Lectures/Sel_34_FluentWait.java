package G3Lectures;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Sel_34_FluentWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/marcelavinueza/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click Me - Fluent Wait')]")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(1)) // 500 milliseconds
				.ignoring(NoSuchMethodException.class);
		
		WebElement element = wait.until(new Function<WebDriver,WebElement>() {
               public WebElement apply(WebDriver driver){
            	   WebElement element = driver.findElement(By.id("demo"));
            	   String getTextpage = element.getText();
            	   if (getTextpage.equals("Software Testing Material - DEMO PAGE")) {
            		   System.out.println("Text: " + getTextpage);
            		   return element;
   	
				}else{
					System.out.println("Title is wrong...");
            	   return null;

				}
               }
	});
		}
	}
