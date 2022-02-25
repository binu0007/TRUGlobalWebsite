package TRUGlobal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class CreatingWordDocument {

	public static void main(String[] args) throws Throwable 
	{
		
		XWPFDocument document=new XWPFDocument();
		
		XWPFTable table=document.createTable();
		
		XWPFTableRow	row0=table.getRow(0);
		XWPFTableCell	cell0=row0.getCell(0);
		cell0.setText("	Module	");
		
		XWPFTableCell cell1= row0.createCell();
		cell1.setText("	Test cases Executed	");	
		XWPFTableCell cell2= row0.createCell(); 
		cell2.setText("	Time	");	  
		XWPFTableCell cell3= row0.createCell(); 
		cell3.setText("	Durations	");
		XWPFTableCell cell4= row0.createCell(); 
		cell4.setText(" Status	");
		
		XWPFTableRow	row4=table.createRow();
		XWPFTableRow	row20=table.getRow(0);
		XWPFTableCell	cell20=row0.getCell(0);
		XWPFTableRow	row24=table.createRow();
			 
		
		
		System.out.println("***************************************************************************************");
		
		
		
		
		try
		{
			FileOutputStream output=new FileOutputStream(new File("D:/binu.docs"));
			/*XWPFParagraph paragraph=document.createParagraph();
			
			XWPFRun run=paragraph.createRun();
			run.setText("This is a word document");*/
			document.write(output);
			document.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
