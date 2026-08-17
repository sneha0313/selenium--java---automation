package pkg;


	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Ebay {
		ChromeDriver driver;
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
		}
		@Test
		public void verify()
		{
			String til=driver.getTitle();
			String exp="ebay.com";
			if(til.equals(exp))
			{
				System.out.println("Verified");
			}
			else
				System.out.println("Not verified");
			driver.findElement(By.id("gh-shop-a")).click();
			driver.findElement(By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/ul[1]/li[4]/a")).click();
			String src=driver.getPageSource();
			if(src.contains("Shop by category"))
				System.out.println("contains");
			else
				System.out.println("doesnot contain");
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/span[2]/a/div[1]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div/div/div/div[3]/a")).click();
			driver.findElement(By.id("gh-ac")).sendKeys("Book",Keys.ENTER);
		}
		@After
		public void tearDown()
		{
			driver.quit();
		}
	}


