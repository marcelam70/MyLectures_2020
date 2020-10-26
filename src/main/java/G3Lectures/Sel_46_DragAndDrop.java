package G3Lectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_46_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(3000);
		
//actions.dragAndDrop(sourceElement, targetElement).build().perform(); // very important and easy to use
		actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		// Interview questions
		// actions 
		// .clickAndHold(sourceElement)
		// .moveToElement(targetelement)
		// .release()
		// .build()
		// .perform()

	}

}
