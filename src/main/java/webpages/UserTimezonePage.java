package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserTimezonePage extends BaseTest {
	public  UserTimezonePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[contains(.,'PBX Setting')]")
	WebElement Pbxsetting;
	@FindBy(xpath = "//a[contains(@href,'setting/timezone')]")
	WebElement Timezone;
	@FindBy(xpath = "//select[@ng-model='tzone.timezone']")
	WebElement Timezonefield;
	@FindBy(xpath = "//h3[contains(.,'Time Zone')]")
	WebElement Logo;
	@FindBy(xpath = "//button[contains(.,'Go!')]")
	WebElement Go;
	@FindBy(xpath = "//h4[@class='ng-binding'][contains(.,'Timezone Updated successfully')]")
	WebElement Updatesuccess;
	public String timezone_validation() throws InterruptedException {
		Pbxsetting.click();
		//selectcutomer.sendKeys("sipuser");
		Thread.sleep(1000);
		//nameidentifier.click();
		Thread.sleep(1000);
		Timezone.click();
		Thread.sleep(1000);
		String logo = Logo.getText();
		return logo;
		
	 }
	public String add_timezone() throws InterruptedException {
		Thread.sleep(2000);
		Select field = new Select(Timezonefield);
		field.selectByVisibleText("EST");
		Thread.sleep(2000);
		Select field1 = new Select(Timezonefield);
		field1.selectByVisibleText("CST");
		Thread.sleep(2000);
		Select field2 = new Select(Timezonefield);
		field2.selectByVisibleText("MST");
		Thread.sleep(2000);
		Select field3 = new Select(Timezonefield);
		field3.selectByVisibleText("PST");
		Thread.sleep(2000);
		Go.click();
		
		String success = Updatesuccess.getText();
		
		return success;
		
	}


}
