package group2;

import org.testng.annotations.Test;

public class Group2Test1 {
  @Test(groups="Group2")
  public void test() {
	  System.out.println("This is my first test");
  }
}
