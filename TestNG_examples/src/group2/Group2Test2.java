package group2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Group2Test2 {
  @Test(groups="Group2")
  public void test() {
	  System.out.println("Method within test");
  }
  
  @Test(groups="Group2")
  public void test1() {
	  System.out.println("Method within test1");
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
