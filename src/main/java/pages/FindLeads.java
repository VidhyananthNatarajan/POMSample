package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import projectspecificMethods.ProjectSpecificMethods;

public class FindLeads extends ProjectSpecificMethods {
	
  public FindLeads enterFirstName(String fName) {
	  driver.findElement(By.id("ext-gen248")).sendKeys(fName);
	  
	  return this;
  }
  
  public FindLeads clickFindLeads() {
	  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	  return this;
  }
  
  public ViewLead clickFirstresultinglead() {
	  WebElement leadid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")));
	  leadid.click();
	  return new ViewLead();
  }
}
