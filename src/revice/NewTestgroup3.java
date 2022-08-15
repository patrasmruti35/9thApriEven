package revice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestgroup3 {
	  @Test(groups = {"sanity"})
	  public void e() 
	  {
		  Reporter.log("e is runing",true);
	  }
	  @Test
	  public void f() 
	  {
		  Reporter.log("f is runing",true);
	  }
	  @Test
	  public void g() 
	  {
		  Reporter.log("g is runing",true);
	  }
	  @Test(groups = {"regration"})
	  public void h() 
	  {
		  Reporter.log("h is runing",true);
	  }
}
