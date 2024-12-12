package Testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginAutomationAssertion {
		ChromeDriver driver;
	@BeforeTest
		public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
}
	@Test
	public void testValidLogin() {
		driver.findElement(By.name("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

        // Expected URL after successful login
        String expectedUrl = ("https://practicetestautomation.com/logged-in-successfully/");

        // Get current URL
        String currentUrl = driver.getCurrentUrl();

        // Assertion for expected URL
       Assert.assertEquals(expectedUrl,currentUrl);
       System.out.println("URL pass");
    }

    
}
