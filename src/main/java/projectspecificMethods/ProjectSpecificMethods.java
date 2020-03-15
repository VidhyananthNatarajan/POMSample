package projectspecificMethods;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utilities.DataDriven;

public class ProjectSpecificMethods {
	public String fileName;//storing the excel filename
	public WebDriver driver;

	public static WebDriverWait wait;
  @Parameters ({"browser","url"})	
  @BeforeMethod
  public void startup(String browser,String url){
	  
	     if (browser.equalsIgnoreCase("chrome")) {
	    	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		     driver = new ChromeDriver();
	       }
	     
	     if (browser.equalsIgnoreCase("firefox")) {
	    	 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver_64 bit.exe");
		     driver = new FirefoxDriver();
	       }
	    
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     wait=new WebDriverWait(driver, 40);
	     
	     driver.get(url);
	     driver.manage().window().maximize();
	   }
  
  @AfterMethod
   public void teardown() {
	  driver.close();
	  
  }
  
  @DataProvider(name ="fetchData")
  public Object[][] getData() throws IOException{
	  return DataDriven.readexcelData(fileName);
	}
}



