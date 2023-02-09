package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.QueuesPage;
import webpages.RingGroupsPage;

public class QueuesPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public QueuesPage queuespage;
	
	public QueuesPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		queuespage= new QueuesPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void queues_validation() throws InterruptedException {
		String logo = queuespage.queues_validation();
		Assert.assertEquals(logo, "Queues");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=2, enabled=true)
	public void add_queues() throws InterruptedException {
		String add = queuespage.add_queues();
		Assert.assertEquals(add, "Queue Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=3, enabled=true)
	public void edit_queues() throws InterruptedException {
		String edit = queuespage.edit_queues();
		Assert.assertEquals(edit, "Queue Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void delete_queues() throws InterruptedException {
		String delete = queuespage.delete_queues();
		Assert.assertEquals(delete, "Queue(s) Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
