package jan14;

import org.openqa.selenium.By;

public class MRSOutpatientPage extends MRSLaunchPage {

	public void testOutpatient() {
		driver.findElement(By.id("Outpatient Clinic")).click();
	}

}
