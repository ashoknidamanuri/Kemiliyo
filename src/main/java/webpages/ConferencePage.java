package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class ConferencePage extends BaseTest {
	public ConferencePage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'sipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(.,'Conference')]")
	WebElement Conference;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[@ng-click='addConf();'][contains(.,'Add')]")
	WebElement Add;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Name;
	@FindBy(xpath = "//input[contains(@name,'confno')]")
	WebElement Confo;
	@FindBy(xpath = "//input[@name='pin']")
	WebElement Pin;
	@FindBy(xpath = "//input[contains(@name,'apin')]")
	WebElement Apin;
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	WebElement Submit;
	@FindBy(xpath = "//h1[contains(.,'Manage Conference')]")
	WebElement Logo;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Conference Added successfully')]")
	WebElement Success;
	@FindBy(xpath = "//td[contains(.,'965965')]")
	WebElement Edit;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Editclick;
	@FindBy(xpath = "//input[@value='Update']")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Conference Updated successfully')]")
	WebElement Editupdate;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Conference Deleted successfully')]")
	WebElement Deletesuccess;
	
	
	
	
	public String conferencepage_validation() throws InterruptedException {
		Thread.sleep(5000);
		managepbx.click();
		Thread.sleep(1500);
		selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		//nameidentifier.click();
	//	btnclick.click();
		//Thread.sleep(2000);
		//Extension.click();
		Thread.sleep(1500);
		Conference.click();
		Thread.sleep(1500);
		String logo=Logo.getText();
		return logo;
	}
	
	public String add_conferencepage() throws InterruptedException {
		Thread.sleep(2500);
		Action.click();
		Add.click();
		Name.sendKeys("tester");
		Confo.sendKeys("965965");
		Pin.sendKeys("12345");
		Apin.sendKeys("321");
		Thread.sleep(3500);
		Submit.click();
		String success=Success.getText();
		return success;
		
		
		//return null;
		
	}
	public String edit_conferencepage() throws InterruptedException {
		Thread.sleep(5000);
		Edit.click();
		Action.click();
		Editclick.click();
		Name.clear();
		Thread.sleep(2000);
		Name.sendKeys("newconference");
		Pin.clear();
		Thread.sleep(2500);
		Pin.sendKeys("1236");
		Thread.sleep(1500);
		Apin.clear();
		Thread.sleep(1500);
		Apin.sendKeys("3256");
		Update.click();
		String success=Editupdate.getText();
		return success;
		
		//return null;
		
	}
	public String delete_conferencepage() throws InterruptedException {
		Thread.sleep(5000);
		Edit.click();
		Action.click();
		Delete.click();
		driver.switchTo().alert().accept();
		String delete_success=Deletesuccess.getText();		
		return delete_success;
		
		//return null;
		
	}

}
