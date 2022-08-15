package ajinkyatestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestassert {
  @Test
  public void f() 
  {
	  String a="pune";
	  String b="pune";
	  String c="cuttack";
	  
	  Assert.assertEquals(a, c);
	  Assert.assertEquals(a, b);
  }
}
