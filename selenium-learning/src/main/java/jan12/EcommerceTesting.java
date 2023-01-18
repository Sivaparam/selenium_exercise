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
	public void launchBrowser() throws InterruptedException {
		//navigate to gap.com home page
		driver.get("https://www.gap.com/");	
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.className("sitewide-9pwq9q"));
		if(ele != null)
			ele.click();
		else
			System.out.println("popup button is null");

	}
	
	public void searchProduct() throws InterruptedException {
		
		Thread.sleep(1000);
		
		//search for product and press enter
		driver.findElement(By.name("searchText")).sendKeys("Womens Dress");
		driver.findElement(By.name("searchText")).sendKeys(Keys.ENTER);
		
	}
	
	public void addToCart() throws InterruptedException {
		
		Thread.sleep(1000);
		
	//get list of items displayed and iterator for product
		List<WebElement> allProducts = driver.findElements(By.className("css-1ohx80u"));
		//get the select items from list (index starts with 0)
		WebElement prod = allProducts.get(0);
		//click on the item
		prod.click();
		
		//select size
		
		Thread.sleep(3000);
		driver.findElement(By.className("promoDrawer__handlebar__icon")).click();
		driver.findElement(By.id("variant-1-sizeDimension1-L")).click();
		
		//click add to bag
		driver.findElement(By.id("AddToBagFromBuyBox_add-to-bag__button")).click();
		
		
// quick add to cart 
//		WebElement addToBag = prod.findElement(By.id("cat-product-image-440624002"));
//		if(addToBag !=null)
//			addToBag.click();
//		else
//			System.out.println("Add to bag button is null");
	
		
	}
	
	public void checkOut() throws InterruptedException {
		
		//click on checkout button from the pop up
		Thread.sleep(2000);
		driver.findElement(By.id("checkoutButton")).click();
		
		//click on checkout button from the checkout page
		driver.findElement(By.id("checkout-button")).click();
		
		//click on continue as guest
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		buttons.get(1).click();
		//enter the email address
		driver.findElement(By.id("verify-account-email")).sendKeys("abc@gmail.com");
		driver.findElement(By.className("loyalty-guest-signin-button cb_fixed-button-primary css-0")).click();
		
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


