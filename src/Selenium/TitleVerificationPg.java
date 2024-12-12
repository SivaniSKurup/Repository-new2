
package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerificationPg {
	ChromeDriver driver;

		@Before
		public void setUp() {
			
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		
		@Test
		public void titleVerification()
		{
			String actualTitle=driver.getTitle();
			System.out.println("Title="+actualTitle);
			
			String exp="Facebook";
		}
}
