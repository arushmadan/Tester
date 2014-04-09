package examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test2 {
  @Test
  public void test() {
	  System.out.println("Method within test");
  }
  @Test
  public void test1() {
	  System.out.println("Method within test1");
  }
  @Test
  public void test2() {
	  System.out.println("Method within test2");
  }
  @Test
  public void test3() {
	  System.out.println("Method within test3");
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
