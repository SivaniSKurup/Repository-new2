package Selenium;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class GuruAlert {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
	@Test
	public void AlertHandle() {
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"))).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		Alert a=driver.switchTo().alert();
		String message=a.getText();
		System.out.println(message);
		a.accept();
		
		act.doubleClick(driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"))).perform();
		Alert b=driver.switchTo().alert();
		String message1=b.getText();
		System.out.println(message1);
		b.accept();
	}
	}
