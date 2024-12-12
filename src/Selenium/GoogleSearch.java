package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	 ChromeDriver driver;
	 @Before
	 public void setup() {
		 driver=new ChromeDriver();
		 driver.get("http://www.google.com/");
	 }
	 @Test
	 public void googleSearchPg(){
		 
		 driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
		 //driver.findElement(by.name("btnK")).click();
		 }
 }
