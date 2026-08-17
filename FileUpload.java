package TestNGpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	ChromeDriver driver;
	@BeforeTest
	public void loading()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void setup() throws AWTException, InterruptedException
	{
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		FileUploadMethod("C:\\Users\\HP\\Downloads\\javatask.docx");
	}
	private void FileUploadMethod(String p) throws AWTException, InterruptedException {
		StringSelection sr=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sr, null);
		
		Robot robo=new Robot();
		robo.delay(3000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		robo.delay(3000);

		
		
	}
	

}
