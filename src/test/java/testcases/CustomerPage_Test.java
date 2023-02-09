package testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.LoginPage;

public class CustomerPage_Test extends BaseTest{
	
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public CustomerPage_Test() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		customerpage= new CustomerPage();
		

}
	@DataProvider()
	public Object[][] readexcel() throws InvalidFormatException {
		String SheetName="Addcustomer";
		Object data[] []=ReuseFunctions.getTestData(SheetName);
		return data;
		
	}
	@Test(dataProvider="readexcel")
	public void Addcustomer(String username,String password,String comapnyname,String Email,String phonenum,String firstname,String lastname,String Address,
			String cityname,String Country,String State, String Zipcode,String Planname,String Customertype) throws InterruptedException{
		customerpage.Addcustomer(username, password, comapnyname, Email, phonenum, firstname, lastname,
				Address, cityname, Country, State, Zipcode, Planname, Customertype);
	}
	
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
