package Testngpackage;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DatePicker {
	WebDriver driver;

	@BeforeMethod
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	@Test
	public void AutomateDate() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		datePickMethod("December 2024","23");
	}
	private void datePickMethod(String expmonth, String expdate)
	{
		while(true) {
			String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]div/div")).getText();
			System.out.println("Month"+month);
			if(month.equals(expmonth)) 
			{
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]div/div/a[2]")).click();
		}
			}
		List<WebElement> date=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for(WebElement d:date) {
			String datetext=d.getText();
			if(datetext.equals(expdate)) {
				d.click();
				break;
			}
			}
		}
}
