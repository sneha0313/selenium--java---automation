package TestNGpkg;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {
     
	 ChromeDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Datepicker.html");
	 }
	 @Test
	 public void picker()
	 {    
		 
		 driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		 datePickerMethod("December 2025","12");
	 }
	private void datePickerMethod(String expmonth,String expdate) {
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			String year=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			String monthYear=month+" "+year;
			System.out.println(month+ expmonth+monthYear);
			
	
			if(monthYear.equals(expmonth)){
				
				break;
				
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
				
				
			}
		}
	
		List <WebElement> date=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for(WebElement c:date)
		{   
			
			String datetext=c.getText();
			
			if(datetext.equalsIgnoreCase(expdate))
			{   
				c.click();
				break;
			}
		}
		
		
	}
}
