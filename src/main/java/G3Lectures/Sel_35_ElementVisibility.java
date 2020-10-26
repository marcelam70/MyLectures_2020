package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_35_ElementVisibility {

	public static void main(String[] args) {
		// isDisplay-->boolean value return true or false
		// isEnable
		// isSelected
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://classic.crmpro.com/register");
    WebElement submitElement = driver.findElement(By.id("submitButton"));
	

	System.out.println("Before submit button is enable");
	System.out.println(submitElement.isDisplayed()); //true
	System.out.println(submitElement.isEnabled()); //false
	
	
	//System.out.println("29 line is " + driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected());

	System.out.println("29 line is " + driver.findElement(By.name("agreeTerms")).isSelected());
	
	//driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
	driver.findElement(By.name("agreeTerms")).click();
	System.out.println("33 line is " + driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected());
	System.out.println("********");
	
	System.out.println("After submit button is enable");
	System.out.println(submitElement.isDisplayed());
	System.out.println(submitElement.isEnabled());
	
	}

}
