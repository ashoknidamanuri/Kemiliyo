package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserRingGroupsPage extends BaseTest{
	public  UserRingGroupsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[contains(.,'PBX Setting')]")
	WebElement Pbxsetting;
	@FindBy(xpath = "//a[contains(.,'Ring Groups')]")
	WebElement Ringgroups;
	@FindBy(xpath = "//button[contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(.,'Add')]")
	WebElement Add;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Name;
	@FindBy(xpath = "//input[@name='qNum']")
	WebElement Number;
	@FindBy(xpath = "//textarea[contains(@name,'qExt')]")
	WebElement Extension;
	@FindBy(xpath = "//select[@ng-model='code.strategy']")
	WebElement Strategy;
	@FindBy(xpath = "//input[@name='rTime']")
	WebElement Ringtime;
	@FindBy(xpath = "//select[contains(@ng-model,'code.annmsg_id')]")
	WebElement Announcement;
	@FindBy(xpath = "//select[@ng-model='code.progress']")
	WebElement Progress;
	@FindBy(xpath = "//select[contains(@ng-model,'code.cfignore')]")
	WebElement Cfsetting;
	@FindBy(xpath = "//select[@ng-model='code.cwignore']")
	WebElement Skipagent;
	@FindBy(xpath = "//select[@ng-model='code.cpickup']")
	WebElement Pickup;
	@FindBy(xpath = "//select[@ng-model='code.recording']")
	WebElement Callrecording;
	@FindBy(xpath = "//select[@ng-model='code.destination_type']")
	WebElement Destination;
	@FindBy(xpath = "//select[contains(@ng-model,'value')]")
	WebElement Destinationvalue;
	@FindBy(xpath = "//button[contains(.,'Create RingGroup')]")
	WebElement Createringgroup;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Ring-Group Added successfully')]")
	WebElement Success;
	@FindBy(xpath = "//h3[contains(.,'Ring Groups')]")
	WebElement Logo;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'9700440611')]")
	WebElement Editclick;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Update RingGroup')]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Ring-Group Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Ring-Group Deleted successfully')]")
	WebElement Deletesuccess;
	
	
	
	public String ringgroup_validation() throws InterruptedException {
		Pbxsetting.click();
		//selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		//nameidentifier.click();
		Thread.sleep(1000);
		Ringgroups.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		//System.out.println(logo);
		return logo;
		
	}
	public String add_ringgroup() throws InterruptedException {
		 
		Action.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Name.sendKeys("surendra");
		Thread.sleep(1000);
		Number.sendKeys("9700440611");
		Thread.sleep(1000);
		Extension.sendKeys("102,105");
		Select service = new Select(Strategy);
		service.selectByVisibleText("Ringall");
		Ringtime.sendKeys("15");
		//Select announce = new Select(Announcement);
		//announce.selectByVisibleText("ASHOK");
		Select progress = new Select(Progress);
		progress.selectByVisibleText("Yes");
		Select ignore = new Select(Cfsetting);
		ignore.selectByVisibleText("Yes");
		Select skip = new Select(Skipagent);
		skip.selectByVisibleText("Yes");
		Select enablepickup = new Select(Pickup);
		enablepickup.selectByVisibleText("Yes");
		Select callrecord = new Select(Callrecording);
		callrecord.selectByVisibleText("Yes");
		Select destination = new Select(Destination);
		destination.selectByVisibleText("Directory");
		Thread.sleep(1000);
		Select destinationvalue = new Select(Destinationvalue);
		destinationvalue.selectByVisibleText("174");
		Createringgroup.click();
		String addsuccess = Success.getText();
		//System.out.println(logo);
		return addsuccess;
	
	}
	public String edit_ringgroup() throws InterruptedException {
		Thread.sleep(5000);
		Editclick.click();
		Action.click();
		Edit.click();
		Name.clear();
		Thread.sleep(5000);
		Name.sendKeys("suryafiaa");
		Thread.sleep(2000);
		//ringgroumber.clear();
		//Thread.sleep(5000);
		//ringgroupnumber.sendKeys("9702142466");
		Thread.sleep(3000);
		Extension.click();
		Thread.sleep(2000);
		Update.click();
		String editsuccess = Updatesuccess.getText();
		//System.out.println(logo);
		return editsuccess;
			
	}
	public String delete_ringgroup() throws InterruptedException {
		Thread.sleep(5000);
		Editclick.click();
		Action.click();
		Delete.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
		
	
		
	}
	
	
}
