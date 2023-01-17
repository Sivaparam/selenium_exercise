package jan14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRSRegistrationPage extends MRSLaunchPage {

	public void testRegistrationDesk() {
		driver.findElement(By.id("Registration Desk")).click();
	}

}
