package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.BaseTest;
import reusefunctions.ReuseFunctions;
import webpages.CustomerPage;
import webpages.ListofExtensionsPage;
import webpages.LoginPage;
import webpages.PagingIntercomPage;

public class PagingIntercomPage_Test extends BaseTest {
	public LoginPage loginpage;
	public CustomerPage customerpage;
	public ReuseFunctions resusefunctions;
	public PagingIntercomPage pagingintercompage;
	
	public PagingIntercomPage_Test() {
		super();
	}
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		pagingintercompage= new PagingIntercomPage(driver);
		
	}
	@Test(priority=1, enabled=true)
	public void paging_validation() throws InterruptedException {
		String logo = pagingintercompage.paging_validation();
		Assert.assertEquals(logo, "Paging & Intercom");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=2, enabled=true)
	public void add_paging() throws InterruptedException {
		String suc = pagingintercompage.add_paging();
		Assert.assertEquals(suc, "Paging & Intercom Created successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=3, enabled=true)
	public void edit_paging() throws InterruptedException {
		String suc = pagingintercompage.edit_paging();
		Assert.assertEquals(suc, "Paging & Intercom Updated successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	
	@Test(priority=4, enabled=true)
	public void delete_paging() throws InterruptedException {
		String suc = pagingintercompage.delete_paging();
		Assert.assertEquals(suc, "Paging & Intercom Deleted successfully");
		//ringgroupspage.add_ringgroup();
		
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
