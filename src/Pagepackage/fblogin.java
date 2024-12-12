package Pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class fblogin {
WebDriver driver;
By fbemail=By.id("email");
By fbpasswrd=By.id("pass");
By fbloginbutton=By.name("login");

public  fblogin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver,this);
}
public void setValues(String email,String password) {
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpasswrd).sendKeys(password);
}

public void login() {
	driver.findElement(fbloginbutton).click();
	
}
}
