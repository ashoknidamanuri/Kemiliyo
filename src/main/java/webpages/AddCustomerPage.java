package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BaseTest {
	public  AddCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[contains(.,'Customers')]")
	//@FindBy(xpath = "//span[contains(.,'Customers')]")
	WebElement Customer;
	@FindBy(xpath = "//a[contains(.,'Add Customer')]")
	WebElement Addcust;
	@FindBy(xpath = "//input[contains(@name,'uname')]")
	WebElement Uname;
	@FindBy(xpath = "//input[contains(@type,'password')]")
	WebElement Password;
	@FindBy(xpath = "//input[contains(@name,'cname')]")
	WebElement Cname;
	@FindBy(xpath = "//input[contains(@type,'email')]")
	WebElement Email;
	@FindBy(xpath = "//input[contains(@name,'phone')]")
	WebElement Phone;
	@FindBy(xpath = "//input[contains(@name,'fname')]")
	WebElement Fname;
	@FindBy(xpath = "//input[contains(@name,'lname')]")
	WebElement Lname;
	@FindBy(xpath = "//textarea[contains(@ng-model,'cust.address')]")
	WebElement Address;
	@FindBy(xpath = "//input[contains(@name,'city')]")
	WebElement City;
	@FindBy(xpath = "//select[contains(@ng-model,'cust.country')]")
	WebElement Country;
	@FindBy(xpath = "//select[contains(@ng-model,'cust.state')]")
	WebElement State;
	@FindBy(xpath = "//input[contains(@name,'zipcode')]")
	WebElement Zipcode;
	@FindBy(xpath = "//select[@ng-model='cust.plan_id']")
	WebElement Planid;
	@FindBy(xpath = "//select[contains(@ng-model,'cust.user_type_display')]")
	WebElement Customertypedisplay;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Created Successfully!')]")
	WebElement Createsuccess;
	
	 public String add_customerpjsip() throws InterruptedException {
		Thread.sleep(5000);
		Customer.click();
		Thread.sleep(2000);
		Addcust.click();
		Uname.sendKeys("pjsipuser");
		Password.sendKeys("123456");
		Cname.sendKeys("pjsip");
		Email.sendKeys("pjsip@gmail.com");
		Phone.sendKeys("9700140646");
		Fname.sendKeys("pjsip");
		Lname.sendKeys("pjsip");
		Address.sendKeys("5-72,mythrinagar,phase2,Hyderabad");
		City.sendKeys("Hyderabad");
		Thread.sleep(2000);
		Select country=new Select(Country);
		country.selectByVisibleText("India");
		Thread.sleep(2000);
		Select state=new Select(State);
		state.selectByVisibleText("Telangana");
		Thread.sleep(1500);
		Zipcode.sendKeys("500049");
		Select plan=new Select(Planid);
		plan.selectByVisibleText("Hosted PBX Unlimited");
		Thread.sleep(1500);
		Select custtype=new Select(Customertypedisplay);
		custtype.selectByVisibleText("PJSIP");
		Thread.sleep(1500);
		Submit.click();
		String success= Createsuccess.getText();
		return success;
		
	 }
	 public String add_customersip() throws InterruptedException {
		 Thread.sleep(5000);
		 Uname.sendKeys("sipuser");
			Password.sendKeys("123456");
			Cname.sendKeys("pjsip");
			Email.sendKeys("pjsip@gmail.com");
			Phone.sendKeys("9700140646");
			Fname.sendKeys("sip");
			Lname.sendKeys("sip");
			Address.sendKeys("5-72,mythrinagar,phase2,Hyderabad");
			City.sendKeys("Hyderabad");
			Thread.sleep(2000);
			Select country=new Select(Country);
			country.selectByVisibleText("India");
			Thread.sleep(2000);
			Select state=new Select(State);
			state.selectByVisibleText("Telangana");
			Thread.sleep(1500);
			Zipcode.sendKeys("500049");
			Select plan=new Select(Planid);
			plan.selectByVisibleText("Hosted PBX Unlimited");
			Thread.sleep(1500);
			Select custtype=new Select(Customertypedisplay);
			custtype.selectByVisibleText("SIP");
			Thread.sleep(1500);
			Submit.click();
			String success= Createsuccess.getText();
			return success;
		 
	
	 }
	// User & Device
	 
	 public String add_customerUserDevice() throws InterruptedException {
		 Thread.sleep(5000);
		 Uname.sendKeys("UserDeviceuser");
			Password.sendKeys("123456");
			Cname.sendKeys("pjsip");
			Email.sendKeys("pjsip@gmail.com");
			Phone.sendKeys("9700140646");
			Fname.sendKeys("UserDevice");
			Lname.sendKeys("UserDevice");
			Address.sendKeys("5-72,mythrinagar,phase2,Hyderabad");
			City.sendKeys("Hyderabad");
			Thread.sleep(2000);
			Select country=new Select(Country);
			country.selectByVisibleText("India");
			Thread.sleep(2000);
			Select state=new Select(State);
			state.selectByVisibleText("Telangana");
			Thread.sleep(1500);
			Zipcode.sendKeys("500049");
			Select plan=new Select(Planid);
			plan.selectByVisibleText("Hosted PBX Unlimited");
			Thread.sleep(1500);
			Select custtype=new Select(Customertypedisplay);
			custtype.selectByVisibleText("User & Device");
			Thread.sleep(1500);
			Submit.click();
			String success= Createsuccess.getText();
			return success;
		 
	
	 }
	 
}
