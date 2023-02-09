package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.AddCustomerPage;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.ListofCustomersPage;
import webpages.LoginPage;
import webpages.TimeConditionsPage;

public class ListofCustomersPage_Test extends BaseTest{
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeConditionsPage timeconditionspage;
	public ListofCustomersPage listofcustomerpage;
	
	
	public ListofCustomersPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		listofcustomerpage= new ListofCustomersPage(driver);

} 
	@Test(priority=2, enabled=false)
	public void listcustomer() throws InterruptedException {
		String success = listofcustomerpage.listcustomer();
		Assert.assertEquals(success, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=1, enabled=true)
	public void view() throws InterruptedException {
		String success = listofcustomerpage.view();
		//Assert.assertEquals(success, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
}
