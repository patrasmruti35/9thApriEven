package TestNgkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enablestudy {
	@Test(enabled = false)
	  public void a() 
	  {
		  Reporter.log("a methode is running",true);
	  }
	  @Test
	  public void b() 
	  {
		  Reporter.log("b methode is running",true);
	  }
	  @Test
	  public void c() 
	  {
		  Reporter.log("c methode is running",true);
	  }
	  @Test
	  public void d() 
	  {
		  Reporter.log("d methode is running",true);
	  }
	  @Test
	  public void e() 
	  {
		  Reporter.log("e methode is running",true);
	  }
	
}
