package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	ChromeDriver driver;
	@Before
	public void setup() {
		
	   driver=new ChromeDriver();
	   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void dropdw()
	
	{
		
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("06");
		
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("JUN");
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("1986"); 
		
		WebElement city=driver.findElement(By.xpath("//*[contains(@name,'city')]"));
		Select citydetails=new Select(city);
		citydetails.selectByValue("Agra");
		
			
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	}
