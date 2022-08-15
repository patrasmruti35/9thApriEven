package revice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestgroup {
	  @Test(groups = {"sanity"})
	  public void a() 
	  {
		  Reporter.log("a is runing",true);
	  }
	  @Test(groups = {"regration"})
	  public void b() 
	  {
		  Reporter.log("b is runing",true);
	  }
	  @Test
	  public void c() 
	  {
		  Reporter.log("c is runing",true);
	  }
	  @Test
	  public void d() 
	  {
		  Reporter.log("d is runing",true);
	  }
}
