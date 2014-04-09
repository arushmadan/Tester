package examples;

import org.testng.annotations.Test;

public class MultipleGroupsTest {
	
  @Test(groups="Arush")
  public void testArush() {
	  System.out.println("Test of Arush Group");
  }
  
  @Test(groups="Salin")
  public void testSalin() {
	  System.out.println("Test of Salin Group");
  }
  
  @Test(groups="Varun")
  public void testVarun() {
	  System.out.println("Test of Varun Group");
  }
}
