package G3Lectures;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_15_TakeScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com");
		//this is srcFile
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// interview question
		FileUtils.copyFile(src, new File("/Users/marcelavinueza/Desktop/MarcelaPictures/marcela1.png"));
		driver.close();
		
		
	}

}
