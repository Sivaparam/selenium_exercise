package jan13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFormFill {
	
	WebDriver driver = new ChromeDriver();
	
	public void launchBrowser() {
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	}
	
	public void fillContact() {
		
		driver.findElement(By.name("firstName")).sendKeys("Ranjani");
		driver.findElement(By.name("lastName")).sendKeys("Jaya");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.id("userName")).sendKeys("abc@gmail.com");
		
	}
	
	public void fillMailing() {
		
		driver.findElement(By.name("address1")).sendKeys("abc street");
		driver.findElement(By.name("city")).sendKeys("Atlanta");
		driver.findElement(By.name("state")).sendKeys("GA");
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		
	}
	
	public void fillUser() {
		driver.findElement(By.id("email")).sendKeys("abc1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("confirmPassword")).sendKeys("password");
		
	}
	
	public void closeBrowser() {
		
		driver.close();
		
	}

	public static void main(String[] args) {
		
		SeleniumFormFill obj = new SeleniumFormFill();
		obj.launchBrowser();
		obj.fillContact();
		obj.fillMailing();
		obj.fillUser();
//		obj.closeBrowser();

	}

}
