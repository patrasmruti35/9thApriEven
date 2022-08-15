package TestNgAnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class anotatinstudy {
  @Test
  public void validUserId() 
  {
	  Reporter.log("User Id Valid",true);
  }
  @BeforeMethod
  public void  Login()
  {
	  Reporter.log("Login is done",true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("logout is done",true);
  }
  @Test
  public void testuserid()
  {
	  Reporter.log("hello",true);
  }
  
}
