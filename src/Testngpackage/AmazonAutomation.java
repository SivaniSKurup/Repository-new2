package Testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Set;

import org.testng.annotations.BeforeTest;


public class AmazonAutomation {
	ChromeDriver driver;
	@BeforeMethod
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
}
	@Test
	public void Automate() {
		String title = driver.getTitle();
        System.out.println("Title: " + title);
        WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchbox.sendKeys("mobile");
        WebElement searchbutton=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        searchbutton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
        Set<String> cartWindowHandles = driver.getWindowHandles();
        for (String windowHandle : cartWindowHandles) {
        	if (!windowHandle.equalsIgnoreCase(driver.getWindowHandle())) {
                driver.switchTo().window(windowHandle);
                driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
                
            }
        	driver.switchTo().window(windowHandle);
            
        }

	}
}