package webpages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusefunctions.ReuseFunctions;
import webeventlistner.WebEventListener;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static ExtentHtmlReporter htmlReporter;
	public static  ExtentReports extent;
	public static   ExtentTest test;
	
	public BaseTest(){
		try{
			prop=new Properties();
			FileInputStream fis = new FileInputStream("C://Vitalglobal//src//main//java//configproperties//config.properties");
			prop.load(fis);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			
			WebDriverManager.chromedriver().setup();	
			driver = new ChromeDriver();
		  
		}
		else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "‪C://Users//Ashok Nidamanuri//Downloads//geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "‪‪E:\\office\\msedgedriver.exe");	
				driver = new InternetExplorerDriver(); 
			}
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(ReuseFunctions.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ReuseFunctions.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(ReuseFunctions.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}	
	public  void ReportssetUp() throws Throwable {
		// location of the extent report
		// String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
		// Date());
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/ExtentReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
		htmlReporter.config().setReportName("Functional Testing"); // Name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// General information releated to application
		extent.setSystemInfo("Application Name", "Vitelglobal");
		extent.setSystemInfo("User Name", "Surendra");
		extent.setSystemInfo("Envirnoment", "QA");

	}
	

	public  void getResult(ITestResult result) throws IOException  {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
			ReuseFunctions screenshot =new ReuseFunctions();
		    String screenshotPath =  screenshot.getScreenshot(driver, result.getName());
	        test.addScreenCaptureFromPath(screenshotPath);// adding screen shot
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		}
	}
	public void endresult() {
		extent.flush();
		System.out.println("Extent got flushed");
	}

}

