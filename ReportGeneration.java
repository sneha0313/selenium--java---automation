package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ReportGeneration {
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void extendReport()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automation test");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname","localhost" );
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername", "sneha");
		extent.setSystemInfo("browsername", "chrome");
		driver=new ChromeDriver();
	}
	
		
         @BeforeMethod
		public void setUp()
		{
			driver.get("https://www.facebook.com/");
			
		}
        @SuppressWarnings("deprecation")
		@Test
        public void titleVerif()
        {
        	test=extent.createTest("Title Verification");
        	String actual=driver.getTitle();
        	String exp="Facebook-log in or sign up";
        	Assert.assertEquals(exp, actual);
        	
        }
        @SuppressWarnings("deprecation")
		@Test
        public void fblogo()
        {   
        	test=extent.createTest("logo Verification");
        	
			boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
			Assert.assertTrue(b);
        }
        
        @AfterTest
        public void tearDown()
        {
        	extent.flush();
        }
        @AfterMethod
        public void browserclose(ITestResult result)
        {
        	if(result.getStatus()==ITestResult.FAILURE)
        	{
        		test.log(Status.FAIL,"test case failed is"+result.getName());
        		test.log(Status.FAIL,"test case failed is"+result.getThrowable());
        	}
        	else if(result.getStatus()==ITestResult.SKIP)
        	{
        		test.log(Status.SKIP,"test case skipped is"+result.getName());
        	}
        	else if (result.getStatus()==ITestResult.SUCCESS)
        	{
        		test.log(Status.PASS,"test case passed is"+result.getName());
        	}
        	
        	
        }
        
	
		
	}
	


