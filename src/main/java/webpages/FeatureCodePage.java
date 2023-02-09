package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FeatureCodePage extends BaseTest{
	public  FeatureCodePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'sipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(.,'Feature Code')]")
	WebElement Featurecode;
	@FindBy(xpath = "(//span[contains(.,'Feature Codes')])[1]")
	WebElement Logo;
	@FindBy(xpath = "//td[contains(.,'*72')]")
	WebElement Radioselect;
	@FindBy(xpath = "//button[contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(.,'Deactivate')]")
	WebElement Deactive;
	@FindBy(xpath = "//a[contains(.,'Activate')]")
	WebElement Active;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated Successfully!')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//a[@ng-show='statuss'][contains(.,'Activate')]")
	WebElement Activeclick;
	
	
	
	
	public String featurecode_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Featurecode.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		return logo;
		
	 }
	public String deactive_validation() throws InterruptedException {
		Thread.sleep(1000);
		Radioselect.click();
		Action.click();
		Deactive.click();
		String success = Updatesuccess.getText();
		
		return success;
		
	}
	public String active_validation() throws InterruptedException {
		Thread.sleep(5000);
		Radioselect.click();
		Action.click();
		Activeclick.click();
		String success = Updatesuccess.getText();
		
		return success;
		
	}

}
