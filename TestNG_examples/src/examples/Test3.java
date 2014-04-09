package examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test3 {
  @Test
  public void test() {
	  System.out.println("Method in test");
  }
  
  @Test
  public void test1() {
	  System.out.println("Method in test1");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Method in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Method in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Method in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Method in after class");
  }

}
