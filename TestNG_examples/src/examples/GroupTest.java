package examples;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;

public class GroupTest {

	@BeforeGroups (groups = {"Group1"})
  public void test() {
	  System.out.println("This method will run before the execution of Group1");
  }
	

	@BeforeGroups (groups = {"Group2"})
	  public void test1() {
		  System.out.println("This method will run before the execution of Group2");
	  }

	@AfterGroups (groups = {"Group1"})
	  public void test2() {
		  System.out.println("This method will run after the execution of Group1");
	  }

	@AfterGroups (groups = {"Group2"})
	  public void test3() {
		  System.out.println("This method will run after the execution of Group2");
	  }
	
}
