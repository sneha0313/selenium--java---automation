package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Santa {
 
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setup()
	{
		driver.get("https://santamonicaedu.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void verify()
	{
		String title=driver.getTitle();
		String exp="Santamonica Study Abroad Pvt. Ltd. | Education Consultants";
		if(title.equals(exp))
				{
			     System.out.println("Same");
				}
		else
		{
			System.out.println("Not Same");
		}
		System.out.println(title);
		//ring exp="Santa Monica Study ABroad Pvt.Ltd.|Education Consultants";
		
	driver.findElement(By.xpath("//*[@id=\"launchevent\"]/div/div/div[1]/button/span")).click();
	driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div/div/div[1]/a[1]")).click();
	
	}
	@After
	public void teardown()
	{
		driver.close();
	}
	

}
