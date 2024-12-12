package Selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDropdown {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}

@Test
public void rediffTest() {
	WebElement date=driver.findElement(By.xpath("//*[@id=\"]/tbody/tr[22]/td[3]/select[1]"));
	WebElement month=driver.findElement(By.xpath("//*[@id=\"]/tbody/tr[22]/td[3]/select[2]"));
	WebElement yr=driver.findElement(By.xpath("//*[@id=\"]/tbody/tr[22]/td[3]/select[3]"));
	
	Select syr=new Select(yr);
	Select smnth=new Select(month);
	Select sdate=new Select(date);
	sdate.selectByValue("06");
	smnth.selectByValue("JUN");
	syr.selectByVisibleText("1986");
	}
}