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

public class ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile= new File("D:\\9th april\\New Microsoft Excel Worksheet.xlsx");
		
		Workbook mybook = WorkbookFactory.create(myFile);
		 Sheet mysheet = mybook.getSheet("sheet1");
	    double myvalue = mysheet.getRow(1).getCell(0).getNumericCellValue();
	    System.out.println(myvalue);
		 
	    boolean value = mysheet.getRow(1).getCell(1).getBooleanCellValue();
	    System.out.println(value);
	    
	    String stri = mysheet.getRow(2).getCell(2).getStringCellValue();
	    System.out.println(stri);
		
	}

}
