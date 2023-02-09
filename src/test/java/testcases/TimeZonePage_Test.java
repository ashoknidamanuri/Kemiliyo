package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.ListofExtensionsPage;
import webpages.LoginPage;
import webpages.TimeZonePage;

public class TimeZonePage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeZonePage timezonepage;
	
	public TimeZonePage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		timezonepage= new TimeZonePage(driver);
		
	}
	@Test(priority=1, enabled=true)
	public void timezone_validation() throws InterruptedException {
		String logo = timezonepage.timezone_validation();
		Assert.assertEquals(logo, "Timezone");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_timezone() throws InterruptedException {
		String logo = timezonepage.add_timezone();
		Assert.assertEquals(logo, "Timezone Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
