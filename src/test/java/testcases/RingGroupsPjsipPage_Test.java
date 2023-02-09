package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.RingGroupsPage;
import webpages.RingGroupsPjsipPage;

public class RingGroupsPjsipPage_Test extends BaseTest{
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public RingGroupsPjsipPage ringgroupspjsippage;
	
	public RingGroupsPjsipPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		ringgroupspjsippage= new RingGroupsPjsipPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void ringgroup_validation() throws InterruptedException {
		//test = extent.createTest("ringgroup_validation");
		String logo = ringgroupspjsippage.ringgroup_validation();
		Assert.assertEquals(logo, "Ring Group");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_ringgroup() throws InterruptedException {
		//test = extent.createTest("add_ringgroup");
		String addsuccess = ringgroupspjsippage.add_ringgroup();
		Assert.assertEquals(addsuccess, "Ring-Group Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_ringgroup() throws InterruptedException {
		//test = extent.createTest("edit_ringgroup");
		String editsuccess = ringgroupspjsippage.edit_ringgroup();
		Assert.assertEquals(editsuccess, "Ring-Group Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void delete_ringgroup() throws InterruptedException {
		//test = extent.createTest("delete_ringgroup");
		String deletesuccess = ringgroupspjsippage.delete_ringgroup();
		Assert.assertEquals(deletesuccess, "Ring-Group Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
