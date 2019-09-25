package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testng_demo2 {
  @Test
  public void f() {
	  System.out.println("In the test annotation.");
  }
  @Test
  public void f1() {
	  System.out.println("In the second test annotation.");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In the before method annotation.");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("In the after method annotation.");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("In the before class annotation.");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("In the after class annotation.");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("In the before test annotation.");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("In the after test annotation.");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In the before suite annotation.");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In the after suite annotation.");
  }

}