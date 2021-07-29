package StepDefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import PageObject.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class Steps {
	
public WebDriver driver;//Import global variable 
public LoginPage lp;


@Given("^user Lanuch Chrome browser$")
public void user_Lanuch_Chrome_browser()  {
	
	//
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\372262\\workspace\\Testing\\BDDTest\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    lp = new LoginPage(driver);
    
 
    
    
}

@When("^User Opens URL \"([^\"]*)\"$")
public void user_Opens_URL(String url) throws Throwable {
 
	driver.get(url);
	driver.manage().window().maximize();
	}

@When("^User enter Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
public void user_enter_Email_as_and_Password_as(String email, String password) throws Throwable {
  
	lp.setUserName(email);
	lp.setPassword(password);
	

}

@When("^clik on Login$")
public void clik_on_Login() throws Throwable {
    
	lp.clickLogin();
	
   
}

@Then("^Page Titel should be \"([^\"]*)\"$")
public void page_Titel_should_be(String exptitle) throws Throwable {
   
	String Actaltitle =driver.getTitle();
	
	if (driver.getPageSource().contains("Login was unsuccessful.")){
		driver.close();
		Assert.assertTrue(false);
		
	}
	else{
		Assert.assertEquals(exptitle, Actaltitle);
	}
   
}

@When("^User Click on Log out link$")
public void user_Click_on_Log_out_link() throws Throwable {
   lp.clicklogout();
   Thread.sleep(30000);
	
   
}

@Then("^Close browser$")
public void close_browser() throws Throwable {
  
	driver.quit();
  
}

}
