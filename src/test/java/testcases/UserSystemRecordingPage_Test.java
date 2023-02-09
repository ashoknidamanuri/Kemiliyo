package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.SystemRecordingPage;
import webpages.UserLoginPage;
import webpages.UserSystemRecordingPage;

public class UserSystemRecordingPage_Test extends BaseTest {
	public UserLoginPage userloginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public UserSystemRecordingPage usersystemrecordingpage;
	
	public UserSystemRecordingPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		userloginpage = new UserLoginPage();
		userloginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		usersystemrecordingpage= new UserSystemRecordingPage(driver);
	}
	
	@Test(priority=1, enabled=true)
	public void add_systemrecord() throws InterruptedException {
		//test = extent.createTest("add_systemrecord");
		String addsuccess = usersystemrecordingpage.add_systemrecord();
		Assert.assertEquals(addsuccess, "Recording added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void edit_systemrecord() throws InterruptedException {
		//test = extent.createTest("edit_systemrecord");
		String addsuccess = usersystemrecordingpage.edit_systemrecord();
		Assert.assertEquals(addsuccess, "Recording Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void delete_systemrecord() throws InterruptedException {
		//test = extent.createTest("delete_systemrecord");
		String addsuccess = usersystemrecordingpage.delete_systemrecord();
		Assert.assertEquals(addsuccess, "Deleted Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
}
