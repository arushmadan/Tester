package examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	@Parameters({"firstname","lastname"})	
  @Test
  public void test(String fname, String lname) {
		System.out.println("Firstname: "+fname);
		System.out.println("Lastname: "+lname);
  }
}
