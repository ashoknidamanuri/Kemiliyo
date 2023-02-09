package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.ListofExtensionsPage;
import webpages.LoginPage;
import webpages.QueuesPage;

public class ListofExtensionsPage_test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public ListofExtensionsPage listofextensionpage;
	
	public ListofExtensionsPage_test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		listofextensionpage= new ListofExtensionsPage(driver);
		
	}
	@Test(priority=1, enabled=true)
	public void extension_validation() throws InterruptedException {
		String logo = listofextensionpage.extension_validation();
		Assert.assertEquals(logo, "List of Extensions");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_extension() throws InterruptedException {
		String success = listofextensionpage.add_extension();
		Assert.assertEquals(success, "Extension(s) Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_extension() throws InterruptedException {
		String success = listofextensionpage.edit_extension();
		Assert.assertEquals(success, "Extension(s) Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void followme_extension() throws InterruptedException {
		String suc1 = listofextensionpage.followme_extension();
		Assert.assertEquals(suc1, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=5, enabled=true)
	public void edit_follow_extension() throws InterruptedException {
		String suc2 = listofextensionpage.edit_follow_extension();
		//Assert.assertEquals(suc2, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=6, enabled=true)
	public void check_bulk_extension() throws InterruptedException {
		String suc3 = listofextensionpage.check_bulk_extension();
		Assert.assertEquals(suc3, "Extension(s) Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=7, enabled=true)
	public void delete_extension() throws InterruptedException {
		String suc3 = listofextensionpage.delete_extension();
		Assert.assertEquals(suc3, "Extension(s) Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
