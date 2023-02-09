package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class IvrOptionsPage extends BaseTest {
	public  IvrOptionsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'sipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//i[contains(@class,'glyphicon glyphicon-headphones')]")
	WebElement Ivroption;
	@FindBy(xpath = "//h1[contains(.,'IVR Options')]")
	WebElement Logo;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[@ng-click='addIVR();'][contains(.,'Add')]")
	WebElement Add;
	@FindBy(xpath = "//select[@ng-model='ivr.recording_id']")
	WebElement Recordid;
	@FindBy(xpath = "//input[@ng-model='ivr.ivr_name']")
	WebElement Ivrname;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.enable_exten_dialing')]")
	WebElement Extensiondail;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.invalid_retries')]")
	WebElement Retries;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.invalid_re_announcement')]")
	WebElement Announcement;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.invalid_retry_recording')]")
	WebElement Inrecording;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.timeout_interval')]")
	WebElement Timeout;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.timeout_re_announcement')]")
	WebElement Announcement1;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.timeout_retry_recording')]")
	WebElement Retryrecord;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.allow_timeout')]")
	WebElement Timeout1;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.final_invalid_recording')]")
	WebElement Finalrecord;
	@FindBy(xpath = "//select[@ng-model='ivr.invalid_destination_type']")
	WebElement Invaliddestinationtype;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.invalid_destination_type_value')]")
	WebElement Invaliddestinationtypevalue;
	@FindBy(xpath = "//select[@ng-model='ivr.final_destination_type']")
	WebElement Finaldestinationtype;
	@FindBy(xpath = "//select[@ng-model='ivr.final_destination_type_value']")
	WebElement Finaldestinationtypevalue;
	@FindBy(xpath = "//button[contains(.,'Submit')]")
	WebElement Submit;
	@FindBy(xpath = "//select[contains(@ng-model,'ivr.allow_timeout')]")
	WebElement xx;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'IVR successfully created')]")
	WebElement Addsuccess;
	
	       // EDIT METHOD;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'newtesting')]")
	WebElement Editclick;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'IVR successfully Updated')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//button[@type='button'][contains(.,'Update')]")
	WebElement Update;
	
	//Delete method
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'newtestingg')]")
	WebElement Deleted;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'IVR successfully deleted')]")
	WebElement Deletesuccess;
	
	
	
	
	
	public String ivroption_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Ivroption.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		//System.out.println(logo);
		return logo;
		
	}
	
	public String add_ivroption() throws InterruptedException {
		Thread.sleep(2000);
		Action.click();
		Add.click();
		//Recordid.sendKeys("");
		Select one = new Select(Recordid);
		one.selectByVisibleText("sure");
		Ivrname.sendKeys("newtesting");
		Select eedailing = new Select(Extensiondail);
		eedailing.selectByVisibleText("Enable");
		Thread.sleep(2000);
		Select retry = new Select(Retries);
		retry.selectByVisibleText("3");
		Select announce = new Select(Announcement);
		announce.selectByVisibleText("Enable");
		Select invalid = new Select(Inrecording);
		invalid.selectByVisibleText("sure");
		Select tmout = new Select(Timeout);
		tmout.selectByVisibleText("15");
		//Select announce1 = new Select(Announcement1);
		//announce1.selectByVisibleText("Enable");
		Thread.sleep(2000);
		Select retrecord = new Select(Retryrecord);
		retrecord.selectByVisibleText("sure");
		Thread.sleep(2000);
		Select ff = new Select(xx);
		ff.selectByVisibleText("Enable");
		Thread.sleep(2000);
		Select ffrecord = new Select(Finalrecord);
		ffrecord.selectByVisibleText("sure");
		Select invaliddestinationtype = new Select(Invaliddestinationtype);
		invaliddestinationtype.selectByVisibleText("Extension");
		Thread.sleep(2000);
		Select invaliddestinationtypevalue = new Select(Invaliddestinationtypevalue);
		invaliddestinationtypevalue.selectByVisibleText("158-123");
		Select finaldestinationtype = new Select(Finaldestinationtype);
		finaldestinationtype.selectByVisibleText("Phonebook Directory");
	//	Select finaldestinationtypevalue = new Select(Finaldestinationtypevalue);
		//finaldestinationtypevalue.selectByVisibleText("");
		Thread.sleep(2000);
		Submit.click();
		
		String suc1 = Addsuccess.getText();
		//System.out.println(logo);
		return suc1;
	
	}
	public String edit_ivroption() throws InterruptedException {
		Thread.sleep(5000);
		Editclick.click();
		Action.click();
		Edit.click();
		Ivrname.clear();
		Thread.sleep(2000);
		Ivrname.sendKeys("newtestingg");
		Thread.sleep(1500);
		Select eedailing = new Select(Extensiondail);
		eedailing.selectByVisibleText("Disable");
		Thread.sleep(2000);
		Select retry = new Select(Retries);
		retry.selectByVisibleText("2");
		Select announce = new Select(Announcement);
		announce.selectByVisibleText("Enable");
		Select invalid = new Select(Inrecording);
		invalid.selectByVisibleText("sure");
		Select tmout = new Select(Timeout);
		tmout.selectByVisibleText("25");
		Select announce1 = new Select(Announcement1);
		announce1.selectByVisibleText("Enable");
		Thread.sleep(2000);
	//	Select retrecord = new Select(Retryrecord);
	//	retrecord.selectByVisibleText("test");
		Thread.sleep(2000);
		Select ff = new Select(xx);
		ff.selectByVisibleText("Enable");
		Thread.sleep(2000);
		Select ffrecord = new Select(Finalrecord);
		ffrecord.selectByVisibleText("sure");
		Select invaliddestinationtype = new Select(Invaliddestinationtype);
		invaliddestinationtype.selectByVisibleText("Terminate Call");
		Thread.sleep(2000);
		//Select invaliddestinationtypevalue = new Select(Invaliddestinationtypevalue);
		//invaliddestinationtypevalue.selectByVisibleText("38-2389");
		Select finaldestinationtype = new Select(Finaldestinationtype);
		finaldestinationtype.selectByVisibleText("Extension");
		Select finaldestinationtypevalue = new Select(Finaldestinationtypevalue);
		finaldestinationtypevalue.selectByVisibleText("158-123");
		Thread.sleep(2000);
		Update.click();
		String suc2 = Updatesuccess.getText();
		//System.out.println(logo);
		return suc2;
		 
	}
	
	public String delete_ivroption() throws InterruptedException {
		Thread.sleep(5000);
		Deleted.click();
		Action.click();
		Delete.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
	
	}

}
