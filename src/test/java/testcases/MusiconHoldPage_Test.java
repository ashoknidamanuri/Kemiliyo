package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.FeatureCodePage;
import webpages.LoginPage;
import webpages.MusiconHoldPage;

public class MusiconHoldPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public MusiconHoldPage musiconholdpage;
	
	public MusiconHoldPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		musiconholdpage= new MusiconHoldPage(driver);
		
	}
	@Test(priority=1, enabled=true)
	public void musiconhold_validation() throws InterruptedException {
		String logo = musiconholdpage.musiconhold_validation();
		Assert.assertEquals(logo, "Music On Hold");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void add_musichold() throws InterruptedException {
		String success = musiconholdpage.add_musichold();
		Assert.assertEquals(success, "Added successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=3, enabled=true)
	public void edit_musichold() throws InterruptedException {
		String success = musiconholdpage.edit_musichold();
		Assert.assertEquals(success, "Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=4, enabled=true)
	public void delete_musichold() throws InterruptedException {
		String success = musiconholdpage.delete_musichold();
		Assert.assertEquals(success, "Deleted Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=5, enabled=true)
	public void field_validation() throws InterruptedException {
		String success = musiconholdpage.field_validation();
		Assert.assertEquals(success, "Name should contain only Alphabet.!");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=6, enabled=true)
	public void file_field_validation() throws InterruptedException {
		String success = musiconholdpage.file_field_validation();
		Assert.assertEquals(success, "Invalid Format");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
