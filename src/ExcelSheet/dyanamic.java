package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dyanamic {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	File myFile =new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		
        Workbook mybook = WorkbookFactory.create(myFile);
        Sheet mysheet = mybook.getSheet("sheet2");
         int totalrow = mysheet.getLastRowNum();
         System.out.println(totalrow);
         
       int totalcell = mysheet.getRow(0).getLastCellNum()-1;
       System.out.println(totalcell);
       
       
       for(int i=0;i<=totalrow;i++)
       {
    	   for(int j=0;j<=totalcell;j++)
    	   {
    		 String value = mysheet.getRow(i).getCell(j).getStringCellValue();
    		 System.out.print(value+" ||");
    	   }
    	   System.out.println();
       }
       
       
       
       
	}
  
}
