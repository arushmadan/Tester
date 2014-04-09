package examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
@Parameters({"firstname","lastname"})	
  @Test
  public void test(String fname, String lname) {
	  System.out.println(fname+" "+lname);
  }
}
