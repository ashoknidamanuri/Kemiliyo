package webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webpages.BaseTest;

public class ListofCustomer extends BaseTest {
	@FindBy(xpath="//span[contains(text(),'Customers')]")
	WebElement custlink;
	@FindBy(xpath="//a[contains(text(),'List of Customers')]")
	WebElement listofcustomer;
	@FindBy(xpath="//input[@placeholder='Search Keyword...']")
	WebElement search;
	@FindBy(xpath="//input[@id='selectval_0']")
	WebElement selectlink;
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle']")
	
	WebElement dropdown;
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	WebElement edit;
	
	@FindBy(xpath="//input[@name='cname']")
	WebElement cname;
	@FindBy(xpath="//input[@name='lname']")
	WebElement lname;
	@FindBy(xpath="//input[@id='billcheck']")
	WebElement billcheck;
	@FindBy(xpath="(//label[text()='No. of Lines']/following::input)[1]")
	WebElement lines;
	@FindBy(xpath="(//label[text()='Line Cost']/following::input)[1]")
	WebElement linecost;
	@FindBy(xpath="(//label[text()='Number of Rental Phones']/following::input)[1]")
	WebElement numofrentalphones;
	@FindBy(xpath="(//label[text()='Phone Rental']/following::input)[1]")
	WebElement rentalphones;
	@FindBy(xpath="(//label[text()='Incoming Lines']/following::input)[1]")
	WebElement incomingline;
	@FindBy(xpath="(//label[text()='Incoming Line Cost']/following::input)[1]")
	WebElement costline;
	@FindBy(xpath="(//label[text()='Paid DIDs']/following::input)[1]")
	
	WebElement paidid;
	@FindBy(xpath="(//label[text()='DID Cost']/following::input)[1]")
	WebElement didcost;
	@FindBy(xpath="(//label[text()='Plan Tax']/following::input)[1]")
	WebElement plantax;
	
	
	@FindBy(xpath="//button[contains(text(),'Update Account')]")
	WebElement update;
	 public ListofCustomer() {
		
		PageFactory.initElements(driver, this);
	}
	 public void ListofCustomerdata(String companyname,String lastname, String numlines,String Linecost,String 
			 Numberofphones,String Rentalphone,String Incomingline,String LineCost,String PaidDid,String DidCost,String PlanTax) throws InterruptedException {
		 custlink.click();
		 listofcustomer.click();
		 Thread.sleep(3000);
		 search.sendKeys("babu");
		 Thread.sleep(10000);
		 selectlink.click();
		 Thread.sleep(3000);
		dropdown.click();
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);
		cname.clear();
		Thread.sleep(3000);
		cname.sendKeys(companyname);
		Thread.sleep(3000);
		lname.clear();
		Thread.sleep(3000);
		lname.sendKeys(lastname);
		Thread.sleep(3000);
		billcheck.click();
		Thread.sleep(3000);
		lines.clear();
		Thread.sleep(3000);
		lines.sendKeys(numlines);
		Thread.sleep(3000);
		linecost.clear();
		Thread.sleep(3000);
		linecost.sendKeys(Linecost);
		Thread.sleep(3000);
		numofrentalphones.clear();
		Thread.sleep(3000);
		numofrentalphones.sendKeys(Numberofphones);
		Thread.sleep(3000);
		rentalphones.clear();
		Thread.sleep(3000);
		rentalphones.sendKeys(Rentalphone);
		Thread.sleep(3000);
		incomingline.clear();
		Thread.sleep(3000);
		incomingline.sendKeys(Incomingline);
		Thread.sleep(3000);
		paidid.clear();
		Thread.sleep(3000);
		paidid.sendKeys(PaidDid);
		Thread.sleep(3000);
		didcost.clear();
		Thread.sleep(3000);
		didcost.sendKeys(DidCost);
		Thread.sleep(3000);
		plantax.clear();
		Thread.sleep(3000);
		plantax.sendKeys(PlanTax);
		Thread.sleep(3000);
		update.click();
		
		
		
		
		
		
		 
	 }
	 

}
