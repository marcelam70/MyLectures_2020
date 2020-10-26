package G3Lectures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_02_WebDriverWithFirefoxDriver {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","/Users/marcelavinueza/Documents/Drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com/");
		
		//get title 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 //Verify title
		 
			 if (title.equals("Google")) {
			 System.out.println("Correct title");	
		}else{
			System.out.println("Incorrect title");
		}
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL:" + URL);
		
		
		//driver.close(); //close current browser
		driver.quit(); // close all browser


	}

}
