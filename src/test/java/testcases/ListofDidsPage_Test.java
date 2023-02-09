package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.AnnouncementsPage;
import webpages.CustomerPage;
import webpages.ListofDidsPage;
import webpages.LoginPage;
import webpages.TimeConditionsPage;

public class ListofDidsPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeConditionsPage timeconditionspage;
	public ListofDidsPage listofdidpage;
	
	
	public ListofDidsPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		listofdidpage= new ListofDidsPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void listofdid_validation() throws InterruptedException {
		String logo = listofdidpage.listofdid_validation();
		Assert.assertEquals(logo, "DID List");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=2, enabled=true)
	public void add_listofdid() throws InterruptedException {
		String success = listofdidpage.add_listofdid();
		Assert.assertEquals(success, "Created Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void add_callforwardfield() throws InterruptedException {
		String success = listofdidpage.add_callforwardfield();
		//Assert.assertEquals(success, "Created Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void edit_listdid() throws InterruptedException {
		String success = listofdidpage.edit_listdid();
		Assert.assertEquals(success, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=5, enabled=true)
	public void addsamedid_listofdid() throws InterruptedException {
		String success = listofdidpage.addsamedid_listofdid();
		Assert.assertEquals(success, "Already Exists");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
