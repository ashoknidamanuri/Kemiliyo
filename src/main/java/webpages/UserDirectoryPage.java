package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDirectoryPage extends BaseTest {
	public  UserDirectoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[contains(.,'PBX Setting')]")
	WebElement Pbxsetting;
	@FindBy(xpath = "//a[contains(.,'Directory')]")
	WebElement Directory;
	@FindBy(xpath = "//button[contains(.,'Action')]")
	WebElement Action;
	@FindBy(xpath = "//h3[@class='box-title'][contains(.,'Directory')]")
	WebElement Logo;
	@FindBy(xpath = "//a[contains(.,'Add')]")
	WebElement Add;
	@FindBy(xpath = "//input[@name='name']")
	WebElement Name;
	@FindBy(xpath = "//button[contains(.,'Create Directory')]")
	WebElement Submit;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Directory Added successfully')]")
	WebElement Success;
	@FindBy(xpath = "//td[contains(.,'newdirectory')]")
	WebElement Edit;
	@FindBy(xpath = "//a[contains(.,'Edit')]")
	WebElement Editclick;
	@FindBy(xpath = "//button[@type='submit'][contains(.,'Update Directory')]")
	WebElement Update;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Directory Updated successfully')]")
	WebElement Updatesucess;
	@FindBy(xpath = "//a[@ng-click='assignedExtList();'][contains(.,'Assigned Ext')]")
	WebElement Assigned;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement Checkbox;
	@FindBy(xpath = "//button[@ng-click='directoryExtUpdate();']")
	WebElement Assignupdate;
	@FindBy(xpath = "//div[@ng-show='alertMsg'][contains(.,'Updated Successfully!')]")
	WebElement Assignupdatesuccess;
	@FindBy(xpath = "//td[contains(.,'newdirectoryy')]")
	WebElement Deleteclick;
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Directory Deleted successfully')]")
	WebElement DeleteSuccess;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Select Atleast One Directory')]")
	WebElement Withoutselect;
	
	
	public String directory_validation() throws InterruptedException {
		Pbxsetting.click();
		//selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		//nameidentifier.click();
		Thread.sleep(1000);
		Directory.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
	
		return logo;
		
	}
	
	public String add_directroy() throws InterruptedException {
		
		Thread.sleep(1000);
		Action.click();
		Add.click();
		Name.sendKeys("newdirectory");
		Submit.click();
		String success = Success.getText();
		
		return success;
	
	}
	public String edit_directory() throws InterruptedException {
		Thread.sleep(5000);
		Edit.click();
		Action.click();
		Editclick.click();
		Name.clear();
		Thread.sleep(3000);
		Name.sendKeys("newdirectoryy");
		Thread.sleep(1000);
		Update.click();
		String success = Updatesucess.getText();
		
		return success;
	
	}
	public String assign_directory() throws InterruptedException {
		
		Thread.sleep(5000);
		
		Edit.click();
		Action.click();
		Assigned.click();
		Checkbox.click();
		Assignupdate.click();
		String success = Assignupdatesuccess.getText();
		
		return success;
	
		
	}
	public String delete_directory() throws InterruptedException {
		Thread.sleep(5000);
		Deleteclick.click();
		Action.click();
		Delete.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String delete_success=DeleteSuccess.getText();		
		return delete_success;
		
	}
	public String withoutradioedit( ) throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Editclick.click();
		String withoutedit=Withoutselect.getText();		
		
		
		return withoutedit;
		
		 
		
	}
	
	public String withoutradiodelete() throws InterruptedException {
		Thread.sleep(5000);
		Action.click();
		Delete.click();
		String withoutedit=Withoutselect.getText();		
		
		
		return withoutedit;
		
		 
		
	}
	
}
