package TestNgkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class inovactioncountstudy {
  @Test(invocationCount =5 )
  public void mymethod() 
  {
	  Reporter.log("mymethod is running",true);
  }
}
