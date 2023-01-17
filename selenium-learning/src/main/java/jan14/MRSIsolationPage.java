package jan14;

import org.openqa.selenium.By;

public class MRSIsolationPage extends MRSLaunchPage {

	public void testIsolation() {
		driver.findElement(By.id("Isolation Ward")).click();
	}

}
