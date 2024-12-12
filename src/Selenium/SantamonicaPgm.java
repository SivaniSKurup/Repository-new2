package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantamonicaPgm {

	ChromeDriver driver;
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
	}
	@Test
	public void santamonica() {
		driver.findElement(By.name("Study Abroad")).sendKeys("Canada");
		driver.findElement(By.name("Find a course")).sendKeys("Germany");
		driver.findElement(By.name("btnK")).click();
	}
	@After
	public void Down() {
		
	}
}
