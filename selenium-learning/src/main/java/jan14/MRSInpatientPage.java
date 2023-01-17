package jan14;

import org.openqa.selenium.By;

public class MRSInpatientPage extends MRSLaunchPage {

	public void selectInpatient() {
		driver.findElement(By.id("Inpatient Ward")).click();
	}
	
}
