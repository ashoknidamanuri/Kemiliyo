package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage extends BaseTest {
	
	@FindBy(xpath = "//input[contains(@ng-model,'formdata.username')]")
	WebElement user;
	@FindBy(xpath = "//input[@type='password']")
	WebElement pass;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement submit;
	@FindBy(xpath = "//span[@class='hidden-xs'][contains(.,'Pjsipuser')]")
	WebElement Logo;
	
	public UserLoginPage(){
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public void login(String un, String pwd) throws InterruptedException{
		Thread.sleep(2000);
		//logo.getText();
		user.sendKeys(un);
		Thread.sleep(2000);
		pass.sendKeys(pwd);
		Thread.sleep(2000);
		submit.click();
		
	}
}