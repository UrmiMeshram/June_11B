package TestZerodha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Zerodha.LoginPom;


public class TestPom {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver_win32\\ChromeDriver.exe");
			
//		 ChromeOptions option = new ChromeOptions();   
//		 option.addArguments("--disable-notifications");   
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/?next=%2Forders%2Fipo");
		
		LoginPom log = new LoginPom(driver);
		log.UN();
		log.Pass();
		log.login();
		
	}


}
