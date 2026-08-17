package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void setup()
	{
		driver.get("https://www.google.com/");
	}
	@Parameters("str")
	@Test
	public void search(String str)
	{
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(str,Keys.ENTER);
	}

}
