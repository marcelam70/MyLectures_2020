package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_06_AlertHandling3 {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		//URL
				String url = "https://mail.rediff.com/cgi-bin/login.cgi";
				
				//Locator
				By goBtn = By.name("proceed");
				
				//Launcher browser
				driver = ElementUtil.launchBrowser(driver, "chrome");
				
				//launch URL
				ElementUtil.launchURL(driver, url);
				
				// click on sing button
				ElementUtil.clickOn(driver, goBtn);
				
				// get title
				System.out.println(ElementUtil.getPageTitle(driver));
				ElementUtil.clickOn(driver, goBtn);
				
				Thread.sleep(2000);
				
				// handling alert
				String text = ElementUtil.getAlertText(driver);
				if (text.equals("Please enter a valid user name")) {
					System.out.println("Text is correct");
					
				}else{
					System.out.println("Text is incorrect");
				}
				//Close browser
			     ElementUtil.quitBrowser(driver);
					
				}
				
	          
			
	}


