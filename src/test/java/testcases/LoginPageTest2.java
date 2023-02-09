package testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.LoginPage;

public class LoginPageTest2 extends BaseTest {

	public LoginPage loginpage;
	public ReuseFunctions resusefunctions;
	public  LoginPageTest2(){
		super();
		
		initialization();
		loginpage = new LoginPage();
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
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		driver.close();
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

