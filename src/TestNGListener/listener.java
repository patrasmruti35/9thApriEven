package TestNGListener;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener implements ITestListener
{
 @Override
public void onTestStart(ITestResult result) {
	 Reporter.log(" tc excutation is started"+result.getName(),true);
}
 
 @Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("tc excutation is failed"+result.getName(),true);
	}
 @Override
	public void onTestSkipped(ITestResult result) 
 {
	 Reporter.log("tc excutation is skipped"+result.getName(),true);
	
	}
  @Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("tc excutation is success"+result.getName(),true);
	}

}
