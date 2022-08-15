package ExcelSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile =new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		
		           Workbook mybook = WorkbookFactory.create(myFile);
		           Sheet mysheet = mybook.getSheet("sheet1");
		           
		           
		           for(int i=0;i<=2;i++) {
		           
		           String value = mysheet.getRow(0).getCell(i).getStringCellValue();
		           System.out.println(value);
		           }
            
		           for(int i=0;i<=1;i++) 
		           {
		        	   String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			           System.out.println(value);
		           }
		           
		           
	}

}
