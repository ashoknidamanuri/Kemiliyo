package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RingGroupsPjsipPage extends BaseTest{
	public   RingGroupsPjsipPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'pjsipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(.,'Ring Groups')]")
	WebElement ringgroup;
	@FindBy(xpath = "//h1[contains(.,'Ring Group')]")
	WebElement Ringlogo;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Ringaction;
	@FindBy(xpath = "//a[@ng-click='addRinggroup();'][contains(.,'Add')]")
	WebElement addringaction;
	@FindBy(xpath = "//input[contains(@ng-model,'code.grpname')]")
	WebElement ringgroupname;
	@FindBy(xpath = "//input[@ng-model='code.grpnum']")
	WebElement ringgroupnumber;
	@FindBy(xpath = "//textarea[@ng-model='code.grplist']")
	WebElement extensionslist;
	@FindBy(xpath = "//select[@ng-model='code.strategy']")
	WebElement Ringstrategy;
	@FindBy(xpath = "//input[contains(@ng-model,'code.grptime')]")
	WebElement Ringtime;
	@FindBy(xpath = "//select[contains(@ng-model,'code.annmsg_id')]")
	WebElement Announcement;
	@FindBy(xpath = "//select[contains(@ng-model,'code.progress')]")
	WebElement Sendprogress;
	@FindBy(xpath = "//select[contains(@ng-model,'code.cfignore')]")
	WebElement Ignoresettings;
	@FindBy(xpath = "//select[contains(@ng-model,'code.cwignore')]")
	WebElement Skipagent;
	@FindBy(xpath = "//select[contains(@ng-model,'code.cpickup')]")
	WebElement Enablepickup;
	@FindBy(xpath = "//select[contains(@ng-model,'code.recording')]")
	WebElement Callrecording;
	@FindBy(xpath = "//select[@ng-change='getDestinationValue(code.destination_type);']")
	WebElement Detinationtype;
	//@FindBy(xpath = "//select[@ng-model='code.destination_type_value']")
	@FindBy(xpath = "//select[contains(@ng-model,'code.destination_type_value')]")
	WebElement Destinationvalue;
	@FindBy(xpath = "//button[contains(@ng-hide,'actionBtn')]")
	WebElement submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Ring-Group Added successfully')]")
	WebElement Addedsucess;
	
	//EDIT METHOD
	@FindBy(xpath = "//input[contains(@id,'selectval_2')]")
	WebElement radioedit;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement actionedit;
	@FindBy(xpath = "//button[@ng-show='actionBtn']")
	WebElement editupdate;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Ring-Group Updated successfully')]")
	WebElement editupdatesuccess;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement delete;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Ring-Group Deleted successfully')]")
	WebElement Rgdeletedsuccess;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'surendra')]")
	WebElement Editoption;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'suryafiaa')]")
	WebElement Deletesuccess;
	
	
	
	
	
	public String ringgroup_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("pjsipuse");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		ringgroup.click();
		Thread.sleep(1000);
		String logo = Ringlogo.getText();
		//System.out.println(logo);
		return logo;
		
	}
	public String add_ringgroup() throws InterruptedException {
		 
		Ringaction.click();
		Thread.sleep(1000);
		addringaction.click();
		Thread.sleep(1000);
		ringgroupname.sendKeys("surendra");
		Thread.sleep(1000);
		ringgroupnumber.sendKeys("9700440611");
		Thread.sleep(1000);
		extensionslist.sendKeys("102,105");
		Select service = new Select(Ringstrategy);
		service.selectByVisibleText("Ringall");
		Ringtime.sendKeys("15");
		//Select announce = new Select(Announcement);
		//announce.selectByVisibleText("ASHOK");
		Select progress = new Select(Sendprogress);
		progress.selectByVisibleText("Yes");
		Select ignore = new Select(Ignoresettings);
		ignore.selectByVisibleText("Yes");
		Select skip = new Select(Skipagent);
		skip.selectByVisibleText("Yes");
		Select enablepickup = new Select(Enablepickup);
		enablepickup.selectByVisibleText("Yes");
		Select callrecord = new Select(Callrecording);
		callrecord.selectByVisibleText("Yes");
		Select destination = new Select(Detinationtype);
		destination.selectByVisibleText("Directory");
		Thread.sleep(1000);
		Select destinationvalue = new Select(Destinationvalue);
		destinationvalue.selectByVisibleText("174");
		submit.click();
		String addsuccess = Addedsucess.getText();
		//System.out.println(logo);
		return addsuccess;
	
	}
	
	public String edit_ringgroup() throws InterruptedException {
		Thread.sleep(5000);
		Editoption.click();
		Ringaction.click();
		actionedit.click();
		ringgroupname.clear();
		Thread.sleep(5000);
		ringgroupname.sendKeys("suryafiaa");
		Thread.sleep(2000);
		ringgroupnumber.clear();
		Thread.sleep(5000);
		ringgroupnumber.sendKeys("9702142466");
		Thread.sleep(3000);
		extensionslist.click();
		Thread.sleep(2000);
		editupdate.click();
		String editsuccess = editupdatesuccess.getText();
		//System.out.println(logo);
		return editsuccess;
			
	}
	public String delete_ringgroup() throws InterruptedException {
		Thread.sleep(5000);
		Deletesuccess.click();
		Ringaction.click();
		delete.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Rgdeletedsuccess.getText();		
		
		return delete_success;
		
	
		
	}
	
}
