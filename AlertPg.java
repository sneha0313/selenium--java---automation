package pkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPg {
		ChromeDriver driver;
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("file:///C:/Users/HP/Downloads/Alert.html");
		}
		@Test
		public void alertpg()
		{
			driver.findElement(By.xpath("/html/body/input[1]")).click();
			Alert a =driver.switchTo().alert(); 
			String s=a.getText();
			System.out.println(s);
			a.accept();
			driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Aradhya");
			driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("S");
		}
	}


