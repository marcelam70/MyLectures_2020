package G3Lectures;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sel_04_AlertHandling1 {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Locator
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(4000);
		
		//To handle alert in selenium we will use alert interface
		Alert alert = driver.switchTo().alert(); //memorize
		alert.getText();
		String text = alert.getText();
		System.out.println(text);
		
		//Verification
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct text:" + text);
			
		}else{
			System.out.println("Incorrect text:" + text);
		}
		
		//alert.accept();
		alert.dismiss();
		
		//driver.quit();
		driver.close();
		System.out.println("Test completed");
		
		
	}

}
