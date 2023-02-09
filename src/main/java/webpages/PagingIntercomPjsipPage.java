package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PagingIntercomPjsipPage extends BaseTest {
	public   PagingIntercomPjsipPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'pjsipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(@href,'intercom')]")
	WebElement Pageintercom;
	@FindBy(xpath = "(//span[@ng-hide='headopens'][contains(.,'Paging & Intercom')])[1]")
	WebElement Logo;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "(//a[contains(.,'Add')])[3]")
	WebElement Add;
	@FindBy(xpath = "//input[contains(@ng-blur,'checkDID(did.destination_num)')]")
	WebElement Pagingnum;
	@FindBy(xpath = "//input[@ng-model='did.description']")
	WebElement Description;
	@FindBy(xpath = "//textarea[@ng-model='did.extensions']")
	WebElement Extensions;
	@FindBy(xpath = "//select[@ng-model='did.announcement']")
	WebElement Announcement;
	@FindBy(xpath = "//input[contains(@name,'timeout')]")
	WebElement Timeout;
	@FindBy(xpath = "//select[@ng-model='did.mode']")
	WebElement Mode;
	@FindBy(xpath = "//select[contains(@ng-model,'did.duplex_mode')]")
	WebElement Duplexmode;
	@FindBy(xpath = "//select[contains(@ng-model,'did.quite_mode')]")
	WebElement Quitmode;
	@FindBy(xpath = "//select[contains(@ng-model,'did.record')]")
	WebElement Record;
	@FindBy(xpath = "//select[contains(@ng-model,'did.skip_busy')]")
	WebElement Skipbusy;
	@FindBy(xpath = "//select[@ng-model='did.cfignore']")
	WebElement Ignore;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Create')]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Paging & Intercom Created successfully')]")
	WebElement Success;
	@FindBy(xpath = "//td[contains(.,'54321')]")
	WebElement Editclick;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Update')]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Paging & Intercom Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Paging & Intercom Deleted successfully')]")
	WebElement Deletesuccess;
	
	
	public String paging_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("pjsipuse");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Pageintercom.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		return logo;
		
	 }
	public String add_paging() throws InterruptedException {
		Thread.sleep(1000);
		Action.click();
		Add.click();
		Pagingnum.sendKeys("54321");
		Thread.sleep(2000);
		Description.sendKeys("welcomenewpage");
		Thread.sleep(2000);
		Extensions.sendKeys("102,103");
	//	Select directory=new Select(Announcement);
	//	directory.selectByVisibleText("Admin");
		//Announcement.sendKeys(keysToSend);
		Timeout.sendKeys("20");
		Select mode=new Select(Mode);
		mode.selectByVisibleText("Default");
		Select dmode=new Select(Duplexmode);
		dmode.selectByVisibleText("No");
		Select qmode=new Select(Quitmode);
		qmode.selectByVisibleText("No");
		Select record=new Select(Record);
		record.selectByVisibleText("No");
		Select sbusy=new Select(Skipbusy);
		sbusy.selectByVisibleText("No");
		Select ignore=new Select(Ignore);
		ignore.selectByVisibleText("No");
		Submit.click();
		
		String suc = Success.getText();
		return suc;
	
	}
	public String edit_paging() throws InterruptedException {
		Thread.sleep(5000);
		Editclick.click();
		Action.click();
		Edit.click();
		Description.clear();
		Thread.sleep(2000);
		Description.sendKeys("welcomenewindia");
		Timeout.clear();
		Thread.sleep(1500);
		Timeout.sendKeys("30");
		Select record=new Select(Record);
		record.selectByVisibleText("Yes");
		Update.click();
		String suc = Updatesuccess.getText();
		return suc;
	
		
	}
    
	public String delete_paging() throws InterruptedException {
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