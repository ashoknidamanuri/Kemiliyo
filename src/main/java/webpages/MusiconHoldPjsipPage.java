package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MusiconHoldPjsipPage extends BaseTest {
	public  MusiconHoldPjsipPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'pjsipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(.,'Music On Hold')]")
	WebElement Musichold;
	@FindBy(xpath = "//h1[contains(.,'Music On Hold')]")
	WebElement Logo;
	@FindBy(xpath = "//button[contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(@ng-click,'addMusic();')]")
	WebElement Addmusic;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Namefield;
	@FindBy(xpath = "//input[@type='file']")
	WebElement File;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Added successfully')]")
	WebElement Success;
	@FindBy(xpath = "//td[contains(.,'someexampletest')]")
	WebElement Editclick;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "//input[@value='Update']")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//td[contains(.,'newmusictest')]")
	WebElement Delete;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Deleteclick;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Deleted Successfully!')]")
	WebElement Deletesuccess;
	@FindBy(xpath = "//span[contains(.,'Name should contain only Alphabet.!')]")
	WebElement Fieldvalidation;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Invalid Format')]")
	WebElement Invalidformat;
	
	
	
	
	
	public String musiconhold_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("pjsipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Musichold.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		return logo;
		
	 }
	public String add_musichold() throws InterruptedException {
		Thread.sleep(1000);
		Action.click();
		Addmusic.click();
		Namefield.sendKeys("someexampletest");
		File.sendKeys("C:\\Users\\Surendra\\Desktop\\1594042244.wav");
		Thread.sleep(1500);
		Submit.click();
		
		String success = Success.getText();
		return success;
		
	}
	
	public String edit_musichold() throws InterruptedException {
		Thread.sleep(5000);
		Editclick.click();
		Action.click();
		Edit.click();
		Namefield.clear();
		Thread.sleep(2000);
		Namefield.sendKeys("newmusictest");
		Thread.sleep(2000);
		File.clear();
		
		Thread.sleep(2000);
		File.sendKeys("C:\\Users\\Surendra\\Desktop\\1594042244.wav");
		Thread.sleep(2000);
		Update.click();
		String update = Updatesuccess.getText();
		
		return update;
		
	}
	
	public String delete_musichold() throws InterruptedException {
		Thread.sleep(5000);
		Delete.click();
		Action.click();
		Deleteclick.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		return delete_success;
				
	}
	
	public String field_validation() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Addmusic.click();
		Namefield.sendKeys("12364");
		Thread.sleep(2500);
		String fieldvalidation=Fieldvalidation.getText();		
		
		return fieldvalidation;
		
	}
	
	public String file_field_validation() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Addmusic.click();
		Namefield.sendKeys("neww");
		File.sendKeys("C:\\Users\\Surendra\\Desktop\\adminsite issues.docx");
		Thread.sleep(2000);
		Submit.click();
		
		String fieldvalidation=Invalidformat.getText();		
		
		return fieldvalidation;
		
		
	}
	
	
	

}