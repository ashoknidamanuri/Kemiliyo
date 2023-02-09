package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.IvrOptionsPage;
import webpages.LoginPage;
import webpages.RingGroupsPage;
import webpages.TimeConditionsPage;

public class IvrOptionsPage_Test extends BaseTest{
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public TimeConditionsPage timeconditionspage;
	public IvrOptionsPage ivroptionspage;
	
	
	public IvrOptionsPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		ivroptionspage= new IvrOptionsPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void timecondition_validation() throws InterruptedException {
		String logo = ivroptionspage.ivroption_validation();
		Assert.assertEquals(logo, "IVR Options");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_ivroption() throws InterruptedException {
		String suc1 = ivroptionspage.add_ivroption();
		Assert.assertEquals(suc1, "IVR successfully created");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_ivroption() throws InterruptedException {
		String suc2 = ivroptionspage.edit_ivroption();
		Assert.assertEquals(suc2, "IVR successfully Updated");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=4, enabled=true)
	public void delete_ivroption() throws InterruptedException {
		String suc3 = ivroptionspage.delete_ivroption();
		Assert.assertEquals(suc3, "IVR successfully deleted");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}


}
