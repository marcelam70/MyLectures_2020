package G3Lectures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_07_NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","/Users/marcelavinueza/Documents/Drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com");
    
    //Navigate
    driver.navigate().to("https://www.ebay.com");
    Thread.sleep(2000);
    driver.navigate().back(); // amazon
    Thread.sleep(2000);
    driver.navigate().forward(); //ebay
    Thread.sleep(2000);
    driver.navigate().back(); //amazon
    Thread.sleep(2000);
    driver.navigate().refresh(); 
    driver.quit();
	}

}
