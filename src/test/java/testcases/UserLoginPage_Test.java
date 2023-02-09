package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import reusefunctions.ReuseFunctions;
import webpages.BaseTest;
import webpages.LoginPage;
import webpages.UserLoginPage;

public class UserLoginPage_Test extends BaseTest {

	public UserLoginPage userloginpage;
	public ReuseFunctions resusefunctions;
	public  UserLoginPage_Test(){
		super();
		
		initialization();
		userloginpage = new UserLoginPage();
	}
	//@Test(priority=1, enabled=false)
	//public void loginPageTitleTest(){
	//	String title = loginpage.validateLoginPageTitle();
	//	Assert.assertEquals(title, "Vitelglobal::Login");
	//}
	
	@BeforeSuite
	public void generatereports() throws Throwable {
		ReportssetUp();
	}
	@Test(priority=1)
	public void loginTest() throws InterruptedException{
		test = extent.createTest("loginTest");
		userloginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.close();
		System.out.println("login_successful");
	}
	
	@AfterMethod
	public  void getmethodstatus (ITestResult result) throws IOException {
		getResult(result);
	}
		


	@AfterSuite
	public void endreport() {
		endresult();
	}
	
			
	}

