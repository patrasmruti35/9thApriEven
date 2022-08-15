package TestNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGListener.listener.class)
public class demo {
  @Test
  public void mymethod1() 
  {
	  Reporter.log("mymethod1 -->tc excuation is started",true);
  }
  @Test
  public void mymethod2() 
  {
	  Assert.fail();
	  Reporter.log("mymethod2 -->tc excuation is started",true);
  }
  @Test(dependsOnMethods = {"mymethod2"})
  public void mymethod3() 
  {
	 
	  Reporter.log("mymethod3-->tc excuation is started",true);
  }
  @Test
  public void mymethod4() 
  {
	  Reporter.log("mymethod4 -->tc excuation is started",true);
  }
}
