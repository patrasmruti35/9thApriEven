package Kitutility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class utility1
{
	public static String datareadfrompropertfile(String key) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\PATRA\\eclipse-workspace\\9th April EVN Selinum\\myproperty.properties");
		pro.load(myFile);
		String value = pro.getProperty(key);
		return value;
	}
	public static void capture(WebDriver driver, String TDID) throws IOException
	  {
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest=new File("C:\\Users\\PATRA\\Videos\\AnyDesk"+TDID+".png");
		  FileHandler.copy(src, dest);
		  Reporter.log("takeschreenshort",true);
	  }

}
