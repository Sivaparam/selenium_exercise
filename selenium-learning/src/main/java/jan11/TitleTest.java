package jan11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
				
			String title = "Amazon.com. Spend less. Smile more.";
				
			//launch chrome and driver to url provided
			driver.get("https://www.amazon.com/");
			
			//get the actual title
			String actualTitle = driver.getTitle();
				
			//compare the titles
			if(actualTitle.equalsIgnoreCase(title)) {
				System.out.println("Title test passed" + actualTitle + " : " + title);
			} else {
				System.out.println("Title test failed" + actualTitle + " : " + title);
			}
			
				
			//close browser
			driver.close();
				
		}
	}

