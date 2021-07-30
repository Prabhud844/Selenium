package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstselenium {
	
	// System Property for Chrome Driver  
@Test	
public void test1() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\372262\\workspace\\Testing\\BDDTest\\Drivers\\chromedriver.exe");
	
    
    
    // Instantiate a ChromeDriver class.     
WebDriver driver=new ChromeDriver();  
 
  // Launch Website  
driver.navigate().to("http://www.javatpoint.com/");  
 
//Maximize the browser  
 driver.manage().window().maximize();  
 
 //Scroll down the webpage by 5000 pixels  
JavascriptExecutor js = (JavascriptExecutor)driver;  
js.executeScript("scrollBy(0, 5000)");   
 
// Click on the Search button  
driver.findElement(By.linkText("Core Java")).click(); 
System.out.println("Test Case One with Thread Id:- "
		+ Thread.currentThread().getId());

}

//
@Test	
public void test2() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\372262\\workspace\\Testing\\BDDTest\\Drivers\\chromedriver.exe");
	
    
    
    // Instantiate a ChromeDriver class.     
WebDriver driver=new ChromeDriver();  
 
  // Launch Website  
driver.navigate().to("http://www.javatpoint.com/");  
 
//Maximize the browser  
 driver.manage().window().maximize();  
 
  
 
// Click on the Python
driver.findElement(By.xpath("//a[@href='python-tutorial']/img")).click();
System.out.println("Test Case two with Thread Id:- "
		+ Thread.currentThread().getId());

}

@Test	
public void test3() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\372262\\workspace\\Testing\\BDDTest\\Drivers\\chromedriver.exe");
	
    
    
    // Instantiate a ChromeDriver class.     
WebDriver driver=new ChromeDriver();  
 
  // Launch Website  
driver.navigate().to("http://www.javatpoint.com/");  
 
//Maximize the browser  
 driver.manage().window().maximize();  
 
  
 
// Click on the java script
driver.findElement(By.xpath("//a[@href='javascript-tutorial']/img")).click();
System.out.println("Test Case three with Thread Id:- "
		+ Thread.currentThread().getId());

}

@Test	
public void test4() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\372262\\workspace\\Testing\\BDDTest\\Drivers\\chromedriver.exe");
	
    
    
    // Instantiate a ChromeDriver class.     
WebDriver driver=new ChromeDriver();  
 
  // Launch Website  
driver.navigate().to("http://www.javatpoint.com/");  
 
//Maximize the browser  
 driver.manage().window().maximize();  
 
  
 
// Click on the java script
driver.findElement(By.xpath("//a[@href='html-tutorial']/img")).click();;
System.out.println("Test Case four with Thread Id:- "
		+ Thread.currentThread().getId());

}


}
