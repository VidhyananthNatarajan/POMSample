package pages;

import org.openqa.selenium.By;

import projectspecificMethods.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods {
	
	public void verifyLeadCreation() {
		
	String expectedTitle ="View Lead | opentaps CRM";
	String actualTitle = driver.getTitle();
    System.out.println("The title of the page is:" +actualTitle);
    if (actualTitle.equals(expectedTitle)) {
   	 System.out.println("Test case passed");
    }
   	 else {
   		 System.out.println("Test case Failed");
   	 }
      
    }
	
	public ViewLead verifyTitle() {
		String expectedTitle ="View Lead | opentaps CRM";
		String actualTitle = driver.getTitle();
	    System.out.println("The title of the page is:" +actualTitle);
	    if (actualTitle.equals(expectedTitle)) {
	   	 System.out.println("View Lead Page opened successfully");
	    }
	    else {
	    	System.out.println("View Lead Page is not opened");
	    }
	    	
		return this;
	}
	
	public EditLeadPage clickEditButton() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	
		return new EditLeadPage();
				
	}
	
	public void confirmChange() {
		String expectedcomp ="Company";
		String actualcomp= driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    if (actualcomp.contains(expectedcomp)) {
	    	 System.out.println("Company Name changed successfully.");
	     }
	}
	
	


}
