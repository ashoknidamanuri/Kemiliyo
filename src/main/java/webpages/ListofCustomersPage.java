package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListofCustomersPage extends BaseTest {
	public  ListofCustomersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[contains(.,'Customers')]")
	WebElement Customer;
	@FindBy(xpath = "//a[contains(.,'List of Customers')]")
	WebElement Listofcustomer;
	@FindBy(xpath = "//input[contains(@ng-model,'keywords')]")
	WebElement Searchkey;
	@FindBy(xpath = "(//td[@class='ng-binding'][contains(.,'polo')])[1]")
	WebElement Radioclick;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "//input[@name='cname']")
	WebElement Cname;
	@FindBy(xpath = "//input[@name='fname']")
	WebElement Fname;
	@FindBy(xpath = "//input[@name='city']")
	WebElement City;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement Submit;
	@FindBy(xpath = "(//h4[@class='ng-binding'][contains(.,'Updated Successfully!')])[1]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//a[contains(.,'View')]")
	WebElement View;
	@FindBy(xpath = "//h4[@class='modal-title ng-binding'][contains(.,'polo - Details')]")
	WebElement Poloview;
	@FindBy(xpath = "(//button[@type='button'][contains(.,'×')])[3]")
	WebElement Close;
	

	public String listcustomer() throws InterruptedException {
		Thread.sleep(5000);
		//Customer.click();
		//Listofcustomer.click();
		Searchkey.clear();
		Thread.sleep(2000);
		Searchkey.sendKeys("polo");
		Thread.sleep(5000);
		Radioclick.click();
		Action.click();
		Edit.click();
		Thread.sleep(1500);
		Cname.clear();
		Thread.sleep(1500);
		Cname.sendKeys("polarsystem");
		Thread.sleep(1500);
		Fname.clear();
		Thread.sleep(1500);
		Fname.sendKeys("india");
		Thread.sleep(1000);
		Submit.click();
		String success = Updatesuccess.getText();
		
		return success;
		
	
	}
	
	public String view() throws InterruptedException {
		Thread.sleep(5000);
		Customer.click();
		Listofcustomer.click();
		Searchkey.sendKeys("polo");
		Thread.sleep(2000);
		Radioclick.click();
		Action.click();
		View.click();
		Thread.sleep(1500);
		Close.click();
		return null;
				
	}
	

}
