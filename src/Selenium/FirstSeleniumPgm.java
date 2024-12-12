package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumPgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualTitle=driver.getTitle();
		System.out.println("Title="+actualTitle);//Expected title
		
		String exp="Facebook";
		
		if(exp.equals(actualTitle))
		{
			System.out.println("Title are same");
		}
		else {
			System.out.println("Not same");
		}
	}

}
