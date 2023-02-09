package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserAnnouncementPage extends BaseTest{
	public  UserAnnouncementPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[contains(.,'PBX Setting')]")
	WebElement Pbxsetting;
	@FindBy(xpath = "//a[contains(.,'Announcement')]")
	WebElement Announcement;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[@ng-click='addAnnouncement();'][contains(.,'Add')]")
	WebElement Add;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Name;
	@FindBy(xpath = "//select[contains(@ng-model,'code.sound')]")
	WebElement Record;
	@FindBy(xpath = "//select[contains(@ng-model,'number')]")
	WebElement Repeatmessage;
	@FindBy(xpath = "//select[contains(@ng-model,'code.skip')]")
	WebElement Skip;
	@FindBy(xpath = "//select[contains(@ng-change,'type);')]")
	WebElement Destinationtype;
	@FindBy(xpath = "(//select[@type='text'])[2]")
	WebElement Destinationtypevalue;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Added successfully')]")
	WebElement Success;
	@FindBy(xpath = "//h3[@class='box-title'][contains(.,'Announcement')]")
	WebElement Logo;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'newtest')]")
	WebElement Edit;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Editclick;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Update Announcement')]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Deleteclick;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Announcement Deleted successfully')]")
	WebElement Deletesuccess;
	

	public String announcement_validation() throws InterruptedException {
		Pbxsetting.click();
		//selectcutomer.sendKeys("sipuser");
		//Thread.sleep(1000);
		//nameidentifier.click();
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
		Name.sendKeys("newtest");
		Select rdid= new Select(Record);
		rdid.selectByVisibleText("testrecord");
		Thread.sleep(1500);
		Select rpmsg = new Select(Repeatmessage);
		rpmsg.selectByVisibleText("2");
		Select skip = new Select(Skip);
		skip.selectByVisibleText("Enable");
		Select dtype= new Select(Destinationtype);
		dtype.selectByVisibleText("Extension");
		Thread.sleep(1500);
		Select dtypevalue= new Select(Destinationtypevalue);
		dtypevalue.selectByVisibleText("157-123");
		Submit.click();
		String success = Success.getText();
		return success;
		
	}
	public String edit_announcement() throws InterruptedException {
		Thread.sleep(5000);
		Edit.click();
		Action.click();
		Editclick.click();
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
		Edit.click();
		Action.click();
		Deleteclick.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
		
		
	}
	
}
