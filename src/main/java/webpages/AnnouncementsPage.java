package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import webpages.BaseTest;

public class AnnouncementsPage extends BaseTest{
	public  AnnouncementsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'sipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(.,'Announcement')]")
	WebElement Announcement;
	@FindBy(xpath = "//h1[contains(.,'Announcements')]")
	WebElement Logo;
	
	//Add method
	
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(@ng-click,'addAnnouncement();')]")
	WebElement Add;
	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement Namefield;
	@FindBy(xpath = "//select[@ng-model='code.sound']")
	WebElement Recordid;
	@FindBy(xpath = "//select[contains(@ng-model,'code.repeat_number')]")
	WebElement Repeatmsg;
	@FindBy(xpath = "//select[contains(@ng-model,'code.skip')]")
	WebElement Skip;
	@FindBy(xpath = "//select[contains(@ng-change,'type);')]")
	WebElement Destinationtype;
	@FindBy(xpath = "(//select[@type='text'])[2]")
	WebElement Destinationtypevalue;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Added successfully')]")
	WebElement Addsuccess;
	
	//Edit method
	
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'newtest')]")
	WebElement Editcheck;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated successfully')]")
	WebElement Updatesuccess;
	
	//Delete method
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'newtest')]")
	WebElement Deleteaction;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//div[@ng-class='class'][contains(.,'Announcement Deleted successfully')]")
	WebElement Deletesuccess;
	
	
	
	
	
	
	public String announcement_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Announcement.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		//System.out.println(logo);
		return logo;
		
	}
	public String add_announcement() throws InterruptedException {
		Thread.sleep(2000);
		Action.click();
		Add.click();
		Namefield.sendKeys("newtest");
		Select rdid= new Select(Recordid);
		rdid.selectByVisibleText("sure");
		Thread.sleep(1500);
		Select rpmsg = new Select(Repeatmsg);
		rpmsg.selectByVisibleText("2");
		Select skip = new Select(Skip);
		skip.selectByVisibleText("Enable");
		Select dtype= new Select(Destinationtype);
		dtype.selectByVisibleText("Extension");
		Thread.sleep(1500);
		Select dtypevalue= new Select(Destinationtypevalue);
		dtypevalue.selectByVisibleText("158-123");
		Submit.click();
		String success = Addsuccess.getText();
		return success;
		
	}
	
	public String edit_announcement() throws InterruptedException {
		Thread.sleep(5000);
		Editcheck.click();
		Action.click();
		Edit.click();
		Thread.sleep(2000);
		Select dtype= new Select(Destinationtype);
		dtype.selectByVisibleText("Directory");
		Thread.sleep(1500);
		Select dtypevalue= new Select(Destinationtypevalue);
		dtypevalue.selectByVisibleText("test");
		Update.click();
		String success = Updatesuccess.getText();
		return success;
		 
		
	}
	
	public String delete_announcement() throws InterruptedException {
		Thread.sleep(5000);
		Deleteaction.click();
		Action.click();
		Delete.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
		
		
	}
	
}
