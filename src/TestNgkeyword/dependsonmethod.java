package TestNgkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod {
  @Test(dependsOnMethods = {"c"})
  public void a() 
  {
	  Reporter.log("a methode is running",true); 
  }
  @Test(timeOut = 100)
  public void b() throws InterruptedException 
  {
	  Thread.sleep(200);
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
