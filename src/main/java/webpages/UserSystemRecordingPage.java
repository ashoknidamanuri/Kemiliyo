package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSystemRecordingPage extends BaseTest{
	public  UserSystemRecordingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[contains(.,'PBX Setting')]")
	WebElement Pbxsetting;
	@FindBy(xpath = "//a[contains(.,'System Recording')]")
	WebElement Systemrecording;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(@ng-click,'addRecord();')]")
	WebElement Addrecord;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Name;
	@FindBy(xpath = "//input[@type='file']")
	WebElement File;
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	WebElement Submit;
	@FindBy(xpath = "(//div[contains(.,'Recording added successfully')])[6]")
	WebElement Success;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'vitelg')]")
	WebElement Edit;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Editclick;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Recording Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//td[contains(.,'surya')]")
	WebElement Delete;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Deleteclick;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Deleted Successfully!')]")
	WebElement Deletesuccess;
	
	
	
	
	public String add_systemrecord() throws InterruptedException {
		Pbxsetting.click();
		Thread.sleep(2000);
		Systemrecording.click();
		
		Thread.sleep(2000);
		Action.click();
		Thread.sleep(1500);
		Addrecord.click();
		Name.sendKeys("vitelg");
		File.sendKeys("C:\\Users\\Surendra\\Desktop\\1594042244.wav");
		Thread.sleep(2000);
		Submit.click();
		Thread.sleep(2000);
		String record = Success.getText();
		return record;
		
		}
	public String edit_systemrecord() throws InterruptedException  {
		
		Thread.sleep(5000);
		Edit.click();
		Action.click();
		Editclick.click();
		Name.clear();
		Thread.sleep(1500);
		Name.sendKeys("surya");
		Update.click();
		String editsuccess = Updatesuccess.getText();
		
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

}
