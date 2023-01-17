package jan14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRSLaunchPage {

	WebDriver driver = new ChromeDriver();

	public void launchBrowser() {

		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
	}

	public void loginInfo() {
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
	}

	public void loginClick() {
		driver.findElement(By.id("loginButton")).click();
	}

	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
	}

	public void closeBrowser() {
		driver.close();
	}
	
	public void homePage() {
		driver.findElement(By.className("icon-home")).click();
	}
	
	public void selectPatientRec() {
		driver.findElement(By.linkText("Find Patient Record")).click();
		homePage();
	}
	
	public void selectActiveVisit() {
		driver.findElement(By.linkText("Active Visits")).click();
		homePage();
	}
	
	public void selectRegisterPat() {
		driver.findElement(By.linkText("Register a patient")).click();
		homePage();
	}
	
	public void selectAppointment() {
		driver.findElement(By.linkText("Appointment Scheduling")).click();
		homePage();
	}
	
	public void selectVitals() {
		driver.findElement(By.linkText("Capture Vitals")).click();
		homePage();
	}
	
	public void selectReport() {
		driver.findElement(By.linkText("Reports")).click();
		homePage();
	}
	
	public void selectData() {
		driver.findElement(By.linkText("Data Management")).click();
		homePage();
	}
	
	public void selectMetadata() {
		driver.findElement(By.linkText("Configure Metadata")).click();
		homePage();
	}
	
	public void selectAdmin() {
		driver.findElement(By.linkText("System Administration")).click();
		homePage();
	}


	public static void main(String[] args) {

//		MRSLaunchPage obj = new MRSLaunchPage();

	}

}
