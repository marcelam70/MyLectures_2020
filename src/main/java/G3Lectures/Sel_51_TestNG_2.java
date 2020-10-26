package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sel_51_TestNG_2 {
      public static WebDriver driver;
      ElementUtil elementUtil;
      
      //locators
      By email = By.id("username");
  	  By password = By.id("password");
  	  By loginBtn = By.id("loginBtn");
  	  By bodyText = By.xpath("//div[@class='private-alert__inner']/h5");
  	  
  	  // Before method
  	  @BeforeMethod
  	  public void setUp() throws InterruptedException{
  		driver =  ElementUtil.launchBrowser(driver, "chrome");
  		ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
  		Thread.sleep(5000);
  	  }
  	  @Test(priority=1,description="invalid credentials")
  	  public void invalidCredentials(){
  		  ElementUtil.getElement(driver, email).sendKeys("marcela@gmail.com");
  		  ElementUtil.getElement(driver, password).sendKeys("123test");
  		  ElementUtil.getElement(driver, loginBtn).click();
  		  String text = ElementUtil.getElement(driver, bodyText).getText();
  		  System.out.println(text);
  		Assert.assertEquals(text, "That email address doesn't exist.");
  	  }
  		
  	
  	  @AfterMethod
  	  public void tearDown(){
  		  driver.quit();
  	  }
  
}




