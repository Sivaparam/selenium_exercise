package jan14;

import org.openqa.selenium.By;

public class MRSLaboratoryPage extends MRSLaunchPage {

	public void testLaboratory() {
		driver.findElement(By.id("Laboratory")).click();
	}

}
