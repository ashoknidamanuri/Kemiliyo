package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.AnnouncementsPage;
import webpages.CustomerPage;
import webpages.IvrOptionsPage;
import webpages.LoginPage;
import webpages.TimeConditionsPage;

public class AnnouncementsPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeConditionsPage timeconditionspage;
	public AnnouncementsPage announcementpage;
	
	
	public AnnouncementsPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		announcementpage= new AnnouncementsPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void announcement_validation() throws InterruptedException {
		String logo = announcementpage.announcement_validation();
		Assert.assertEquals(logo, "Announcements");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_announcement() throws InterruptedException {
		String succ = announcementpage.add_announcement();
		Assert.assertEquals(succ, "Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_announcement() throws InterruptedException {
		String succ = announcementpage.edit_announcement();
		Assert.assertEquals(succ, "Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void delete_announcement() throws InterruptedException {
		String succ = announcementpage.delete_announcement();
		Assert.assertEquals(succ, "Announcement Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
