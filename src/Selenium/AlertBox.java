package Selenium;

import org.junit.Before;


import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("t");
}
	@Test
	public void AlertHandling()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Sivani");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("S");
	}
}
