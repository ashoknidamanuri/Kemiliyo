package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.ConferencePage;
import webpages.LoginPage;

public class ConferencePage_Test extends BaseTest{
	public LoginPage loginpage;
	public  ConferencePage conference;
	public ReuseFunctions resusefunctions;
	
	
	public ConferencePage_Test() {
		super();
	}
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 conference =new ConferencePage(driver);
		

}
	@Test(priority=1, enabled=true)
	public void conferencepage_validation()  throws InterruptedException {
	
	String logo=conference.conferencepage_validation();
	Assert.assertEquals(logo, "Manage Conference");
}
	@Test(priority=2, enabled=true)
	public void add_conferencepage() throws InterruptedException {
		String  addsuccess=conference.add_conferencepage();
		Assert.assertEquals(addsuccess, "Conference Added successfully");
	}
	
	@Test(priority=3, enabled=false)
	public void radioedit_confrencepage() throws InterruptedException {
		//String edit_radio=conference.radioedit_confrencepage();
	//	Assert.assertEquals(edit_radio, "Please select atleast one Conference");
		
	}

	
	@Test(priority=4, enabled=true)
	public void edit_conferencepage() throws InterruptedException {
		
		
		String  updatesuccess=conference.edit_conferencepage();
		Assert.assertEquals(updatesuccess, "Conference Updated successfully");
	}
	@Test(priority=5, enabled=true)
	public void radiodelete_conferencepage() throws InterruptedException {
		//String delete_radio=conference.radiodelete_conferencepage();
		//Assert.assertEquals(delete_radio, "Please select atleast one Conference");
		
	}
	@Test(priority=6, enabled=true)
	public void delete_conferencepage() throws InterruptedException {
		String  deletesuccess=conference.delete_conferencepage();
		Assert.assertEquals(deletesuccess, "Conference Deleted successfully");
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}


}
