package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.TimeZonePage;
import webpages.UserLoginPage;
import webpages.UserTimezonePage;

public class UserTimezonePage_Test extends BaseTest {
	public UserLoginPage userloginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public UserTimezonePage usertimezonepage;
	
	public UserTimezonePage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		userloginpage = new UserLoginPage();
		userloginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		usertimezonepage= new UserTimezonePage(driver);
		
	}
	@Test(priority=1, enabled=true)
	public void timezone_validation() throws InterruptedException {
		//test = extent.createTest("timezone_validation");
		String logo = usertimezonepage.timezone_validation();
		Assert.assertEquals(logo, "Time Zone");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_timezone() throws InterruptedException {
		//test = extent.createTest("add_timezone");
		String logo = usertimezonepage.add_timezone();
		Assert.assertEquals(logo, "Timezone Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_timezone() throws InterruptedException {
		//test = extent.createTest("add_timezone");
		String logo = usertimezonepage.add_timezone();
		//Assert.assertEquals(logo, "Timezone Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
}