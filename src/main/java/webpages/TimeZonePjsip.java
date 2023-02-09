package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TimeZonePjsip extends BaseTest {
	public  TimeZonePjsip(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'pjsipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(.,'TimeZone')]")
	WebElement Timezone;
	@FindBy(xpath = "//h1[contains(.,'Timezone')]")
	WebElement Logo;
	@FindBy(xpath = "//select[@ng-model='tzone.timezone']")
	WebElement Timezonefield;
	@FindBy(xpath = "//button[contains(.,'Go!')]")
	WebElement Go;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Timezone Updated successfully')]")
	WebElement Timezonesuccess;
	
	
	
	public String timezone_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("pjsipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Timezone.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		return logo;
		
	 }
	public String add_timezone() throws InterruptedException {
		Thread.sleep(2000);
		Select field = new Select(Timezonefield);
		field.selectByVisibleText("EST");
		Thread.sleep(2000);
		Select field1 = new Select(Timezonefield);
		field1.selectByVisibleText("CST");
		Thread.sleep(2000);
		Select field2 = new Select(Timezonefield);
		field2.selectByVisibleText("MST");
		Thread.sleep(2000);
		Select field3 = new Select(Timezonefield);
		field3.selectByVisibleText("PST");
		Thread.sleep(2000);
		Go.click();
		
		String success = Timezonesuccess.getText();
		
		return success;
		
	}

}
