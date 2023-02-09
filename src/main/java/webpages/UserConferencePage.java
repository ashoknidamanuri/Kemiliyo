package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserConferencePage extends BaseTest {
	public  UserConferencePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath = "//a[contains(.,'Conference')]")
	WebElement Conference;
	@FindBy(xpath = "//button[contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(.,'Add')]")
	WebElement Add;
	@FindBy(xpath = "//h3[@class='box-title'][contains(.,'Manage Conference')]")
	WebElement Logo;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Name;
	@FindBy(xpath = "//input[@name='confno']")
	WebElement Number;
	@FindBy(xpath = "//input[@name='pin']")
	WebElement Adminpass;
	@FindBy(xpath = "//input[@name='apin']")
	WebElement Aapin;
	
}
