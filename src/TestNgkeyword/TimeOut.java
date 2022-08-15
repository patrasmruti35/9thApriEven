package TestNgkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
  @Test(timeOut =1000 )
  
   public void a() throws InterruptedException 
  {
	  Thread.sleep(800);
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
