package TRUGlobal;

import java.io.File;  
import java.io.FileOutputStream;  
import org.apache.poi.xwpf.usermodel.XWPFDocument;  
import org.apache.poi.xwpf.usermodel.XWPFTable;  
import org.apache.poi.xwpf.usermodel.XWPFTableRow;  

public class WordDocument
{
	
	    public static void main(String[] args) throws Exception
	    {  
	          XWPFDocument document= new XWPFDocument();  
	          try(FileOutputStream out = new FileOutputStream(new File("D:/TRUGlobal.docx")))
	          {  
	              // Creating Table  With Data
	              XWPFTable tab = document.createTable();  
	              XWPFTableRow row = tab.getRow(0); // Creating First row  
	              //Creating Columns  
	              row.getCell(0).setText("	Module	");  
	              row.addNewTableCell().setText("Test Case Executed ");  
	              row.addNewTableCell().setText("	Time	");  
	              row.addNewTableCell().setText("	Durations	"); 
	              row.addNewTableCell().setText("	Status	"); 
	              
	              row = tab.createRow(); // Creating Second Row  
	              row.getCell(0).setText("	TG_Web	");  
	              row.getCell(1).setText(" Verified service page");  
	              row.getCell(2).setText(" 15: 32 ");
	              row.getCell(3).setText(" 7 sec"); 
	              row.getCell(4).setText(" Pass");
	              
	              row = tab.createRow(); // Creating Third Row  
	              row.getCell(0).setText("	TG_Web	");  
	              row.getCell(1).setText(" Verified Home page");  
	              row.getCell(2).setText(" 15:33");
	              row.getCell(3).setText(" 24 sec"); 
	              row.getCell(4).setText(" Pass");
	              
	              document.createParagraph().createRun().addBreak();
	              
	              XWPFTable table1 = document.createTable();
	  			  XWPFTableRow row1 = table1.getRow(0);
	  			  row1.getCell(0).setText("Test Description");
	  			  row1 = table1.createRow(); // Second Row
	  			  row1.getCell(0).setText(" Verify the service tab page in the TRUGLOBAL Website");

	  			  document.createParagraph().createRun().addBreak();

	  			  XWPFTable table2 = document.createTable();
	  			  XWPFTableRow row2 = table2.getRow(0);
	  			  row2.addNewTableCell().setText("Overall Status ");
	  			  row2.addNewTableCell().setText("Total Pass ");
	  			  row2.addNewTableCell().setText("Total Fail ");
	  			  row2.addNewTableCell().setText("Total NOT executed ");
	  			  row2.addNewTableCell().setText("Total Tests ");
	  			  row2.addNewTableCell().setText("Execution Time ");
	  			  row2.addNewTableCell().setText("Comments ");
	  			  
	  			  row2 = table2.createRow(); 
	              row2.getCell(1).setText(" Pass");  
	              row2.getCell(2).setText(" 0 ");
	              row2.getCell(3).setText(" 0 "); 
	              row2.getCell(4).setText(" 0 ");
	              row2.getCell(5).setText(" 0 "); 
	              row2.getCell(6).setText(" 19 Sec");
	              row2.getCell(7).setText(" Test Case Executed:");
	              
	              
	              document.write(out);  
	          }
	          
	          catch(Exception e)
	          {  
	              System.out.println("Somthing went Wrong " +e);  
	          }  
	          
	          System.out.println("Word Document Created go and check your location...");
	        
	    }  

}
