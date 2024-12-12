package Testngpackage;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPgm {
 @BeforeTest
 public void setUp()
 {
	 System.out.println("Browse Loading");
 }
 @BeforeMethod
 public void urlloading()
 {
	 System.out.println("Url details");
 }
 @Test(priority=3,invocationCount=3,groups="smoke")
 public void test1()
 {
	 System.out.println("Test1");
 }
 @Test(priority=2,enabled=true)
 public void test2()
 {
	 System.out.println("Test2");
 }
 @Test(priority=1,groups="smoke")
 public void test3()
 {
	 System.out.println("Test3");
 }
 @AfterMethod
 public void aftermethodDetails() {
	 System.out.println("After method details");
 }
 @AfterTest
 public void teardown()
 {
	 System.out.println("Quit browser");
 }
 }
