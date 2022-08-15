package Kitutility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class utility 
{
 public static String readFromExcel(int rownum,int cellnum) throws EncryptedDocumentException, IOException
 {
	 File myfile=new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
	 Reporter.log("Read data from excelsheet",true);
	 String value = WorkbookFactory.create(myfile).getSheet("sheet2").getRow(rownum).getCell(cellnum).getStringCellValue();
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
