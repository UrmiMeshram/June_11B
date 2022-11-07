package Flikart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="//span[text()='Testing']")
	private WebElement test;
	
	@FindBy(xpath="//a[text()='QA as your career']")
	private WebElement qateam;
	
	@FindBy(xpath="(//a[text()='Home'])[1]")
	private WebElement home;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void seacrchEle() {
		test.click();
	}
	
	public void qatutorial() {
		qateam.click();
	}
	
	public void homWindow() {
		home.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
