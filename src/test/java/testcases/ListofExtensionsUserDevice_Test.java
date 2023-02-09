package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.ListofExtensionsPage;
import webpages.ListofExtensionsUserDevice;
import webpages.LoginPage;

public class ListofExtensionsUserDevice_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public ListofExtensionsUserDevice listofextensionpageuserdevice;
	
	public ListofExtensionsUserDevice_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		listofextensionpageuserdevice= new ListofExtensionsUserDevice(driver);
		
	}
	@Test(priority=1, enabled=true)
	public void extension_validation() throws InterruptedException {
		test = extent.createTest("extension_validation");
		String logo = listofextensionpageuserdevice.extension_validation();
		Assert.assertEquals(logo, "List of Extensions");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_extension() throws InterruptedException {
		test = extent.createTest("add_extension");
		String success = listofextensionpageuserdevice.add_extension();
		Assert.assertEquals(success, "Extension(s) Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_extension() throws InterruptedException {
		test = extent.createTest("edit_extension");
		String success = listofextensionpageuserdevice.edit_extension();
		Assert.assertEquals(success, "Extension(s) Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void followme_extension() throws InterruptedException {
		test = extent.createTest("followme_extension");
		String suc1 = listofextensionpageuserdevice.followme_extension();
		Assert.assertEquals(suc1, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=5, enabled=true)
	public void edit_follow_extension() throws InterruptedException {
		test = extent.createTest("edit_follow_extension");
		String suc2 = listofextensionpageuserdevice.edit_follow_extension();
		//Assert.assertEquals(suc2, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=6, enabled=true)
	public void check_bulk_extension() throws InterruptedException {
		test = extent.createTest("extension_validation");
		String suc3 = listofextensionpageuserdevice.check_bulk_extension();
		Assert.assertEquals(suc3, "Extension(s) Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=7, enabled=true)
	public void delete_extension() throws InterruptedException {
		test = extent.createTest("delete_extension");
		String suc3 = listofextensionpageuserdevice.delete_extension();
		Assert.assertEquals(suc3, "Extension(s) Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}

