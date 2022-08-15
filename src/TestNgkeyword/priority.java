package TestNgkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
  @Test(priority=-2)
  public void a() 
  {
	  Reporter.log("a methode is running",true);
  }
  @Test(priority=5)
  public void b() 
  {
	  Reporter.log("b methode is running",true);
  }
  @Test(priority=-2)
  public void c() 
  {
	  Reporter.log("c methode is running",true);
  }
  @Test(priority=0)
  public void d() 
  {
	  Reporter.log("d methode is running",true);
  }
  @Test(priority=1)
  public void e() 
  {
	  Reporter.log("e methode is running",true);
  }
}
