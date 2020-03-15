package pages;

import org.openqa.selenium.By;

import projectspecificMethods.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
     public ViewLead editDetails(String cName) {
    	 driver.findElement(By.id("updateLeadForm_companyName")).clear();
    	 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
    	 driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
    	 return new ViewLead();
	     
     }   

}
