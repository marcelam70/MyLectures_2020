package G3Lectures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_01WebBasicWithChromeDriver {

	public static void main(String[] args) {
		//Set property
				System.setProperty("webdriver.chrome.driver","/Users/marcelavinueza/Documents/Drivers/chromedriver");
				
				//Setup browser
				WebDriver driver = new ChromeDriver();
				
				//launch browser
				//driver.get("https://siliconelabs.com/");
				driver.get("https://google.com/");
				
				//get title 
				 String title = driver.getTitle();
				 System.out.println(title);
				 
				 //Verify title
				 //if (title.equals("Homepage - SiliconeLabs")) {
					 if (title.equals("Google")) {
					 System.out.println("Correct title");	
				}else{
					System.out.println("Incorrect title");
				}
				String URL = driver.getCurrentUrl();
				System.out.println("Current URL:" + URL);
				
				//System.out.println(driver.getPageSource());
				//driver.close(); //close current browser
				driver.quit(); // close all browser
				

	}

}
