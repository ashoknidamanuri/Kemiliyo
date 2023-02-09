package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
//import webpages.DirectoryPage;
import webpages.LoginPage;
import webpages.RingGroupsPage;

public class RingGroupsPage_Test 
	extends BaseTest{
		public LoginPage loginpage;
		public CustomerPage customerpage;
		public ReuseFunctions resusefunctions;
		public RingGroupsPage ringgroupspage;
		
		public RingGroupsPage_Test() {
			super();
		}
		
		@BeforeClass
		public void setup() throws InterruptedException {
			initialization();
			loginpage = new LoginPage();
			loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			ringgroupspage= new RingGroupsPage(driver);
			
			

	}
		@Test(priority=1, enabled=true)
		public void ringgroup_validation() throws InterruptedException {
			String logo = ringgroupspage.ringgroup_validation();
			Assert.assertEquals(logo, "Ring Group");
			//ringgroupspage.add_ringgroup();
			
		}
		@Test(priority=2, enabled=true)
		public void add_ringgroup() throws InterruptedException {
			String addsuccess = ringgroupspage.add_ringgroup();
			Assert.assertEquals(addsuccess, "Ring-Group Added successfully");
			//ringgroupspage.add_ringgroup();
			
		}
		@Test(priority=3, enabled=true)
		public void edit_ringgroup() throws InterruptedException {
			String editsuccess = ringgroupspage.edit_ringgroup();
			Assert.assertEquals(editsuccess, "Ring-Group Updated successfully");
			//ringgroupspage.add_ringgroup();
			
		}
		@Test(priority=4, enabled=true)
		public void delete_ringgroup() throws InterruptedException {
			String deletesuccess = ringgroupspage.delete_ringgroup();
			Assert.assertEquals(deletesuccess, "Ring-Group Deleted successfully");
			//ringgroupspage.add_ringgroup();
			
		}
		@AfterClass
		public void teardown() {
			driver.close();
		}

}
