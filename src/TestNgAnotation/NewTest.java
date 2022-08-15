package TestNgAnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void mymethod() 
  {
	  Reporter.log("Test methode runing",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("before methode running",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("after method  running",true);
  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("before class running",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("after class running",true);
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("before test running",true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("after tesr running",true);
  }
 @Test
  public void methode1()
  {
	 Reporter.log("methode1 ruuning",true);
  }
}
