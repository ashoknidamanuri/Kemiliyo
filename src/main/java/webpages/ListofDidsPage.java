package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class ListofDidsPage extends BaseTest {
	public  ListofDidsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'sipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "(//a[contains(@class,'btn btn-app ')])[1]")
	WebElement Listofdid;
	@FindBy(xpath = "//h1[contains(.,'DID List')]")
	WebElement Logo;
	@FindBy(xpath = "//button[contains(@data-toggle,'dropdown')]")
	WebElement Action;
	@FindBy(xpath = "(//a[contains(.,'Add')])[3]")
	WebElement Add;
	@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
	WebElement Didnumber;
	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
	WebElement Diddescription;
	@FindBy(xpath = "(//select[contains(@type,'text')])[1]")
	WebElement Cfstatus;
	@FindBy(xpath = "(//select[contains(@type,'text')])[2]")
	WebElement Directoryname;
	@FindBy(xpath = "(//select[contains(@type,'text')])[3]")
	WebElement Destination;
	@FindBy(xpath = "(//select[contains(@type,'text')])[4]")
	WebElement Destinationtype;
	@FindBy(xpath = "(//select[contains(@type,'text')])[5]")
	WebElement Callrecording;
	//@FindBy(xpath = "(//button[@type='submit'])[2]")
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Created Successfully!')]")
	WebElement Submitsuccess;
	@FindBy(xpath = "//p[@class='ng-binding'][contains(.,'Already Exists')]")
	WebElement Allreadyexists;
	@FindBy(xpath = "(//input[contains(@type,'text')])[4]")
	WebElement Callforwardnumber;
	@FindBy(xpath = "//td[contains(.,'9766664466')]")
	WebElement Editcheck;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated Successfully!')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//p[@class='ng-binding'][contains(.,'Already Exists')]")
	WebElement Allreadyexit;
	
	
	
	
	public String listofdid_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Listofdid.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		//System.out.println(logo);
		return logo;
		
	}
	public String add_listofdid() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Add.click();
		Didnumber.sendKeys("9700643516");
		Diddescription.sendKeys("welcome");
		Select cfs = new Select(Cfstatus);
		cfs.selectByVisibleText("Disable");
		Select directory = new Select(Directoryname);
		directory.selectByVisibleText("test");
		Select destination = new Select(Destination);
		destination.selectByVisibleText("Extension");
		Select destinationvalue = new Select(Destinationtype);
		destinationvalue.selectByVisibleText("158-123");
		Select callrecord = new Select(Callrecording);
		callrecord.selectByVisibleText("Disable");
		Submit.click();
		String success = Submitsuccess.getText();
		
		return success;
		
	}
	public String add_callforwardfield() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Add.click();
		Didnumber.sendKeys("9761664416");
		Diddescription.sendKeys("welcome");
		Select cfs = new Select(Cfstatus);
		cfs.selectByVisibleText("Enable");
		Thread.sleep(2000);
		Callforwardnumber.sendKeys("9866449323");
		Select directory = new Select(Directoryname);
		directory.selectByVisibleText("test");
		Thread.sleep(2000);
		//Select destination = new Select(Destination);
		//destination.selectByVisibleText("Extension");
		//Select destinationvalue = new Select(Destinationtype);
		//destinationvalue.selectByVisibleText("91-12365");
		//Select callrecord = new Select(Callrecording);
		//Thread.sleep(2000);
		//callrecord.selectByVisibleText("Enable");
		//Thread.sleep(2000);
		Submit.click();
		String success = Submitsuccess.getText();
		
		return success;
		
	}
	public String addsamedid_listofdid() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Add.click();
		Didnumber.sendKeys("9766775588");
		Diddescription.click();
		//Select cfs = new Select(Cfstatus);
		//cfs.selectByVisibleText("Disable");
		//Select directory = new Select(Directoryname);
		//directory.selectByVisibleText("test");
		//Select destination = new Select(Destination);
		//destination.selectByVisibleText("Extension");
		//Select destinationvalue = new Select(Destinationtype);
		//destinationvalue.selectByVisibleText("91-12365");
		//Select callrecord = new Select(Callrecording);
		//callrecord.selectByVisibleText("Disable");
		//Submit.click();
		String success = Allreadyexists.getText();
		
		return success;
		
	}
	public String edit_listdid() throws InterruptedException {
		       Thread.sleep(5000);
		
		        Editcheck.click();
		        Action.click();
		        Edit.click();
		        Select cfs = new Select(Cfstatus);
				cfs.selectByVisibleText("Disable");
				Thread.sleep(5000);
				Select directory = new Select(Directoryname);
				//directory.selectByVisibleText("test");
				Select destination = new Select(Destination);
				destination.selectByVisibleText("Extension");
				Thread.sleep(3000);
				Select destinationvalue = new Select(Destinationtype);
				destinationvalue.selectByVisibleText("91-12365");
				//Select callrecord = new Select(Callrecording);
				//callrecord.selectByVisibleText("Disable");
				Update.click();
				String success = Updatesuccess.getText();
				return success;
	}
	
	public String same_didnumber() throws InterruptedException {
		Thread.sleep(5000);
		Didnumber.sendKeys("9700443366");
		Thread.sleep(2000);
		String success = Allreadyexit.getText();
		return success;
		
		 
	}

}
