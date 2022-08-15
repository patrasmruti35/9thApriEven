  package varificationintestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualandNotEqual {
  @Test
  public void f() 
  {
	  String a="smruti";
	  String b="smruti";
	
	  
	 // Assert.assertEquals(a, b ,"A   is not equals to B tc is failed");
	  
      Assert.assertNotEquals(a, b);
	  
	  
  }
  
}
