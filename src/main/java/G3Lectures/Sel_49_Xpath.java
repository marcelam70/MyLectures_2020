package G3Lectures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_49_Xpath {

	public static void main(String[] args) {
	//	What is XPtah?
			//	- Xpath is defined XML path. It is a syntax or language for finding any element on the webpage using XML path expression.
				//What is syntax in xpath?
				// = select current node
				//tagname[@attribute='value']
				//span[@class='ilhan'] == relative
				//XPath Types
				//1- Absolute
				//2- Relative
				///html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1] == absolute
				//======= Basic XPath =============
				//input[@name='uid']
				//input[@type='text']
				//input[@onkeyup='validateuserid();']
				//input[@name='btnLogin']
				//input[@value='LOGIN']
		//		======== contains() ===============
				//It is used when the value of any attribute changes dynamically. == partial text
				//input[contains(@type, reset)]
				//input[contains(@type, 'sub')]
				//*[contains(@id, 'message')]
			//	============ or AND and =============
				//*[@type='submit' or @name='btnReset']
				//*[@type='submit' or @name='btnLogin']
				//*[@type='submit' and @name='btnLogin']
				//*[@type='submit' and @name='btnReset'] does not WORK
			//	========== starts-with ==========
				//*[starts-with(@id, 'message')]
			//	========== text() ===============
				//*[text()='UserID']
				//*[contains(text(), 'UserID')]
				//=========== following ===========
			//	it selects all elements in the document of the current node
				//*[@type='password']//following::input
				//*[@type='password']//following::input[1]
				//*[@type='password']//following::input[2]
			//	============= ancestor axis ==============
			//	The ancestor axis selects all ancestors (granparent, parent, ...) of the current node
				//*[text()='Testing']//ancestor::div
				//*[text()='Testing']//ancestor::div[1]
				//*[text()='Testing']//ancestor::div[2]
			//	============ child ==================
				//*[@id='java_technologies']//child::li
				//*[@id='java_technologies']//child::li[1]
				//*[@id='java_technologies']//child::li[2]
				//=========== preceding ===============
			//	It select all nodes that come before the current node
				//input[@type='submit']//preceding::td
				//input[@type='submit']//preceding::input
				//============ following-sibling ==========
				//input[@type='submit']//following-sibling::input
				//input[@type='submit']//following-sibling::input[1]
			//	============= parent ==================
				//*[@id='java_technologies']//parent::div
				//*[@id='java_technologies']//parent::div[1]
				//*[@id='java_technologies']//parent::div[2]
			//	============= self ================
			//	selects the current node or 'self' means it indicates the node itself
		// //input[@type='password']//self::input

	}

}
