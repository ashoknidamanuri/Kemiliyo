package testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.ListofCustomer;
import webpages.LoginPage;

public class ListofCustomer_Test extends BaseTest {
	public LoginPage loginpage;
	public ListofCustomer listofcustomer;
	public ReuseFunctions resusefunctions;
	
	public ListofCustomer_Test() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		listofcustomer= new ListofCustomer();
		

}
	@DataProvider()
	public Object[][] readexcel() throws InvalidFormatException {
		String SheetName="ListofCustomer";
		Object data[] []=ReuseFunctions.getTestData(SheetName);
		return data;
		
	}
	@Test(dataProvider="readexcel")
	public void ListofCustomerdata(String companyname,String lastname,String numlines,String Linecost,
			String Numberofphones,String Rentalphone,String Incomingline,String LineCost,String PaidDid,String DidCost,String PlanCost) throws InterruptedException {
		listofcustomer.ListofCustomerdata(companyname, lastname,numlines,Linecost, Numberofphones,Rentalphone,Incomingline,LineCost,PaidDid,DidCost,PlanCost);
		
	}
	@AfterMethod
	public void quit() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	

}
