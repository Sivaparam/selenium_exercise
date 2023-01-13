package jan12;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceTesting {
	
	WebDriver driver = new ChromeDriver();
	
	//method to launch browser
	public void launchBrowser() {
		//navigate to gap.com home page
		driver.get("https://www.gap.com/");	
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.className("sitewide-9pwq9q"));
		if(ele != null)
			ele.click();
		else
			System.out.println("popup button is null");

	}
	
	public void searchProduct() throws InterruptedException {
		
		Thread.sleep(2000);
		
		//search for product and press enter
		driver.findElement(By.name("searchText")).sendKeys("Womens Dress");
		driver.findElement(By.name("searchText")).sendKeys(Keys.ENTER);
		
	}
	
	public void addToCart() throws InterruptedException {
		
		Thread.sleep(2000);
		
	//get list of items displayed and iterator for product
		List<WebElement> allProducts = driver.findElements(By.className("css-1ohx80u"));
		WebElement prod = allProducts.get(1);
		prod.click();
		
		
// quick add to cart 
//		WebElement addToBag = prod.findElement(By.id("cat-product-image-440624002"));
//		if(addToBag !=null)
//			addToBag.click();
//		else
//			System.out.println("Add to bag button is null");
	
		
	}
	
	public void checkOut() {
		
	}
	
	//method to close browser
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		EcommerceTesting obj = new EcommerceTesting();
		obj.launchBrowser();
		obj.searchProduct();
		obj.addToCart();
		obj.checkOut();
		obj.closeBrowser();
		
		
	}

}


