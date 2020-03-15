package pages;

import org.openqa.selenium.By;

import projectspecificMethods.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
