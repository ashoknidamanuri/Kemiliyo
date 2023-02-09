package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.SystemRecordingPage;
import webpages.SystemRecordingPjsipPage;

public class SystemRecordingPjsipPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public SystemRecordingPjsipPage systemrecordingpjsippage;
	
	public SystemRecordingPjsipPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		systemrecordingpjsippage= new SystemRecordingPjsipPage(driver);
		
		

}
	@Test(priority=1, enabled=true)
	public void systemrecord_validation() throws InterruptedException {
		//test = extent.createTest("systemrecord_validation");
		String logo = systemrecordingpjsippage.systemrecord_validation();
		Assert.assertEquals(logo, "System Recording");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=2, enabled=true)
	public void add_systemrecord() throws InterruptedException {
		//test = extent.createTest("add_systemrecord");
		String addsuccess = systemrecordingpjsippage.add_systemrecord();
		Assert.assertEquals(addsuccess, "Recording added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=3, enabled=true)
	public void edit_systemrecord() throws InterruptedException {
		//test = extent.createTest("edit_systemrecord");
		String addsuccess = systemrecordingpjsippage.edit_systemrecord();
		Assert.assertEquals(addsuccess, "Recording Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=4, enabled=false)
	public void play_audio() throws InterruptedException {
		//test = extent.createTest("edit_systemrecord");
		String addsuccess = systemrecordingpjsippage.play_audio();
		//Assert.assertEquals(addsuccess, "Recording Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}

	@Test(priority=4, enabled=true)
	public void delete_systemrecord() throws InterruptedException {
		//test = extent.createTest("delete_systemrecord");
		String addsuccess = systemrecordingpjsippage.delete_systemrecord();
		Assert.assertEquals(addsuccess, "Deleted Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=5, enabled=true)
	public void withoutselectradioedit() throws InterruptedException {
		//test = extent.createTest("withoutselectradioedit");
		String selectone = systemrecordingpjsippage.withoutselectradioedit();
		Assert.assertEquals(selectone, "Please select atleast one Recording");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=6, enabled=true)
	public void withoutselectradiodelete() throws InterruptedException {
		//test = extent.createTest("withoutselectradiodelete");
		String selectone = systemrecordingpjsippage.withoutselectradiodelete();
		Assert.assertEquals(selectone, "Please select atleast one Recording");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=7, enabled=false)
	public void wronginputs() throws InterruptedException {
		//test = extent.createTest("wronginputs");
		String selectone = systemrecordingpjsippage.wronginputs();
		Assert.assertEquals(selectone, "Recording added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	

}
