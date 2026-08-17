package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void Setup()
	{
	  driver.get("https://www.amazon.in/");
	}
	@Test
	public void search() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sc-empty-cart\"]/div[2]/div[1]/a")).click();
		
		
	}
	@After
	public void quit() {
		driver.close();  
	}
	
	
}
