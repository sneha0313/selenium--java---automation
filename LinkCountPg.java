package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPg {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setup() {
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void linkct() {
		List <WebElement> linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no of linkls="+linkdetails.size());
		
		for(WebElement element:linkdetails)
		{
			String link=element.getAttribute("href");
			String LinkText= element.getText();
			System.out.println("Link "+link);
			System.out.println("LinkText "+LinkText);
		}
		
	}

}
