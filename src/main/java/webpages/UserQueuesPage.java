package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserQueuesPage extends BaseTest{
	public  UserQueuesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[contains(.,'PBX Setting')]")
	WebElement Pbxsetting;
	@FindBy(xpath = "//a[contains(.,'Queues')]")
	WebElement Queues;
	@FindBy(xpath = "//h3[contains(.,'Queues')]")
	WebElement Logo;
	@FindBy(xpath = "//button[contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(.,'Add')]")
	WebElement Add;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Name;
	@FindBy(xpath = "(//input[@name='qNum'])[1]")
	WebElement Number;
	@FindBy(xpath = "//select[@ng-model='formdata.reportholdtime']")
	WebElement Waittimeprefix;
	@FindBy(xpath = "//textarea[contains(@rows,'3')]")
	WebElement Extension;
	@FindBy(xpath = "//select[@ng-model='formdata.strategy']")
	WebElement Strategy;
	@FindBy(xpath = "//select[@ng-model='formdata.autofill']")
	WebElement Autofill;
	@FindBy(xpath = "//select[@ng-model='formdata.ringinuse']")
	WebElement Skipbusyagent;
	@FindBy(xpath = "//select[@ng-model='formdata.weight']")
	WebElement Queueweight;
	@FindBy(xpath = "//select[@ng-model='formdata.musicclass']")
	WebElement Musiconhold;
	@FindBy(xpath = "//select[contains(@ng-model,'format')]")
	WebElement Callrecord;
	@FindBy(xpath = "//select[@ng-model='formdata.destination_type']")
	WebElement Destination;
	@FindBy(xpath = "//select[@ng-model='formdata.destination_type_value']")
	WebElement Destinationvalue;
	@FindBy(xpath = "//button[contains(.,'Submit')]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Queue Added successfully')]")
	WebElement Success;
	@FindBy(xpath = "//td[contains(.,'newtestt')]")
	WebElement Editclick;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Update')]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Queue Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Queue(s) Deleted successfully')]")
	WebElement Deletesuccess;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'9511269872')]")
	WebElement Deeleteclick;
	
	
	public String queues_validation() throws InterruptedException {
		Pbxsetting.click();
		//selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		//nameidentifier.click();
		Thread.sleep(1000);
		Queues.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		//System.out.println(logo);
		return logo;
		
	 }
	
	public String add_queues() throws InterruptedException {
		Thread.sleep(1000);
		Action.click();
		Add.click();
		Name.sendKeys("newtestt");
		Thread.sleep(1500);
		Number.sendKeys("9511269872");
		Thread.sleep(1500);
		Select timeprefix=new Select(Waittimeprefix);
		 
		timeprefix.selectByVisibleText("Yes");
		Thread.sleep(1500);
		//Select extension=new Select(Extension);
		//timeprefix.selectByVisibleText("Yes");
		Extension.sendKeys("102,103");
		Thread.sleep(1500);
		Select ringstar=new Select(Strategy);
		ringstar.selectByVisibleText("random");
		Thread.sleep(1000);
		Select autofill=new Select(Autofill);
		autofill.selectByVisibleText("Yes");
		Thread.sleep(1000);
		Select skipbusy=new Select(Skipbusyagent);
		skipbusy.selectByVisibleText("No");
		Thread.sleep(1000);
		Select weight=new Select(Queueweight);
		weight.selectByVisibleText("2");
		Thread.sleep(1000);
		//Select onhold=new Select(Musiconhold);
		//onhold.selectByVisibleText("Surendra");
		//Thread.sleep(1000);
//		Select callrecording=new Select(Callrecording);
//		callrecording.selectByVisibleText("no");
//		Thread.sleep(1000);
//		Select maxwait=new Select(Maxwait);
//		maxwait.selectByVisibleText("15");
//		Thread.sleep(1000);
//		Select timeout=new Select(Timeout);
//		timeout.selectByVisibleText("10");
//		Thread.sleep(1000);
//		Select timeoutres=new Select(Timeoutrestart);
//		timeoutres.selectByVisibleText("No");
//		Thread.sleep(1000);
//		Select retry=new Select(Retry);
//		retry.selectByVisibleText("4");
//		Thread.sleep(1000);
//		Select wrap=new Select(Wrapuptime);
//		wrap.selectByVisibleText("11");
//		Thread.sleep(1000);
//		Select numberdelay=new Select(Numberdelay);
//		numberdelay.selectByVisibleText("9");
//		Thread.sleep(1000);
//		Select maxcaller=new Select(Maxcaller);
//		maxcaller.selectByVisibleText("4");
		Thread.sleep(1000);
		Select destination=new Select(Destination);
		destination.selectByVisibleText("Extension");
		Thread.sleep(3000);
		Select destinationtype=new Select(Destinationvalue);
		destinationtype.selectByVisibleText("157-123");
		Thread.sleep(1000);
		//Destinationtype.click();
		Thread.sleep(1000);
		Submit.click();
		String success = Success.getText();
		return success;
		
		}
	public String edit_queues() throws InterruptedException {
		Thread.sleep(5000);
		Editclick.click();
		Action.click();
		Edit.click();
		Name.clear();
		Thread.sleep(3000);
		Name.sendKeys("testingtwo");
		Thread.sleep(3000);
		//Numberfield.clear();
		//Numberfield.sendKeys("9866449323");
		//Thread.sleep(3000);
		//Destination.clear();
		Thread.sleep(3000);
		Select destination=new Select(Destination);
		destination.selectByVisibleText("Phonebook Directory");
		Thread.sleep(3000);
		//Select destinationtype=new Select(Destinationtype);
		//destinationtype.selectByVisibleText("SURE");
		Thread.sleep(3000);
		Update.click();
		String success = Updatesuccess.getText();
		return success;
		
	
	}
	public String delete_queues() throws InterruptedException {
		Thread.sleep(5000);
		Deeleteclick.click();
		Action.click();
		Delete.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
		
	}

}
