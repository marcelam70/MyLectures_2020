package G3Lectures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_43_HeadlesChromeOptions {

	public static void main(String[] args) {
		// you can execute your test case without browser
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://siliconelabs.com");
		
		System.out.println(driver.getTitle());

	}

}
