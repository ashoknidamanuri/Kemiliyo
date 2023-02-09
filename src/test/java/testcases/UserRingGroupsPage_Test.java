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
import webpages.UserLoginPage;
import webpages.UserRingGroupsPage;

public class UserRingGroupsPage_Test extends BaseTest{
	public UserLoginPage userloginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public UserRingGroupsPage userringgroupspage;
	
	public UserRingGroupsPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		userloginpage = new UserLoginPage();
		userloginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		userringgroupspage= new UserRingGroupsPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void ringgroup_validation() throws InterruptedException {
		//test = extent.createTest("ringgroup_validation");
		String logo = userringgroupspage.ringgroup_validation();
		Assert.assertEquals(logo, "Ring Groups");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_ringgroup() throws InterruptedException {
		//test = extent.createTest("add_ringgroup");
		String addsuccess = userringgroupspage.add_ringgroup();
		Assert.assertEquals(addsuccess, "Ring-Group Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_ringgroup() throws InterruptedException {
		//test = extent.createTest("edit_ringgroup");
		String editsuccess = userringgroupspage.edit_ringgroup();
		Assert.assertEquals(editsuccess, "Ring-Group Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void delete_ringgroup() throws InterruptedException {
		//test = extent.createTest("delete_ringgroup");
		String deletesuccess = userringgroupspage.delete_ringgroup();
		Assert.assertEquals(deletesuccess, "Ring-Group Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
