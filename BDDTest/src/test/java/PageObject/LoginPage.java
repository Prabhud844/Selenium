package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(xpath ="//input[@id='Email']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	@CacheLookup
	WebElement txtpaswrd;
	
	@FindBy(xpath ="//*[@class='button-1 login-button']")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath ="//*[@href ='/logout']")
	@CacheLookup
	WebElement lnklogout;
	
	public void setUserName(String unname){
		txtEmail.clear();
		txtEmail.sendKeys(unname);
		
	}
	
	public void setPassword(String pwd){
		txtpaswrd.clear();
		txtpaswrd.sendKeys(pwd);
		
	}
	
	public void clickLogin(){
		btnlogin.click();
	}
	
	public void clicklogout(){
		lnklogout.click();
		
	}
	
	
}
