package FlipkartTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Flikart.Login;
import Flikart.guru99;


public class TestLogin {
	// Declare variables globally
	
	WebDriver driver;
	Login log;
	guru99 guru;
   
	@BeforeClass
	public void openBrowser() {
		
		 System.out.println("Before Class");
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\"
		 		+ "ChromeDriver\\chromedriver_win32\\ChromeDriver.exe");
		 
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.guru99.com/");
		 driver.manage().window().maximize();
		 
	}
	
	@BeforeMethod
	public void signIn() {
		 System.out.println("Before Method");
		 
		 log = new Login(driver);
		 log.seacrchEle();
		 log.qatutorial(); 
		 log.homWindow();
		 
		 guru = new guru99(driver);
		 guru.webtutorial();
		 guru.javatutorial();
		
	}
	
	@Test
	public void testFlip() {
		System.out.println("Testing Flipkart Application");
    }
	
	@AfterMethod
    public void afterFlip() {
	System.out.println("After Method");
	}
    
    @AfterClass
    public void close() {
    	System.out.println("Close the Browser");
    	driver.close();
    }
	
    
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


