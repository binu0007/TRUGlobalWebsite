package ReadingDataFromExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel
{
	public static void main(String[] args) throws Throwable, IOException 
	{
		FileInputStream fis=new FileInputStream("D:/ReadDataFromExcel/readData.xlsx");
		//		step 1: open workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		
		//		step 2: Get the control of the sheet-1
		Sheet sh = wb.getSheet("Sheet1");
		
		//		step 3: get the control of the 1st row
		Row row = sh.getRow(1);
		
		//		step 4: get the control of the 2nd cell
		Cell cell = row.getCell(2);
		String data = cell.getStringCellValue();
		System.out.println(data);
		//		step 5: close the workbook
		wb.close();
		
		

	}

}
