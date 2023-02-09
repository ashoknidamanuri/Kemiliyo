package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.AddCustomerPage;
import webpages.AnnouncementsPage;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.TimeConditionsPage;

public class AddCustomerPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeConditionsPage timeconditionspage;
	public AddCustomerPage addcustomerpage;
	
	
	public AddCustomerPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		addcustomerpage= new AddCustomerPage(driver);

} 
	@Test(priority=1, enabled=true)
	public void add_customerpjsip()  throws InterruptedException {
		//test = extent.createTest("add_customerpjsip");
		String logo=addcustomerpage.add_customerpjsip();
		Assert.assertEquals(logo, "Created Successfully!");
}
	@Test(priority=2, enabled=true)
	public void add_customersip()  throws InterruptedException {
		//test = extent.createTest("add_customersip");
		String logo=addcustomerpage.add_customersip();
	   // Assert.assertEquals(logo, "Created Successfully!");
}
	@Test(priority=3, enabled=true)
	public void add_customerUserDevice()  throws InterruptedException {
		//test = extent.createTest("add_customerUserDevice");
		String logo=addcustomerpage.add_customerUserDevice();
	   // Assert.assertEquals(logo, "Created Successfully!");
}
	//@Test(priority=2, enabled=true)
	//public void add_conferencepage() throws InterruptedException {
		//test = extent.createTest("add_conferencepage");
	//	String  addsuccess=conference.add_conferencepage();
	//	Assert.assertEquals(addsuccess, "Conference Added successfully");
	//}
	
	
}


