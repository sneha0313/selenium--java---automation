package pkg;


import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantaBroken {
	
	ChromeDriver driver;
	private int brokenLinkCount = 0;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
	}
	
	@Test
	public void SantaBr()
	{
		
		List <WebElement> Brknlink=driver.findElements(By.tagName("a"));

		System.out.println(Brknlink.size());
		
		for(WebElement element:Brknlink)
		{
			String link=element.getAttribute("href");
			verify(link);
		}
		
		
		if (this.brokenLinkCount == 0) {
			System.out.println("No Broken links");
			
		}
		
		
			
	}
	
	private void verify(String link) {
		
		try {
			URL u=new URL(link);
			HttpURLConnection code = (HttpURLConnection)u.openConnection();
			
		    if(code.getResponseCode()==404) {
		    	this.brokenLinkCount ++;
		    	System.out.println("Broken links"+link);
		    }
	   
		}
		
		catch(Exception e) {	
		}
	}	
}

	

		
	
	


