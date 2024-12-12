package Testngpackage;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
}
	@Test
	public void DropDownAction() {
		 WebElement source = driver.findElement(By.xpath("//li[@id='fourth']//a"));
		 WebElement target = driver.findElement(By.xpath("//ol[@id='amt8']"));
		 Actions actions = new Actions(driver);
		 actions.dragAndDrop(source, target).perform();
		 driver.quit();
	}
}