package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webpages.BaseTest;

public class DirectoryPage extends BaseTest {
	public  DirectoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[contains(text(),'Manage PBX')]")
	WebElement managepbx;
	@FindBy(xpath="//input[@id='cust']")
	WebElement selectcutomer;
	@FindBy(xpath = "//li[@ng-repeat='list in customerlist'][contains(.,'sipuser')]")
	WebElement nameidentifier;
	@FindBy(xpath = "//a[contains(@href,'setting/directory')]")
	WebElement Directory;
	@FindBy(xpath = "//button[@data-toggle='dropdown'][contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//a[@ng-click='addDirectory();'][contains(.,'Add')]")
	WebElement Addaction;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Namefield;
	@FindBy(xpath = "//button[@ng-hide='actionBtn']")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Directory Added successfully')]")
	WebElement Addedsuccess;
	@FindBy(xpath = "//h1[contains(.,'Directory')]")
	WebElement Logo;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'newdirectory')]")
	WebElement Editselect;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Update Directory')]")
	WebElement Updatedirectory;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Directory Updated successfully')]")
	WebElement Updatesuccess;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Edit;
	@FindBy(xpath = "//a[contains(@ng-click,'assignedExtList();')]")
	WebElement Assign;
	@FindBy(xpath = "(//input[@name='extlistdirectorys'])[1]")
	WebElement Selectextension;
	@FindBy(xpath = "//button[contains(@ng-click,'directoryExtUpdate();')]")
	WebElement Selectext;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Updated Successfully!')]")
	WebElement Updateassign;
	@FindBy(xpath = "//td[@class='ng-binding'][contains(.,'newdirectoryy')]")
	WebElement Deleteclick;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Deleteaction;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Directory Deleted successfully')]")
	WebElement Deletesuccess;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Select Atleast One Directory')]")
	WebElement Withoutselect;
	
	
	public String directory_validation() throws InterruptedException {
		managepbx.click();
		selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		nameidentifier.click();
		Thread.sleep(1000);
		Directory.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
	
		return logo;
		
	}
	
	public String add_directroy() throws InterruptedException {
		
		Thread.sleep(1000);
		Action.click();
		Addaction.click();
		Namefield.sendKeys("newdirectory");
		Submit.click();
		String success = Addedsuccess.getText();
		
		return success;
	
	}
	
	public String edit_directory() throws InterruptedException {
		Thread.sleep(5000);
		Editselect.click();
		Action.click();
		Edit.click();
		Namefield.clear();
		Thread.sleep(3000);
		Namefield.sendKeys("newdirectoryy");
		Thread.sleep(1000);
		Updatedirectory.click();
		String success = Updatesuccess.getText();
		
		return success;
	
	}
	
	public String assign_directory() throws InterruptedException {
		
		Thread.sleep(5000);
		
		Editselect.click();
		Action.click();
		Assign.click();
		Selectextension.click();
		Selectext.click();
		String success = Updateassign.getText();
		
		return success;
	
		
	}
	
	public String delete_directory() throws InterruptedException {
		Thread.sleep(5000);
		Deleteclick.click();
		Action.click();
		Deleteaction.click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=Deletesuccess.getText();		
		
		
		return delete_success;
		
	}
	
	public String withoutradioedit( ) throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Edit.click();
		String withoutedit=Withoutselect.getText();		
		
		
		return withoutedit;
		
		 
		
	}
	
	public String withoutradiodelete() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Deleteaction.click();
		String withoutedit=Withoutselect.getText();		
		
		
		return withoutedit;
		
		 
		
	}

}
