package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.CustomerPage;
import webpages.LoginPage;
import webpages.MusiconHoldPage;
import webpages.MusiconHoldPjsipPage;

public class MusiconHoldPjsipPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public MusiconHoldPjsipPage musiconholdpjsippage;
	
	public MusiconHoldPjsipPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		musiconholdpjsippage= new MusiconHoldPjsipPage(driver);
		
	}
	@Test(priority=1, enabled=true)
	public void musiconhold_validation() throws InterruptedException {
		//test = extent.createTest("musiconhold_validation");
		String logo = musiconholdpjsippage.musiconhold_validation();
		Assert.assertEquals(logo, "Music On Hold");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_musichold() throws InterruptedException {
		//test = extent.createTest("add_musichold");
		String success = musiconholdpjsippage.add_musichold();
		Assert.assertEquals(success, "Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_musichold() throws InterruptedException {
		//test = extent.createTest("edit_musichold");
		String success = musiconholdpjsippage.edit_musichold();
		Assert.assertEquals(success, "Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void delete_musichold() throws InterruptedException {
		//test = extent.createTest("delete_musichold");
		String success = musiconholdpjsippage.delete_musichold();
		Assert.assertEquals(success, "Deleted Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=5, enabled=true)
	public void field_validation() throws InterruptedException {
		//test = extent.createTest("field_validation");
		String success = musiconholdpjsippage.field_validation();
		Assert.assertEquals(success, "Name should contain only Alphabet.!");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=6, enabled=false)
	public void file_field_validation() throws InterruptedException {
		String success = musiconholdpjsippage.file_field_validation();
		Assert.assertEquals(success, "Invalid Format");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}

