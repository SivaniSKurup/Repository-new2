package Testfbpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepackage.fblogin;

public class fbLoginTest {
public static WebDriver driver;  

@BeforeTest
public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	@Test
	public void testLogin() {
		fblogin ob=new fblogin(driver);
		ob.setValues("abc@gmail.com","abcdcd");
		ob.login();
	
}
}
