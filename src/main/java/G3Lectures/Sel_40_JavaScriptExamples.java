package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_40_JavaScriptExamples {
	
	 By lowestTemp = By.xpath("//a[@class='day revealed']//span[@class='minTemp'][contains(text(),'77')]");
     By highestTemp = By.xpath("//span[@class='temp'][contains(text(),'89')]");
     
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://darksky.net/");
		//driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		// get title with JS
		String title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		//click with JS
	//	WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
//		JavaScriptUtil.clickElementByJS(signUpLink, driver);
//		Thread.sleep(2000);
	//	JavaScriptUtil.drawBorder(signUpLink, driver);
		
		//refresh with JS
	   // JavaScriptUtil.refreshBrowserByJS(driver);
		
		// generate alert 
		//JavaScriptUtil.generateAlert(driver, "This is sign up page");
		
		// send keys method
		
//		WebElement username = driver.findElement(By.id("username"));
//	    JavaScriptUtil.sendKeysUsingJSWithID(driver,"username", "marcela@yahoo.com");
//	    JavaScriptUtil.drawBorder(username, driver);
		
		// flash method with JS
//		WebElement username = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		
//		JavaScriptUtil.flash(username, driver);
//		username.sendKeys("marcela@gmail.com");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("123test");
//		JavaScriptUtil.flash(loginBtn, driver);
//		loginBtn.click();
		
		// inner text method
	//	System.out.println(JavaScriptUtil.getPageInnerText(driver));
		WebElement elemnt = driver.findElement(By.xpath("//span[contains(text(),'Today')]"));
		//elemnt.click();
		System.out.println(driver.findElement(By.xpath("//a[@class='day revealed']//span[@class='minTemp'][contains(text(),'77')]")));
		
		System.out.println(JavaScriptUtil.getBrowserInfo(driver));
		JavaScriptUtil.scrollPageDown(driver);
		
		JavaScriptUtil.specificScrollPageDown(driver);
		
		WebElement privacy = driver.findElement(By.xpath("//[@contains(tex(),'Privacy')]"));
		
		

	}

}

















