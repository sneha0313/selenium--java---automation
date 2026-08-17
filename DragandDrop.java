package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void drag()
	{
		Actions act=new Actions(driver);
		WebElement amount1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement location1=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/div"));
	    act.dragAndDrop(amount1, location1).perform();
	    WebElement amount2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement location2=driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/div"));
	    act.dragAndDrop(amount2, location2).perform();
	
	}

}
