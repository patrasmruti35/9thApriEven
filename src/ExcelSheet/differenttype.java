package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class differenttype {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
File myFile =new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		
        Workbook mybook = WorkbookFactory.create(myFile);
        Sheet mysheet = mybook.getSheet("sheet2");
         int totalrow = mysheet.getLastRowNum();
       int totalcell = mysheet.getRow(totalrow).getLastCellNum()-1;
       
       for(int i=0;i<=totalrow;i++)
       {
    	   for(int j=0;j<=totalcell;j++)
    	   {
    		  Cell mycell = mysheet.getRow(i).getCell(j);
    		  CellType celldatatype = mycell.getCellType();
    		  
    		 if(celldatatype==CellType.STRING) 
    		 {
    			 String value = mycell.getStringCellValue();
    			 System.out.print(value +" || ");
    			  
    		 }
    		  
    		  else if (celldatatype==CellType.NUMERIC) 
    		  {
				double value = mycell.getNumericCellValue();
				System.out.print(value +"||");
			}
    		  
    		  else if (celldatatype==CellType.BOOLEAN) 
    		  {
				boolean value = mycell.getBooleanCellValue();
				System.out.print(value +"||");
			}
    		  
    		  
    		
    		  
    		  
    		  
    	   }
    	   System.out.println();
       }
       

	}

}
