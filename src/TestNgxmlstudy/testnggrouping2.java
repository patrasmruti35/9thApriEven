package TestNgxmlstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testnggrouping2 {
	@Test(groups = {"sanity"})
	  public void d() 
	  {
		  Reporter.log("d method is running",true);
	  }
	  @Test
	  public void e() 
	  {
		  Reporter.log("e method is running",true);
	  }
	  @Test(groups = {"regration"})
	  public void f() 
	  {
		  Reporter.log("f method is running",true);
	  }
	  @Test
	  public void g() 
	  {
		  Reporter.log("g method is running",true);
	  }

}
