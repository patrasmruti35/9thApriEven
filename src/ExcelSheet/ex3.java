package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile =new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		
        Workbook mybook = WorkbookFactory.create(myFile);
        Sheet mysheet = mybook.getSheet("sheet1");
        
         
         System.out.println("==============");
         
         for(int i=0;i<=1;i++)
         {
        	 for(int j=0;j<=2;j++)
        	 {
        		 String mycell = mysheet.getRow(i).getCell(j).getStringCellValue();
                 System.out.print(mycell+"||"  );
        	 }
        	 System.out.println();
         }
         
         
         
         
         
         
	}

}

