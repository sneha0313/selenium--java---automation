package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void setup()
	{
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void googlesearch()
	{
		driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.manage().window().maximize();//interview		
	}
	

}
