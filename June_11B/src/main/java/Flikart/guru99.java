package Flikart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99 {
	
	@FindBy(xpath="//span[text()='Web']")
	private WebElement web;
	
	@FindBy(xpath="//span[text()='What is Java?']")
	private WebElement java;
	
	public guru99(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void webtutorial() {
		web.click();
	}
	
	public void javatutorial() {
		java.click();
	}
	
	
}









