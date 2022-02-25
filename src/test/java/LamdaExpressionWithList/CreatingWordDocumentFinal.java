package LamdaExpressionWithList;


import java.io.File;  
import java.io.FileOutputStream;  
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;  

public class CreatingWordDocumentFinal
{  
		public static void main(String[] args)throws Exception
		{
			try
			{
			XWPFDocument doc = new XWPFDocument();
			XWPFTable table = doc.createTable();
			XWPFTableRow row0 = table.getRow(0);
			//table.setRowBandSize(2);
			table.setWidth("100%");
			
			XWPFTableCell cell0 = row0.getCell(0);
			cell0.setText("Module");
			XWPFTableCell cell1 = row0.createCell();
			cell1.setText("Test Case Tested");
			XWPFTableCell cell2 = row0.createCell();
			cell2.setText("Time");
			XWPFTableCell cell3 = row0.createCell();
			cell3.setText("Duration");
			XWPFTableCell cell4 = row0.createCell();
			cell4.setText("Status");
			row0 = table.createRow(); // Second Row
			row0.getCell(0).setText("TGWEB");
			row0.getCell(1).setText("VERIFY SERVICES PAGE");
			row0.getCell(2).setText("01/19/2022");
			row0.getCell(3).setText("7SEC");
			row0.getCell(4).setText("PASS");
			
			doc.createParagraph().createRun().addBreak();
			
			XWPFTable table1 = doc.createTable();
			XWPFTableRow row1 = table1.getRow(0);
			table1.setWidth("100%");

			row1.getCell(0).setText("Test Description");
			row1 = table1.createRow(); // Second Row
			row1.getCell(0).setText("Verify the service tab page in the TRUGLOBAL Website");
			doc.createParagraph().createRun().addBreak();

			XWPFTable table2 = doc.createTable();
			XWPFTableRow row2 = table2.getRow(0);
			table2.setWidth("100%");
			row2.getCell(0).setText("Overall Status");
			row2.addNewTableCell().setText("Total pass");
			row2.addNewTableCell().setText("Total fail");
			row2.addNewTableCell().setText("Total not executed");
			row2.addNewTableCell().setText("Total tests");
			row2.addNewTableCell().setText("Execution time");
			row2.addNewTableCell().setText("Comments");
			
			row2 = table2.createRow();
			row2.getCell(0).setText("PASS");
			row2.getCell(1).setText("0");
			row2.getCell(2).setText("0");
			row2.getCell(3).setText("0");
			row2.getCell(4).setText("0");
			row2.getCell(5).setText("19 sec");
			row2.getCell(6).setText("Test Case Executed");
			
			FileOutputStream out = new FileOutputStream (new File("D:/TRUGlobal.docx"));
			XWPFParagraph paragraph = doc.createParagraph();

			doc.write(out);
			out.close();
			
		}
			catch (Exception e) {
			System.out.println(e);
			}
			System.out.println("doc is created");
	}
	}
	

