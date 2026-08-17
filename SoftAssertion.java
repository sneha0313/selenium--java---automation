package TestNGpkg;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

public class SoftAssertion {
	ChromeDriver driver;
	
@BeforeTest  
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void titleverification() {
		String title=driver.getTitle();
		System.out.println(title);
		
		String expected="Facebook – log in or sign up";
		
		Assert.assertEquals(title, expected);//hard assertion
		System.out.println("hello");
	

}
}

