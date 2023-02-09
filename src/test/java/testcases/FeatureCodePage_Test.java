package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.FeatureCodePage;
import webpages.LoginPage;
import webpages.TimeZonePage;

public class FeatureCodePage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public FeatureCodePage featurecodepage;
	
	public FeatureCodePage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		featurecodepage= new FeatureCodePage(driver);
		
	}
	@Test(priority=1, enabled=true)
	public void featurecode_validation() throws InterruptedException {
		String logo = featurecodepage.featurecode_validation();
		Assert.assertEquals(logo, "Feature Codes");
		//ringgroupspage.add_ringgroup();
		
	}
	@Test(priority=2, enabled=true)
	public void deactive_validation() throws InterruptedException {
		String success = featurecodepage.deactive_validation();
		Assert.assertEquals(success, "Updated Successfully!");
		//ringgroupspage.add_ringgroup();
		
	}

}
