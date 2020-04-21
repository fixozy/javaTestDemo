package tests;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	
public class CleanTest {
	public WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
	}

    @Test
     public void validateHomepage()  {
    	
            // Open Page      
               driver.get("https://seleniumsandbox.godaddysites.com/");
            
               //Check for email sign up field label
               assertEquals("Email", driver.findElement(By.xpath("//label[@for='input4']")).getText());
               
    
          }
        
          @After
          public void tearDown() {
          driver.close();
}

}