package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.ConferencePage;
import webpages.ConferencePjsipPage;
import webpages.LoginPage;

public class ConferencePjsipPage_Test extends BaseTest{
	public LoginPage loginpage;
	public  ConferencePjsipPage conferencepjsip;
	public ReuseFunctions resusefunctions;
	
	
	public ConferencePjsipPage_Test() {
		super();
	}
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		conferencepjsip =new ConferencePjsipPage(driver);
		

}
	@Test(priority=1, enabled=true)
	public void conferencepage_validation()  throws InterruptedException {
		//test = extent.createTest("conferencepage_validation");
	
	String logo=conferencepjsip.conferencepage_validation();
	Assert.assertEquals(logo, "Manage Conference");
}
	@Test(priority=2, enabled=true)
	public void add_conferencepage() throws InterruptedException {
		//test = extent.createTest("add_conferencepage");
		String  addsuccess=conferencepjsip.add_conferencepage();
		Assert.assertEquals(addsuccess, "Conference Added successfully");
	}
	@Test(priority=3, enabled=true)
	public void edit_conferencepage() throws InterruptedException {
		//test = extent.createTest("add_conferencepage");
		String  addsuccess=conferencepjsip.edit_conferencepage();
		Assert.assertEquals(addsuccess, "Conference Updated successfully");
	}
	@Test(priority=4, enabled=true)
	public void delete_conferencepage() throws InterruptedException {
		//test = extent.createTest("add_conferencepage");
		String  addsuccess=conferencepjsip.delete_conferencepage();
		Assert.assertEquals(addsuccess, "Conference Deleted successfully");
	}
	 
	@AfterClass
	public void teardown() {
		driver.close();
	}


}
