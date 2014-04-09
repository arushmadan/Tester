package examples;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DPExample {
  @Test(dataProvider = "myDataProvider")
  public void f(Integer n, String s) {
	  System.out.println(n+" : "+s);
  } 

  @DataProvider(name="myDataProvider", parallel=false)
  public Object[][] dp() {
	  return new Object[][] {
		      new Object[] { 1, "Salin" },
		      new Object[] { 2, "Arush" },
		      new Object[] { 3, "Varun" },
		      new Object[] { 4, "Sarabjeet" },
		    };
  }
}
