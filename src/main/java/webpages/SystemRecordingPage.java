package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webpages.BaseTest;

public class SystemRecordingPage extends BaseTest {
	public  SystemRecordingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'sipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(@href,'recording')]")
	WebElement Systemrecord;
	@FindBy(xpath = "//h1[contains(.,'System Recording')]")
	WebElement Logo;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[@ng-click='addRecord();'][contains(.,'Add')]")
	WebElement Add;
	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement Name;
	@FindBy(xpath = "//input[contains(@type,'file')]")
	WebElement File;
	@FindBy(xpath = "//input[contains(@value,'Submit')]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Recording added successfully')]")
	WebElement Recordsuccess;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'iaaaa')]")
	WebElement Edit;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Editclick;
	@FindBy(xpath = "//input[contains(@value,'Update')]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Recording Updated successfully')]")
	WebElement Editsuccess;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'ttinngggg')]")
	WebElement Delete;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Deleteclick;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Deleted Successfully!')]")
	WebElement Deletesuccess;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Please select atleast one Recording')]")
	WebElement Selectone;
	@FindBy(xpath = "//td[contains(.,'ttinngggg')]")
	WebElement Play;
	@FindBy(xpath = "(//i[contains(@class,'fa fa-play')])[39]")
	WebElement Playlist;
	
	
	
	public String systemrecord_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Systemrecord.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		//System.out.println(logo);
		return logo;
		
	}
	
	public String add_systemrecord() throws InterruptedException {
		
		Thread.sleep(2000);
		Action.click();
		Thread.sleep(1500);
		Add.click();
		Name.sendKeys("iaaaa");
		File.sendKeys("C:\\Users\\Surendra\\Desktop\\1594042244.wav");
		Thread.sleep(2000);
		Submit.click();
		Thread.sleep(2000);
		String record = Recordsuccess.getText();
		return record;
		
		}
	public String edit_systemrecord() throws InterruptedException  {
		
		Thread.sleep(5000);
		Edit.click();
		Action.click();
		Editclick.click();
		Name.clear();
		Thread.sleep(1500);
		Name.sendKeys("ttinngggg");
		Update.click();
		String editsuccess = Editsuccess.getText();
		
		return editsuccess;
		
	}
	
	public String delete_systemrecord() throws InterruptedException {
		Thread.sleep(5000);
		Delete.click();
		Thread.sleep(1000);
		Action.click();
		Deleteclick.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
		
		 
	}
	
	public String withoutselectradioedit() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Editclick.click();
		String selectone=Selectone.getText();		
		return selectone;
		
	}
	
	public String withoutselectradiodelete() throws InterruptedException {
		
		Thread.sleep(5000);
		Action.click();
		Deleteclick.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String selectone=Selectone.getText();		
		return selectone;
		
		
	}
	
	public String wronginputs() throws InterruptedException {
		
		Thread.sleep(5000);
		//Thread.sleep(2000);
		Action.click();
		Thread.sleep(1500);
		Add.click();
		Name.sendKeys("indaaaa1");
		Thread.sleep(4000);
		Name.clear();
		Thread.sleep(2000);
		Name.sendKeys("newentry");
		File.sendKeys("C:\\Users\\Surendra\\Desktop\\upload.png.wav");
		Submit.click();
		Thread.sleep(5000);
		File.sendKeys("C:\\Users\\Surendra\\Desktop\\1594042244.wav");
		Thread.sleep(2000);
		Submit.click();
		Thread.sleep(2000);
		String record = Recordsuccess.getText();
		return record;
		//return null;
		
		
	}
	

}
