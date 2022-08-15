package TestNgxmlstudy;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void a() 
  {
	  Reporter.log("a method is running",true);
  }
  @Test
  public void b() 
  {
	  
	  Reporter.log("b method is running",true);
  }
  @Test
  public void c() 
  {
	  Reporter.log(" method is running",true);
  }
}
