package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webpages.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(xpath = "//img[@src='images/vitel-logo.png']")
	WebElement logo;
	//@FindBy(xpath="//input[@placeholder='Username']")
	@FindBy(xpath = "//input[@ng-model='formdata.username']")
	WebElement user;
	//@FindBy(xpath="//input[@placeholder='Password']")
	@FindBy(xpath = "//input[@ng-model='formdata.password']")
	WebElement pass;
	//@FindBy(xpath="//button[@class='btn btn-lg btn-primary btn-block']")
	@FindBy(xpath = "(//button[contains(@type,'submit')])[1]")
	WebElement submit;

	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public void login(String un, String pwd) throws InterruptedException{
		Thread.sleep(1000);
		//logo.getText();
		user.sendKeys(un);
		Thread.sleep(1000);
		pass.sendKeys(pwd);
		Thread.sleep(1000);
	    submit.isDisplayed();
		submit.click();
		
		
	}
}

