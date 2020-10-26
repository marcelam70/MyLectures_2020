package G3Lectures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_03_WebdriverManager {

	public static void main(String[] args) {
//		WebDriverManager.firefoxdriver().setup();
//	WebDriver driver = new FirefoxDriver();
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://learnsdet.com");
	}

}
