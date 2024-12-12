package Testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class softAssertionPgm {
ChromeDriver driver;
@BeforeTest
public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
@Test
public void titleVerification() {
	String actualTitle=driver.getTitle();
	String exp="google";
	
	if(exp.equals(actualTitle)) {
		System.out.println("pass");
	}
	else {
		System.out.println("Fail");
	}
	System.out.println("Hello");
			}
}
