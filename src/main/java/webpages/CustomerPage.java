package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class CustomerPage extends BaseTest{
	
	@FindBy(xpath="//span[contains(text(),'Customers')]")
	WebElement custlink;
	@FindBy(xpath="//a[contains(text(),'Add Customer')]")
	WebElement addcustomer;
	@FindBy(xpath="//input[@name='uname']")
	WebElement user;
	@FindBy(xpath="//input[@name='pass']")
	WebElement pass;
	
	@FindBy(xpath="//input[@name='cname']")
	WebElement cname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='fname']")
	 WebElement fname;
	
	
	@FindBy(xpath="//input[@name='lname']")
	WebElement lname;
	
	@FindBy(xpath="//textarea[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//div[3]//div[1]//select[1]")
	WebElement country;
	@FindBy(xpath="//div[4]//div[1]//select[1]")
	WebElement state;
	
	@FindBy(xpath="//input[@name='zipcode']")
	WebElement zipcode;
	@FindBy(xpath="//div[6]//div[1]//select[1]")
	WebElement planname;
	@FindBy(xpath="//div[7]//div[1]//select[1]")
	WebElement ctype;
	
	@FindBy(xpath="//button[@class='btn btn-info pull-right']")
	WebElement create;
	public CustomerPage() {
		PageFactory.initElements(driver, this);
	}
	public void Addcustomer(String username,String password,String comapnyname,String Email,String phonenum,String firstname,String lastname,String Address,
			String cityname,String Country,String State, String Zipcode,String Planname,String Customertype) throws InterruptedException {
		
		custlink.click();
		Thread.sleep(3000);
		addcustomer.click();
		Thread.sleep(3000);
		user.sendKeys(username);
		Thread.sleep(3000);
		pass.sendKeys(password);
		Thread.sleep(3000);
		cname.sendKeys(comapnyname);
		Thread.sleep(3000);
		email.sendKeys(Email);
		Thread.sleep(3000);
		phone.sendKeys(phonenum);
		Thread.sleep(3000);
		fname.sendKeys(firstname);
		Thread.sleep(3000);
		lname.sendKeys(lastname);
		Thread.sleep(3000);
		address.sendKeys(Address);
		Thread.sleep(3000);
		city.sendKeys(cityname);
		Thread.sleep(3000);
		Select s=new Select(country);
		s.selectByVisibleText(Country);
		
		Thread.sleep(3000);
		Select m=new Select(state);
		m.selectByVisibleText(State);
		
		Thread.sleep(3000);
		zipcode.sendKeys(Zipcode);
		Thread.sleep(3000);
		Select n=new Select(planname);
		n.selectByVisibleText(Planname);
		
		Thread.sleep(3000);
		Select p=new Select(ctype);
		p.selectByVisibleText(Customertype);
		
		Thread.sleep(3000);
		create.click();
		
		
	}
	
	
	 
	

}
