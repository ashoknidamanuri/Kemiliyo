package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.RingGroupsPage;
import webpages.TimeConditionsPage;

public class TimeConditionsPage_Test extends BaseTest{
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeConditionsPage timeconditionspage;
	public RingGroupsPage ringgroupspage;
	
	
	public TimeConditionsPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		timeconditionspage= new TimeConditionsPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void timecondition_validation() throws InterruptedException {
		String logo = timeconditionspage.timecondition_validation();
		Assert.assertEquals(logo, "Time Condition");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_timecondition() throws InterruptedException {
		String success = timeconditionspage.add_timecondition();
		Assert.assertEquals(success, "Time Condition Created successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_timecondition() throws InterruptedException {
		String success = timeconditionspage.edit_timecondition();
		Assert.assertEquals(success, "Time Condition Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void delete_timecondition() throws InterruptedException {
		String success = timeconditionspage.delete_timecondition();
		Assert.assertEquals(success, "Time Condition Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
