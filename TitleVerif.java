package pkg;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerif {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void titleverification() {
		String title=driver.getTitle();
		System.out.println(title);
		
		String expected="FB";
		if(title.equals(expected))
		{
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}
	
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}
