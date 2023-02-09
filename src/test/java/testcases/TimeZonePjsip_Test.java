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
import webpages.TimeZonePjsip;

public class TimeZonePjsip_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeZonePjsip timezonepjsip;
	
	public TimeZonePjsip_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		timezonepjsip= new TimeZonePjsip(driver);
		
	}
	@Test(priority=1, enabled=true)
	public void timezone_validation() throws InterruptedException {
		//test = extent.createTest("timezone_validation");
		String logo = timezonepjsip.timezone_validation();
		Assert.assertEquals(logo, "Timezone");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_timezone() throws InterruptedException {
		//test = extent.createTest("add_timezone");
		String logo = timezonepjsip.add_timezone();
		Assert.assertEquals(logo, "Timezone Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_timezone() throws InterruptedException {
		//test = extent.createTest("add_timezone");
		String logo = timezonepjsip.add_timezone();
		//Assert.assertEquals(logo, "Timezone Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
 
