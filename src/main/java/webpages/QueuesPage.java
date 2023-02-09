package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import webpages.BaseTest;

public class QueuesPage extends BaseTest{
	public  QueuesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'sipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[@href='http://123.108.80.102/multitenant/pbx_setting/queues']")
	WebElement Queuespage;
	@FindBy(xpath = "//h1[contains(.,'Queues')]")
	WebElement Logo;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[@ng-click='addQueue();'][contains(.,'Add')]")
	WebElement Addclick;
	@FindBy(xpath = "//input[contains(@ng-model,'formdata.name')]")
	WebElement Namefield;
	@FindBy(xpath = "//input[contains(@ng-blur,'number)')]")
	WebElement Numberfield;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.reportholdtime')]")
	WebElement Timeprefix;
	@FindBy(xpath = "//textarea[@ng-model='formdata.extension']")
	WebElement Extension;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.strategy')]")
	WebElement Ringstrategy;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.autofill')]")
	WebElement Autofill;
	
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.ringinuse')]")
	WebElement Skipbusy;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.weight')]")
	WebElement Weight;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.periodic_announce')]")
	WebElement Musiconhold;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.monitor_format')]")
	WebElement Callrecording;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.servicelevel')]")
	WebElement Maxwait;
	@FindBy(xpath = "//select[@ng-model='formdata.timeout']")
	WebElement Timeout;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.timeoutrestart')]")
	WebElement Timeoutrestart;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.retry')]")
	WebElement Retry;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.wrapuptime')]")
	WebElement Wrapuptime;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.memberdelay')]")
	WebElement Numberdelay;
	@FindBy(xpath = "//select[contains(@ng-model,'formdata.maxlen')]")
	WebElement Maxcaller;
	@FindBy(xpath = "//select[contains(@ng-change,'type);')]")
	WebElement Destination;
	//@FindBy(xpath = "//select[@ng-model='formdata.destination_type_value']")
	@FindBy(xpath = "//select[@ng-model='formdata.destination_type_value']")
	WebElement Destinationtype;
	//@FindBy(xpath = "//select[@ng-model='formdata.destination_type_value']")
	@FindBy(xpath = "//button[@ng-hide='timegrpBtn']")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Queue Added successfully')]")
	WebElement Submitsuccess;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'9511260871')]")
	//@FindBy(xpath = "(//td[@class='ng-binding'][contains(.,'newtest')])[3]")
	WebElement Editselect;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Editclick;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Update')]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Queue Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'testingone')]")
	WebElement Deleteselect;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Deleteclick;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Queue(s) Deleted successfully')]")
	WebElement Deletesuccess;
	
	
	
	
	public String queues_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Queuespage.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		//System.out.println(logo);
		return logo;
		
	 }
	
	public String add_queues() throws InterruptedException {
		Thread.sleep(1000);
		Action.click();
		Addclick.click();
		Namefield.sendKeys("newtest");
		Thread.sleep(1500);
		Numberfield.sendKeys("9511260871");
		Thread.sleep(1500);
		Select timeprefix=new Select(Timeprefix);
		 
		timeprefix.selectByVisibleText("Yes");
		Thread.sleep(1500);
		//Select extension=new Select(Extension);
		//timeprefix.selectByVisibleText("Yes");
		Extension.sendKeys("102,103");
		Thread.sleep(1500);
		Select ringstar=new Select(Ringstrategy);
		ringstar.selectByVisibleText("random");
		Thread.sleep(1000);
		Select autofill=new Select(Autofill);
		autofill.selectByVisibleText("Yes");
		Thread.sleep(1000);
		Select skipbusy=new Select(Skipbusy);
		skipbusy.selectByVisibleText("No");
		Thread.sleep(1000);
		Select weight=new Select(Weight);
		weight.selectByVisibleText("2");
		Thread.sleep(1000);
		Select onhold=new Select(Musiconhold);
		onhold.selectByVisibleText("Music");
		Thread.sleep(1000);
		Select callrecording=new Select(Callrecording);
		callrecording.selectByVisibleText("no");
		Thread.sleep(1000);
		Select maxwait=new Select(Maxwait);
		maxwait.selectByVisibleText("15");
		Thread.sleep(1000);
		Select timeout=new Select(Timeout);
		timeout.selectByVisibleText("10");
		Thread.sleep(1000);
		Select timeoutres=new Select(Timeoutrestart);
		timeoutres.selectByVisibleText("No");
		Thread.sleep(1000);
		Select retry=new Select(Retry);
		retry.selectByVisibleText("4");
		Thread.sleep(1000);
		Select wrap=new Select(Wrapuptime);
		wrap.selectByVisibleText("11");
		Thread.sleep(1000);
		Select numberdelay=new Select(Numberdelay);
		numberdelay.selectByVisibleText("9");
		Thread.sleep(1000);
		Select maxcaller=new Select(Maxcaller);
		maxcaller.selectByVisibleText("4");
		Thread.sleep(1000);
		Select destination=new Select(Destination);
		destination.selectByVisibleText("Extension");
		Thread.sleep(3000);
		Select destinationtype=new Select(Destinationtype);
		destinationtype.selectByVisibleText("158-123");
		Thread.sleep(1000);
		//Destinationtype.click();
		Thread.sleep(1000);
		Submit.click();
		String success = Submitsuccess.getText();
		return success;
		
		}
	
	public String edit_queues() throws InterruptedException {
		Thread.sleep(5000);
		
		Editselect.click();
		Action.click();
		Editclick.click();
		Namefield.clear();
		Thread.sleep(3000);
		Namefield.sendKeys("testingone");
		Thread.sleep(3000);
		//Numberfield.clear();
		//Numberfield.sendKeys("9866449323");
		//Thread.sleep(3000);
		//Destination.clear();
		Thread.sleep(3000);
		Select destination=new Select(Destination);
		destination.selectByVisibleText("Ring Group");
		Thread.sleep(3000);
		Select destinationtype=new Select(Destinationtype);
		destinationtype.selectByVisibleText("R Name");
		Thread.sleep(3000);
		Update.click();
		String success = Updatesuccess.getText();
		return success;
		
	
	}
	
	public String delete_queues() throws InterruptedException {
		Thread.sleep(5000);
		Deleteselect.click();
		Action.click();
		Deleteclick.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
		
	}

}
