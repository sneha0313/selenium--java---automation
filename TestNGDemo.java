package TestNGpkg;

import org.junit.After;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeTest
	public void setup()
	{
		System.out.println("Browse loading");
	}
	@BeforeMethod
	public void urlLoading()
	{
		System.out.println("Url loading");
	}
	@Test(priority=3,invocationCount = 3,groups="smoke")
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=2,enabled=true,groups="smoke")//false
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority=1,dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("Test3");
	}
	@AfterMethod
	public void afterdetails()
	{
		System.out.println("AfterDetails");
	}
	@AfterTest
	public void tearDown()
	{
		System.out.println("Quit Browser");
	}

}
