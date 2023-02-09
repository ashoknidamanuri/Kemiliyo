package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TimeGroupsPjsipPage extends BaseTest {
	public  TimeGroupsPjsipPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'pjsipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(.,'Time Groups')]")
	WebElement Timegroup;
	@FindBy(xpath = "//h1[contains(.,'Time Groups')]")
	WebElement Logo;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[@ng-click='addTimegrp();'][contains(.,'Add')]")
	WebElement Addaction;
	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement Namefiled;
	@FindBy(xpath = "(//select[contains(@id,'0')])[1]")
	WebElement Timestart1;
	@FindBy(xpath = "(//select[contains(@id,'0')])[2]")
	WebElement Timestart2;
	@FindBy(xpath = "(//select[contains(@id,'0')])[3]")
	WebElement Timestart3;
	@FindBy(xpath = "(//select[contains(@id,'0')])[4]")
	WebElement Timestart4;
	@FindBy(xpath = "//select[contains(@name,'wds_0')]")
	WebElement Weekdaystart;
	@FindBy(xpath = "(//select[contains(@id,'0')])[6]")
	WebElement Weekdayend;
	@FindBy(xpath = "(//select[contains(@id,'0')])[7]")
	WebElement Monthdaystart;
	@FindBy(xpath = "(//select[contains(@id,'0')])[8]")
	WebElement Monthdayend;
	@FindBy(xpath = "(//select[contains(@id,'0')])[9]")
	WebElement Monthstart;
	@FindBy(xpath = "(//select[contains(@id,'0')])[10]")
	WebElement Monthend;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Submit')]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Time Group Created successfully')]")
	WebElement Submitsuccess;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Update')]")
	//@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Time Group Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "(//td[contains(.,'newtester')])[1]")
	//@FindBy(xpath = "//td[contains(.,'newtest')]")
	WebElement Editselect;
	@FindBy(xpath = "(//select[contains(@id,'1')])[1]")
	WebElement Timestart01;
	@FindBy(xpath = "(//select[contains(@id,'1')])[2]")
	WebElement Timestart02;
	@FindBy(xpath = "(//select[contains(@id,'1')])[3]")
	WebElement Timestart03;
	@FindBy(xpath = "(//select[contains(@id,'1')])[4]")
	WebElement Timestart04;
	@FindBy(xpath = "(//select[contains(@id,'1')])[5]")
	WebElement Weekdaystart1;
	@FindBy(xpath = "(//select[contains(@id,'1')])[6]")
	WebElement Weekdayend1;
	@FindBy(xpath = "(//select[contains(@id,'1')])[7]")
	WebElement Monthdaystart1;
	@FindBy(xpath = "(//select[contains(@id,'1')])[8]")
	WebElement Monthdayend1;
	@FindBy(xpath = "(//select[contains(@id,'1')])[9]")
	WebElement Monthstart1;
	@FindBy(xpath = "(//select[contains(@id,'1')])[10]")
	WebElement Monthend1;
	@FindBy(xpath = "(//button[contains(@type,'button')])[3]")
	WebElement add1;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Time Group Deleted successfully')]")
	WebElement Deletesuccess;
	
	public String timegroup_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("pjsipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Timegroup.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		//System.out.println(logo);
		return logo;
		
	}
	
	public String add_timegroup() throws InterruptedException {
		Thread.sleep(2000);
		Action.click();
		Addaction.click();
		Namefiled.sendKeys("newtester");
		//Timestart1
		Thread.sleep(2000);
		Select timestart = new Select(Timestart1);
		timestart.selectByVisibleText("02");
		Thread.sleep(2000);
		Select timestar2 = new Select(Timestart2);
		timestar2.selectByVisibleText("02");
		Thread.sleep(2000);
		Select timestar3 = new Select(Timestart3);
		timestar3.selectByVisibleText("04");
		Thread.sleep(2000);
		Select timestar4 = new Select(Timestart4);
		timestar4.selectByVisibleText("04");
		Thread.sleep(2000);
		Select weekdaystart = new Select(Weekdaystart);
		weekdaystart.selectByVisibleText("Monday");
		Thread.sleep(2000);
		Select weekdayend = new Select(Weekdayend);
		weekdayend.selectByVisibleText("Saturday");
		Thread.sleep(2000);
		Select monthdaystart = new Select(Monthdaystart);
		monthdaystart.selectByVisibleText("2");
		Thread.sleep(2000);
		Select monthdayend = new Select(Monthdayend);
		monthdayend.selectByVisibleText("30");
		Thread.sleep(2000);
		Select monthstart = new Select(Monthstart);
		monthstart.selectByVisibleText("January");
		Thread.sleep(2000);
		Select monthend = new Select(Monthend);
		monthend.selectByVisibleText("December");
		Submit.click();
		
		String Success = Submitsuccess.getText();
		//System.out.println(logo);
		return Success;
		
	}
	
	public String edit_timegroup() throws InterruptedException {
		Thread.sleep(5000);
		Editselect.click();
		Action.click();
		Edit.click();
		Namefiled.clear();
		Namefiled.sendKeys("newtime");
		Select timestart = new Select(Timestart1);
		timestart.selectByVisibleText("11");
		Thread.sleep(2000);
		Select timestar2 = new Select(Timestart2);
		timestar2.selectByVisibleText("12");
		Thread.sleep(2000);
		Select timestar3 = new Select(Timestart3);
		timestar3.selectByVisibleText("18");
		Thread.sleep(2000);
		Select timestar4 = new Select(Timestart4);
		timestar4.selectByVisibleText("18");
		Thread.sleep(2000);
		Select weekdaystart = new Select(Weekdaystart);
		weekdaystart.selectByVisibleText("Sunday");
		Thread.sleep(2000);
		Select weekdayend = new Select(Weekdayend);
		weekdayend.selectByVisibleText("Friday");
		Thread.sleep(2000);
		Select monthdaystart = new Select(Monthdaystart);
		monthdaystart.selectByVisibleText("5");
		Thread.sleep(2000);
		Select monthdayend = new Select(Monthdayend);
		monthdayend.selectByVisibleText("25");
		Thread.sleep(2000);
		Select monthstart = new Select(Monthstart);
		monthstart.selectByVisibleText("January");
		Thread.sleep(2000);
		Select monthend = new Select(Monthend);
		monthend.selectByVisibleText("December");
		Thread.sleep(1500);
		Update.click();
		String suc1 = Updatesuccess.getText();
		//System.out.println(logo);
		return suc1;
		//return null;
		
	}
	
	public String add1_timegroup() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Addaction.click();
		Namefiled.sendKeys("newtesttest");
		Thread.sleep(2000);
		Select timestart = new Select(Timestart1);
		timestart.selectByVisibleText("02");
		Thread.sleep(2000);
		Select timestar2 = new Select(Timestart2);
		timestar2.selectByVisibleText("02");
		Thread.sleep(2000);
		Select timestar3 = new Select(Timestart3);
		timestar3.selectByVisibleText("04");
		Thread.sleep(2000);
		Select timestar4 = new Select(Timestart4);
		timestar4.selectByVisibleText("04");
		Thread.sleep(2000);
		Select weekdaystart = new Select(Weekdaystart);
		weekdaystart.selectByVisibleText("Monday");
		Thread.sleep(2000);
		Select weekdayend = new Select(Weekdayend);
		weekdayend.selectByVisibleText("Saturday");
		Thread.sleep(2000);
		Select monthdaystart = new Select(Monthdaystart);
		monthdaystart.selectByVisibleText("2");
		Thread.sleep(2000);
		Select monthdayend = new Select(Monthdayend);
		monthdayend.selectByVisibleText("30");
		Thread.sleep(2000);
		Select monthstart = new Select(Monthstart);
		monthstart.selectByVisibleText("January");
		Thread.sleep(2000);
		Select monthend = new Select(Monthend);
		monthend.selectByVisibleText("December");
		//Timestart1
		
		Thread.sleep(2000);
		add1.click();
		Thread.sleep(3000);
		Select timestart01 = new Select(Timestart01);
		timestart01.selectByVisibleText("02");
		Thread.sleep(2000);
		Select timestar02 = new Select(Timestart02);
		timestar02.selectByVisibleText("02");
		Thread.sleep(2000);
		Select timestar03 = new Select(Timestart03);
		timestar03.selectByVisibleText("04");
		Thread.sleep(2000);
		Select timestar04 = new Select(Timestart04);
		timestar04.selectByVisibleText("04");
		Thread.sleep(2000);
		Select weekdaystart1 = new Select(Weekdaystart1);
		weekdaystart1.selectByVisibleText("Monday");
		Thread.sleep(2000);
		Select weekdayend1 = new Select(Weekdayend1);
		weekdayend1.selectByVisibleText("Saturday");
		Thread.sleep(2000);
		Select monthdaystart1 = new Select(Monthdaystart1);
		monthdaystart1.selectByVisibleText("2");
		Thread.sleep(2000);
		Select monthdayend1 = new Select(Monthdayend1);
		monthdayend1.selectByVisibleText("30");
		Thread.sleep(2000);
		Select monthstart1 = new Select(Monthstart1);
		monthstart1.selectByVisibleText("January");
		Thread.sleep(2000);
		Select monthend1 = new Select(Monthend1);
		monthend1.selectByVisibleText("December");
		
		Submit.click();
		
		String Success = Submitsuccess.getText();
		//System.out.println(logo);
		return Success;
		
	}
	public String delete_timegroup() throws InterruptedException {
		Thread.sleep(5000);
		Editselect.click();
		Action.click();
		Delete.click();
		driver.switchTo().alert().accept();
		//Switch to alert.click()
		String delete_success=Deletesuccess.getText();
		return delete_success;
		//return null;
		
	}
	

} 
