package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.RingGroupsPage;
import webpages.TimeGroupsPage;

public class TimeGroupsPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeGroupsPage timegroupspage;
	
	public TimeGroupsPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		timegroupspage= new TimeGroupsPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void timegroup_validation() throws InterruptedException {
		String logo = timegroupspage.timegroup_validation();
		Assert.assertEquals(logo, "Time Groups");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_timegroup() throws InterruptedException {
		String success = timegroupspage.add_timegroup();
		Assert.assertEquals(success, "Time Group Created successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void edit_timegroup() throws InterruptedException {
		String success1 = timegroupspage.edit_timegroup();
		Assert.assertEquals(success1, "Time Group Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void add1_timegroup() throws InterruptedException {
		String success1 = timegroupspage.add1_timegroup();
		//Assert.assertEquals(success1, "Time Group Created successfully");
		//ringgroupspage.add_ringgroup();
		
	}

}
