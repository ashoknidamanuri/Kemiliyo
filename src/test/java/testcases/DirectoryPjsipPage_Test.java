package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.DirectoryPage;
import webpages.DirectoryPjsipPage;
import webpages.LoginPage;

public class DirectoryPjsipPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public DirectoryPjsipPage directorypjsippage;
	
	public DirectoryPjsipPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		directorypjsippage= new DirectoryPjsipPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void directory_validation() throws InterruptedException {
		//test = extent.createTest("directory_validation");
		String logo = directorypjsippage.directory_validation();
		Assert.assertEquals(logo, "Directory");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=2, enabled=true)
	public void add_directroy() throws InterruptedException {
		//test = extent.createTest("add_directroy");
		String success = directorypjsippage.add_directroy();
		Assert.assertEquals(success, "Directory Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=4, enabled=true)
	public void edit_directroy() throws InterruptedException {
		//test = extent.createTest("edit_directroy");
		String success = directorypjsippage.edit_directory();
		Assert.assertEquals(success, "Directory Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void assign_directroy() throws InterruptedException {
		//test = extent.createTest("assign_directroy");
		String success = directorypjsippage.assign_directory();
		Assert.assertEquals(success, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=5, enabled=true)
	public void delete_directroy() throws InterruptedException {
		//test = extent.createTest("delete_directroy");
		String success = directorypjsippage.delete_directory();
		Assert.assertEquals(success, "Directory Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=6, enabled=true)
	public void withoutradioedit() throws InterruptedException {
		//test = extent.createTest("withoutradioedit");
		String success = directorypjsippage.withoutradioedit();
		Assert.assertEquals(success, "Select Atleast One Directory");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=6, enabled=true)
	public void withoutradiodelete() throws InterruptedException {
		//test = extent.createTest("withoutradiodelete");
		String success = directorypjsippage.withoutradioedit();
		Assert.assertEquals(success, "Select Atleast One Directory");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	

}

