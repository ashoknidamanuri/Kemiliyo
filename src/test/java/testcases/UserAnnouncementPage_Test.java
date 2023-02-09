package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.AnnouncementsPage;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.TimeConditionsPage;
import webpages.UserAnnouncementPage;
import webpages.UserLoginPage;

public class UserAnnouncementPage_Test extends BaseTest {
	public UserLoginPage userloginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeConditionsPage timeconditionspage;
	public UserAnnouncementPage userannouncementpage;
	
	
	public UserAnnouncementPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		userloginpage = new UserLoginPage();
		userloginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		userannouncementpage= new UserAnnouncementPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void announcement_validation() throws InterruptedException {
		//test = extent.createTest("announcement_validation");
		String logo = userannouncementpage.announcement_validation();
		Assert.assertEquals(logo, "Announcement");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_announcement() throws InterruptedException {
		//test = extent.createTest("add_announcement");
		String succ = userannouncementpage.add_announcement();
		Assert.assertEquals(succ, "Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_announcement() throws InterruptedException {
		//test = extent.createTest("edit_announcement");
		String succ = userannouncementpage.edit_announcement();
		Assert.assertEquals(succ, "Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void delete_announcement() throws InterruptedException {
		//test = extent.createTest("delete_announcement");
		String succ = userannouncementpage.delete_announcement();
		Assert.assertEquals(succ, "Announcement Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}

