package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login;
import projectspecificMethods.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
@BeforeTest
public void setData() {
	fileName="CreateLead.xlsx";
}
	
@Test (dataProvider="fetchData")	
	public void createlead(String username,String password,String cname,String fName,String Lname) {
		new Login()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickLead()
		.entercompanyname(cname)
		.enterfirstname(fName)
		.enterlastname(Lname)
		.clickCreate()
		.verifyLeadCreation();
	}

}
