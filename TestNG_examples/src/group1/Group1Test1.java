package group1;

import org.testng.annotations.Test;

public class Group1Test1 {
  @Test(groups="Group1")
  public void test() {
	  System.out.println("This is my first test");
  }
}
