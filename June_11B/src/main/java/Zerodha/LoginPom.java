package Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPom {
	
    @FindBy(xpath="//input[@id='userid']")
    private WebElement username;
    
    @FindBy(xpath="//input[@type='password']")
    private WebElement password;
    
    @FindBy(xpath="//button[@type='submit']")
    private WebElement submit;
    
    public LoginPom(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void UN() {
    	username.sendKeys("EKO930");
    }
	
    public void Pass() {
    	password.sendKeys("Kunal@123");
    }
    
    public void login() {
    	submit.click();
    }
}


