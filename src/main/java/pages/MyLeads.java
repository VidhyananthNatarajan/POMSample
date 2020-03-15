package pages;

import org.openqa.selenium.By;

import projectspecificMethods.ProjectSpecificMethods;

public class MyLeads extends ProjectSpecificMethods {
	
	public CreateLeadPage clickLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		//driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
		
	}

	public FindLeads clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeads();
	}
}
