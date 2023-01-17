package jan14;

import org.openqa.selenium.By;

public class MRSPharmacyPage extends MRSLaunchPage {

	public void testPharmacy() {
		driver.findElement(By.id("Pharmacy")).click();
	}

}
