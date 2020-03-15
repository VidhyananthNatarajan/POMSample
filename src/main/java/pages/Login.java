package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import projectspecificMethods.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods {
	
	public Login enterUserName(String username) {
		
		WebElement username1 = driver.findElement(By.id("username"));
	    username1.sendKeys(username);
	    return this;
	}
	
	public Login enterPassword(String password) {
		WebElement password1 = driver.findElement(By.id("password"));
	    password1.sendKeys(password);
	    return this;
	}

	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		//HomePage hp = new HomePage();
	    //return hp;
		return new HomePage();
	} 
}
