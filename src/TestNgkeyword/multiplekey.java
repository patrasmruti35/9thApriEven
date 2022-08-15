package TestNgkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class multiplekey {
  @Test(dependsOnMethods = {"c"},invocationCount=3, priority=-2)
  public void f() {
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
