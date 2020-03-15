package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import projectspecificMethods.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage entercompanyname(String cname) {
		WebElement companyName = driver.findElement (By.id("createLeadForm_companyName"));
	    companyName.sendKeys(cname);
	    return this;
		
	}
public CreateLeadPage enterfirstname(String fName) {
	 WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
     firstName.sendKeys(fName);
     return this;
     
		
	}
public CreateLeadPage enterlastname(String Lname) {
	WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
    lastName.sendKeys(Lname);
    return this;
	
}

public ViewLead clickCreate() {
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewLead();
}

}
