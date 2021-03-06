package G3Lectures;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_05_AlertHandling2 {
	
         static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			 driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			//Locator
			driver.findElement(By.name("proceed")).click();
			Thread.sleep(4000);
			
			//getAlertText();
			if (ElementUtil.getAlertText(driver).equals("Please enter a valid user name")) {
				System.out.println("Correct text:");
				
			}else{
				System.out.println("Incorrect text:");
			}
				driver.quit();
				System.out.println("Test completed");
			
			//Generic method (common methods)
//			public static String getAlertText(){
//				Alert alert = driver.switchTo().alert(); //memorize
//				alert.getText();
//				String text = alert.getText();
//				System.out.println(text);
//				return text;
				
			}
	}


