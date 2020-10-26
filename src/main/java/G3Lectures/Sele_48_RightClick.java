package G3Lectures;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sele_48_RightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions actions = new Actions(driver);
		WebElement rightClickElement = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		actions.contextClick(rightClickElement).build().perform();

		WebElement copyElement = driver.findElement(By.className("context-menu-icon-copy"));
		String text = copyElement.getText();
		System.out.println(text);
		copyElement.click();
		
		
	}

}
