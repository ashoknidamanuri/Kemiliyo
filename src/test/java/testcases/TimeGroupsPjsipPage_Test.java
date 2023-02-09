package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.TimeGroupsPage;
import webpages.TimeGroupsPjsipPage;

public class TimeGroupsPjsipPage_Test  extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeGroupsPjsipPage timegroupspjsippage;
	
	public TimeGroupsPjsipPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		timegroupspjsippage= new TimeGroupsPjsipPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void timegroup_validation() throws InterruptedException {
		String logo = timegroupspjsippage.timegroup_validation();
		Assert.assertEquals(logo, "Time Groups");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_timegroup() throws InterruptedException {
		String success = timegroupspjsippage.add_timegroup();
		Assert.assertEquals(success, "Time Group Created successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_timegroup() throws InterruptedException {
		String success1 = timegroupspjsippage.edit_timegroup();
		Assert.assertEquals(success1, "Time Group Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=5, enabled=true)
	public void delete_timegroup() throws InterruptedException {
		String success1 = timegroupspjsippage.delete_timegroup();
		Assert.assertEquals(success1, "Time Group Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void add1_timegroup() throws InterruptedException {
		String success1 = timegroupspjsippage.add1_timegroup();
		//Assert.assertEquals(success1, "Time Group Created successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
