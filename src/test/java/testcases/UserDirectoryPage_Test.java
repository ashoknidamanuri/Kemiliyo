package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.DirectoryPage;
import webpages.LoginPage;
import webpages.UserDirectoryPage;
import webpages.UserLoginPage;

public class UserDirectoryPage_Test extends BaseTest {
	public UserLoginPage userloginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public UserDirectoryPage userdirectorypage;
	
	public UserDirectoryPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		userloginpage = new UserLoginPage();
		userloginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		userdirectorypage= new UserDirectoryPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void directory_validation() throws InterruptedException {
		//test = extent.createTest("directory_validation");
		String logo = userdirectorypage.directory_validation();
		Assert.assertEquals(logo, "Directory");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=2, enabled=true)
	public void add_directroy() throws InterruptedException {
		//test = extent.createTest("add_directroy");
		String success = userdirectorypage.add_directroy();
		Assert.assertEquals(success, "Directory Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void edit_directroy() throws InterruptedException {
		//test = extent.createTest("edit_directroy");
		String success = userdirectorypage.edit_directory();
		Assert.assertEquals(success, "Directory Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void assign_directroy() throws InterruptedException {
		//test = extent.createTest("assign_directroy");
		String success = userdirectorypage.assign_directory();
		Assert.assertEquals(success, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=5, enabled=true)
	public void delete_directroy() throws InterruptedException {
		//test = extent.createTest("delete_directroy");
		String success = userdirectorypage.delete_directory();
		Assert.assertEquals(success, "Directory Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=6, enabled=true)
	public void withoutradioedit() throws InterruptedException {
		//test = extent.createTest("withoutradioedit");
		String success = userdirectorypage.withoutradioedit();
		Assert.assertEquals(success, "Select Atleast One Directory");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=6, enabled=true)
	public void withoutradiodelete() throws InterruptedException {
		//test = extent.createTest("withoutradiodelete");
		String success = userdirectorypage.withoutradioedit();
		Assert.assertEquals(success, "Select Atleast One Directory");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	


	

}
