package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import webpages.BaseTest;

public class TimeConditionsPage extends BaseTest {
	public  TimeConditionsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'sipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(.,'Time Conditions')]")
	WebElement Timecondition;
	@FindBy(xpath = "//h1[contains(.,'Time Condition')]")
	WebElement Logo;
	@FindBy(xpath = "//button[contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(@ng-click,'addTimecond();')]")
	WebElement Addtime;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Namefield;
	@FindBy(xpath = "//select[contains(@ng-model,'cond.timegroupid')]")
	WebElement Timegroup;
	@FindBy(xpath = "//select[@ng-model='cond.OnTime_destination_type']")
	WebElement Ondestinationtype;
	@FindBy(xpath = "//select[@ng-model='cond.OnTime_destination_type_value']")
	WebElement Ondestinationtypevalue;
	@FindBy(xpath = "//select[@ng-model='cond.OffTime_destination_type']")
	WebElement Offdestinationtype;
	@FindBy(xpath = "//select[@ng-model='cond.OffTime_destination_type_value']")
	WebElement Offdestinationtypevalue;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Time Condition Created successfully')]")
	WebElement Success;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'newtime')]")
	WebElement Editcheck;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Update')]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Time Condition Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Time Condition Deleted successfully')]")
	WebElement Deletesuccess;
	
	
	public String timecondition_validation() throws InterruptedException {
		Thread.sleep(1000);
		managepbx.click();
		selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Timecondition.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		//System.out.println(logo);
		return logo;
		
	}
	public String add_timecondition() throws InterruptedException {
		Thread.sleep(1000);
		Action.click();
		Addtime.click();
		Namefield.sendKeys("newtime");
		Select timegroup = new Select(Timegroup);
		timegroup.selectByVisibleText("TT");
		Select ondestinationtype = new Select(Ondestinationtype);
		ondestinationtype.selectByVisibleText("Extension");
		Select ondestinationtypevalue = new Select(Ondestinationtypevalue);
		ondestinationtypevalue.selectByVisibleText("158-123");
		Select offdestinationtype = new Select(Offdestinationtype);
		offdestinationtype.selectByVisibleText("Directory");
		Select offdestinationtypevalue = new Select(Offdestinationtypevalue);
		offdestinationtypevalue.selectByVisibleText("test");
		Submit.click();
		String success = Success.getText();
		return success;
		
	
	}
	public String edit_timecondition() throws InterruptedException {
		Thread.sleep(5000);
		Editcheck.click();
		Action.click();
		Edit.click();
		Thread.sleep(2000);
		Select ondestinationtype = new Select(Ondestinationtype);
		ondestinationtype.selectByVisibleText("Extension");
		Thread.sleep(2000);
		Select ondestinationtypevalue = new Select(Ondestinationtypevalue);
		ondestinationtypevalue.selectByVisibleText("158-123");
		Select offdestinationtype = new Select(Offdestinationtype);
		offdestinationtype.selectByVisibleText("Phonebook Directory");
		//Select offdestinationtypevalue = new Select(Offdestinationtypevalue);
		//offdestinationtypevalue.selectByVisibleText("");
		Thread.sleep(1500);
		Update.click();
		String usuccess = Updatesuccess.getText();
		//System.out.println(logo);
		return usuccess;
		
	}
	public String delete_timecondition() throws InterruptedException {
		Thread.sleep(5000);
		Editcheck.click();
		Action.click();
		Delete.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
		
		
	}
	
	

}
