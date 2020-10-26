package G3Lectures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_45_HeadlessHTMLUnitDriver {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://siliconelabs.com");
		System.out.println(driver.getCurrentUrl());
	}

}
