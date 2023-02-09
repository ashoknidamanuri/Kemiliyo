package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMusiconHoldPage extends BaseTest {
	public  UserMusiconHoldPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[contains(.,'PBX Setting')]")
	WebElement Pbxsetting;
	@FindBy(xpath = "//a[contains(.,'Music On Hold')]")
	WebElement Musiconhold;
	@FindBy(xpath = "//button[contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[contains(.,'Add')]")
	WebElement Add;
	@FindBy(xpath = "//h3[@class='box-title'][contains(.,'Music On Hold')]")
	WebElement Logo;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Name;
	@FindBy(xpath = "//input[@type='file']")
	WebElement File;
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Added successfully')]")
	WebElement Addsuccess;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'someexampletest')]")
	WebElement Edit;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Editclick;
	@FindBy(xpath = "//input[@value='Update']")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'newmusictest')]")
	WebElement Delete;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Deleteclick;
	//@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Please select atleast one Music')]")
	@FindBy(xpath = "//span[contains(.,'Name should contain only Alphabet.!')]")
	WebElement Fieldvalidation;
	
	public String musiconhold_validation() throws InterruptedException {
		Pbxsetting.click();
		//selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		//nameidentifier.click();
		Thread.sleep(1000);
		Musiconhold.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		return logo;
		
	 }
	public String add_musichold() throws InterruptedException {
		Thread.sleep(1000);
		Action.click();
		Add.click();
		Name.sendKeys("someexampletest");
		File.sendKeys("C:\\Users\\Surendra\\Desktop\\1594042244.wav");
		Thread.sleep(1500);
		Submit.click();
		
		String success = Addsuccess.getText();
		return success;
		
	}
	public String edit_musichold() throws InterruptedException {
		Thread.sleep(5000);
		Edit.click();
		Action.click();
		Editclick.click();
		Name.clear();
		Thread.sleep(2000);
		Name.sendKeys("newmusictest");
		Thread.sleep(2000);
		File.clear();
		
		Thread.sleep(2000);
		File.sendKeys("C:\\Users\\Surendra\\Desktop\\1594042244.wav");
		Thread.sleep(2000);
		Update.click();
		String update = Updatesuccess.getText();
		
		return update;
		
	}
//	public String delete_musichold() throws InterruptedException {
//		Thread.sleep(5000);
//		Delete.click();
//		Action.click();
//		Deleteclick.click();
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		//String delete_success=Deletesuccess.getText();		
//		
//		//return delete_success;
//				
//	}
	
	public String field_validation() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Add.click();
		Name.sendKeys("12364");
		Thread.sleep(2500);
		String fieldvalidation=Fieldvalidation.getText();		
		
		return fieldvalidation;
		
	}
	
//	public String file_field_validation() throws InterruptedException {
//		Thread.sleep(5000);
//		Action.click();
//		Add.click();
//		Name.sendKeys("neww");
//		File.sendKeys("C:\\Users\\Surendra\\Desktop\\adminsite issues.docx");
//		Thread.sleep(2000);
//		Submit.click();
//		
//		//String fieldvalidation=Invalidformat.getText();		
//		
//		return fieldvalidation;
//		
//		
//	}
}