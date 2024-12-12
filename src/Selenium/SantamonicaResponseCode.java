package Selenium;

import java.net.HttpURLConnection;

import java.net.URL;

import org.junit.Test;

public class SantamonicaResponseCode {
	String link="https://santamonicaedu.in/";
	
	@Test
	public void responseCodeSm(){
		try
		{
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			 System.out.println(code);
			if(code==404) {
				System.out.println("Succesfull link");
			}
			else {
				System.out.println("Brokenlink");
			}
		}
		catch(Exception e) {}
	}
}
