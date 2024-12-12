package Testngpackage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrivagoDatepicker {
	ChromeDriver driver;
	@BeforeMethod
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.trivago.co.uk/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

	 @Test
	    public void automateTrivagoDate() throws InterruptedException {
	        // Click on check-in date field"
	        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[1]")).click();

	        // Get list of dates
	        List<WebElement> dates = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[25]/time"));

	        // Select check-in date
	        LocalDate checkInDate = LocalDate.now().plusDays(7);
	        String checkInDateString = checkInDate.format(DateTimeFormatter.ofPattern("d"));
	        for (WebElement date : dates) {
	            if (date.getAttribute("data-day").equals(checkInDateString)) {
	                date.click();
	                break;
	                }
	            }
	        // Select check-out date
	        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[2]/span/span/span[1]")).click();
	        List<WebElement> checkoutDates = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[27]/time"));
	        LocalDate checkOutDate = checkInDate.plusDays(3);
	        String checkOutDateString = checkOutDate.format(DateTimeFormatter.ofPattern("d"));
	        for (WebElement date : checkoutDates) {
	            if (date.getAttribute("data-day").equals(checkOutDateString)) {
	                date.click();
	                break;
	            }
	        }       
	    }
	}

