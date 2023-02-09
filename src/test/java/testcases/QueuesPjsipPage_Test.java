package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.QueuesPage;
import webpages.QueuesPjsipPage;

public class QueuesPjsipPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public QueuesPjsipPage queuespjsippage;
	
	public QueuesPjsipPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		queuespjsippage= new QueuesPjsipPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void queues_validation() throws InterruptedException {
		//test = extent.createTest("queues_validation");
		String logo = queuespjsippage.queues_validation();
		Assert.assertEquals(logo, "Queues");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=2, enabled=true)
	public void add_queues() throws InterruptedException {
		//test = extent.createTest("add_queues");
		String add = queuespjsippage.add_queues();
		Assert.assertEquals(add, "Queue Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=3, enabled=true)
	public void edit_queues() throws InterruptedException {
		//test = extent.createTest("edit_queues");
		String edit = queuespjsippage.edit_queues();
		Assert.assertEquals(edit, "Queue Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void delete_queues() throws InterruptedException {
		//test = extent.createTest("delete_queues");
		String delete = queuespjsippage.delete_queues();
		Assert.assertEquals(delete, "Queue(s) Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
