package pages;

import org.openqa.selenium.By;

import projectspecificMethods.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyLeads clickLeads() {
	
	driver.findElement(By.linkText("Leads")).click();
	return new MyLeads();
	}

}
