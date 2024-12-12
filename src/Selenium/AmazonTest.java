package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest{

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void testDetails() {
		driver.findElement(By.xpath("//a[@class='_3RX0a-']")).click();
		}
	@After
	public void Down() {
		
		
	}
}
