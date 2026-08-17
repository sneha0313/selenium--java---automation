package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Compare {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		String expected="Facebook";
		if(title.equals(expected))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");
		}
		driver.close();

	}

}
