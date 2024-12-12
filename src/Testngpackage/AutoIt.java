package Testngpackage;

import java.awt.AWTException;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIt {
	ChromeDriver driver;
	@BeforeTest
		public void setUp() {
		driver=new ChromeDriver();
}
	@Test
	private void fileUpload(String p) throws AWTException,InterruptedException, IOException {
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\LENOVO\\Downloads\\AutoitFolder\\T1.exe");
		Thread.sleep(5000);
				
		}
	}