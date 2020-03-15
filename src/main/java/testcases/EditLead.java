package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login;
import projectspecificMethods.ProjectSpecificMethods;

public class EditLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		fileName="EditLead.xlsx";
	}
	
	@Test(dataProvider="fetchData")
	public void editlead(String username, String password,String fName,String cName) {
		new Login()
		.enterUserName(username)
		.enterPassword(password)
        .clickLogin()
        .clickCRMSFA()
        .clickLeads()
        .clickFindLeads()
        .enterFirstName(fName)
        .clickFindLeads()
        .clickFirstresultinglead()
        .verifyTitle()
        .clickEditButton()
        .editDetails(cName)
        .confirmChange();
	}

}
