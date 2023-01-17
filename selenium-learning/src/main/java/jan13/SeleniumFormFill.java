package jan13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
		
		//xpath to get all drop down web elements
		WebElement countryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
		
		//Select class allows to get the drop down values from web element
		Select dropDown = new Select(countryDropDown);
//		dropDown.selectByIndex(1);
		dropDown.selectByValue("UNITED STATES");
		//dropDown.selectByVisibleText("AUSTRALIA");
		//dropDown.selectByValue("ARGENTINA");
		
		//Action class -- to perform mouse actions
		
//		Actions actionObj = new Actions(driver);
		
//		//to right click on an object 
//		actionObj.contextClick();
		
//		//to right click on specific element, get the element and then pass it to contextclick
//		WebElement dropdown = driver.findElement(By.name("country"));
//		actionObj.contextClick(dropdown);
		
		//to double click 
//		actionObj.doubleClick();
		
		
		//to work on pop up or alert, 
		//to cancel an alert
		//driver.switchTo().alert().dismiss();
		
		//to accpet an alert
//		driver.switchTo().alert().accept();
		
		//get text from alert, the return type of this is a string
//		String s = driver.switchTo().alert().getText();
		
		//to send a value to pop up/alert
//		driver.switchTo().alert().sendKeys("Text");
		
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
