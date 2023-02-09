package webpages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class ListofExtensionsUserDevice extends BaseTest {
	public  ListofExtensionsUserDevice(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'global')]")
	WebElement nameidentifier;
	@FindBy(xpath = "(//a[contains(@href,'extension')])[2]")
	//@FindBy(xpath = "//a[@href='http://123.108.80.102/viteladmin/assigned_extension']")
	WebElement Extension;
	@FindBy(xpath = "(//span[@ng-hide='headopens'][contains(.,'List of Extensions')])[1]")
	WebElement Logo;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "(//a[contains(.,'Add')])[3]")
	WebElement Add;
	@FindBy(xpath = "(//input[@id='enumber'])[1]")
	WebElement Extensionfield;
	@FindBy(xpath = "//button[@type='button'][contains(.,'Generate Password')]")
	WebElement Password;
	@FindBy(xpath = "//input[contains(@name,'callID')]")
	WebElement Callid;
	@FindBy(xpath = "//select[@ng-model='did.sub_group']")
	WebElement Directory;
	@FindBy(xpath = "//input[contains(@name,'extname')]")
	WebElement Displayname;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Create')]")
	WebElement Create;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Extension(s) Added successfully')]")
	WebElement Success;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'vital')]")
	WebElement Editid;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Editclick;
	@FindBy(xpath = "(//button[@type='submit'][contains(.,'Update')])[1]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Extension(s) Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'786')]")
	WebElement Editfollow;
	@FindBy(xpath = "//select[contains(@ng-model,'followmedata.followme_status')]")
	WebElement ffenable;
	@FindBy(xpath = "//textarea[contains(@ng-model,'followmedata.followme_num')]")
	WebElement Followlist;
	@FindBy(xpath = "//select[contains(@ng-model,'followmedata.followme_ring_first')]")
	WebElement Ringfirst;
	@FindBy(xpath = "//select[contains(@ng-model,'followmedata.followme_ring_second')]")
	WebElement Ringfoloowlist;
	@FindBy(xpath = "//select[contains(@ng-model,'followmedata.followme_strategy')]")
	WebElement Ringstar;
	@FindBy(xpath = "//select[contains(@ng-change,'frwd);')]")
	WebElement Destination;
	@FindBy(xpath = "//select[@ng-model='followmedata.destination_type_value_frwd']")
	WebElement Destinationlist;
	@FindBy(xpath = "//a[contains(.,'FollowMe')]")
	WebElement Followme;
	@FindBy(xpath = "//button[contains(@ng-disabled,'extForm.$invalid')]")
	WebElement Followmeupdate;
	//@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated Successfully!')]")
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated Successfully!')]")
	WebElement Success1;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Extension(s) Deleted successfully')]")
	WebElement Deletesuccess;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated Successfully!')]")
	WebElement ffupdate;
	@FindBy(xpath = "//a[@ng-click='editBulkExt();'][contains(.,'Bulk Extension Update')]")
	WebElement Bulk;
	@FindBy(xpath = "//select[contains(@ng-model,'bulk.ring_time')]")
	WebElement Checkringtime;
	@FindBy(xpath = "(//button[contains(@type,'submit')])[9]")
	WebElement Update1;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Extension(s) Updated successfully')]")
	WebElement Updatesuccess1;
	@FindBy(xpath = "//select[contains(@ng-model,'did.qualify_frequency')]")
	WebElement Frequency;
	@FindBy(xpath = "//input[@name='max_contacts']")
	WebElement Maxcontacts;
	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement Userdevice;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Create')]")
	WebElement Submit1;
	
	
	
	
	public String extension_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("global");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Extension.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		return logo;
		
	 }
	
	public String generate_extension(int length) {

		   return RandomStringUtils.random( length, "123456789");
		 
		}
	public String num;
	
	public String add_extension() throws InterruptedException {
		Thread.sleep(1000);
		Action.click();
		Add.click();
		num = generate_extension(6);
		Extensionfield.sendKeys(num);
		Password.click();
		Thread.sleep(1500);
		Password.click();
		Callid.sendKeys("687");
		Thread.sleep(1000);
		//Select directory=new Select(Directory);
		 
		//directory.selectByVisibleText("surendra");
		//Directory.sendKeys("");
		Displayname.sendKeys("vital");
		//Select directory=new Select(Frequency);
		 
		//directory.selectByVisibleText("6");
		//Thread.sleep(1000);
		//Maxcontacts.sendKeys("2");
		//Create.click();
		Userdevice.sendKeys("12345");
		Thread.sleep(1500);
		Create.click();
		String success = Success.getText();
		return success;
		
		
			 
	}
	
	public String edit_extension() throws InterruptedException {
		Thread.sleep(5000);
		Editid.click();
		Action.click();
		Editclick.click();
		Callid.clear();
		Thread.sleep(2000);
		Callid.sendKeys("786");
		Thread.sleep(2000);
		Update.click();
		String success = Updatesuccess.getText();
		return success;
	
	}
	
	public String followme_extension() throws InterruptedException {
		Thread.sleep(5000);
		Editfollow.click();
		Action.click();
		Followme.click();
		Thread.sleep(1500);
		Select enable=new Select(ffenable);
		enable.selectByVisibleText("Enable");
		Followlist.sendKeys("102");
		Select enable1=new Select(Ringfirst);
		enable1.selectByVisibleText("2");
		Select enable2=new Select(Ringfoloowlist);
		enable2.selectByVisibleText("2");
		Select enable3=new Select(Ringstar);
		enable3.selectByVisibleText("ringall");
		Select enable4=new Select(Destination);
		enable4.selectByVisibleText("Phonebook Directory");
		Thread.sleep(3000);
		//Select enable5=new Select(Destinationlist);
		//enable5.selectByVisibleText("RM");
		Followmeupdate.click();
		
		
		String suc1 = Success1.getText();
		return suc1;
		
		
	}
	
	public String edit_follow_extension() throws InterruptedException {
		Thread.sleep(5000);
		Editfollow.click();
		Action.click();
		Followme.click();
		Thread.sleep(2500);
		Followlist.clear();
		//Followlist.clear();
		Thread.sleep(1000);
		Followlist.sendKeys("106,107");
		Select enable4=new Select(Destination);
		enable4.selectByVisibleText("Extension");
		Thread.sleep(3000);
		Select enable5=new Select(Destinationlist);
		enable5.selectByVisibleText("126-1236");
		Followmeupdate.click();
		String suc2 = ffupdate.getText();
		//return suc2;
		System.out.println("suc2");
		return suc2;
		
	}
	
	public String check_bulk_extension() throws InterruptedException {
		Thread.sleep(5000);
		Editfollow.click();
		Action.click();
		Bulk.click();
		Thread.sleep(2000);
		Select enable6=new Select(Checkringtime);
		enable6.selectByVisibleText("25");
		Update1.click();
		String updatesuc=Updatesuccess1.getText();
		
		return updatesuc;
		//Thread.sleep(5000);
		
		
	}
	
	public String delete_extension() throws InterruptedException {
		Thread.sleep(5000);
		Editfollow.click();
		Action.click();
		Delete.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
		 
		
	}
	
	public String addsame_extension() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Add.click();
		Extensionfield.sendKeys("52634");
		
		return null;
		
	}
}

