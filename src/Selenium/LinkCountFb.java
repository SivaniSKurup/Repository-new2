package Selenium;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LinkCountFb {
	ChromeDriver driver;
	@Before
	public void setUP() {
		driver.new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public LinkCountFb() {
		List<WebElement>linkDetails=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links="+linkDetails.size());
		
		for(WebElement element:linkDetails)
		{
			String link=element.getAttribute("href");
			String linkText=element.getText();
			System.out.println("Link="+link);
			System.out.println("Link Text="+linkText);
		}
	}
	private void verify(String link) {
		try {
			
			URL u=new URL(link);
			HttpURLConnection code=(HttpURLConnection)u.openConnection();
			
			if(code.getResponseCode()==200) 
			{
				System.out.println("Response code is 200----------"+link);
			}
			else if(code.getResponseCode()==404) {
				System.out.println("Response code is 404----------"+link);
			}
			else {
				System.out.println("Other response code ");
			}
		}
	}
}
