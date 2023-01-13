package jan10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

	public static void main(String args[]) {
		System.out.print("Hi");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.macys.com/");
		driver.findElement(By.id("globalSearchInputField")).sendKeys("Levis Jeans");
		driver.findElement(By.id("globalSearchInputField")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("globalSearchInputField"));
		

	}
}