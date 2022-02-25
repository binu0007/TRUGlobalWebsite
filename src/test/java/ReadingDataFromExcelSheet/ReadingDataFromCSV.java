package ReadingDataFromExcelSheet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVReader;

public class ReadingDataFromCSV {
	private static Scanner x;

	public void ReadData() throws Throwable {
		CSVReader reader = new CSVReader(new FileReader("D:/ReadDataFromExcel/Employee.csv"));
	
		String data[];

		while ((data = reader.readNext()) != null) {
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------");
	}

	public static void readRecord(String searchTerm, String filePath) {
		boolean found = false;
		String EmpID = "";
		String FirstName = "";
		String LastName = "";
		String MiddleName = "";
		String Address = "";
		String PhoneNumber = "";
		try {
			x = new Scanner(new File(filePath));
			x.useDelimiter("{,\n}");
			while (x.hasNext() && !found) {
				EmpID = x.next();
				FirstName = x.next();
				LastName = x.next();
				MiddleName = x.next();
				Address = x.next();
				PhoneNumber = x.next();

				if (EmpID.equals(searchTerm)) {
					found = true;
				}

			}
			if (found) {
				JOptionPane.showMessageDialog(null, "EmpID: " + FirstName + "FirstName:" + LastName + "LastName"
						+ MiddleName + "MiddleName" + Address + "Address" + PhoneNumber + "PhoneNumber");

			} else {
				JOptionPane.showMessageDialog(null, "Record not found:");
			}

		} catch (Exception e) {

		}
	}

	public String searchCsvLine(int searchColumnIndex, String searchString) throws Throwable {
		String resultRow = null;
		BufferedReader br = new BufferedReader(new FileReader("D:/ReadDataFromExcel/Employee.csv"));
		String line;
		while ((line = br.readLine()) != null) {
			String[] values = line.split(",");
			if (values[searchColumnIndex].equals(searchString)) {
				resultRow = line;
				break;
			}
		}
		br.close();
		return resultRow;
	}

	public static void main(String[] args) throws Throwable {

		ReadingDataFromCSV rd = new ReadingDataFromCSV();
		rd.ReadData();

		String filePath = "D:/ReadDataFromExcel/Employee.csv";
		String searchTerm = "1001";
		readRecord(searchTerm, filePath);
		String SearchedItem = rd.searchCsvLine(2, "Binu");
		System.out.println("SearchedItem:" + SearchedItem);
		/*
		 * String excelpath = "D:/ReadDataFromExcel/Employee.csv"; XSSFWorkbook workbook
		 * = new XSSFWorkbook(excelpath); XSSFSheet sheet = workbook.getSheet("EMP");
		 * String value = sheet.getRow(1).getCell(0).getStringCellValue();
		 * System.out.println(value);
		 */

		BufferedReader br = new BufferedReader(new FileReader("D:/ReadDataFromExcel/Employee.csv"));
		String line;
		while ((line = br.readLine()) != null) {
			// use comma as separator
			String[] cols = line.split("|");
			System.out.println("Coulmn 4= " + cols[4] + " , Column 5=" + cols[5]);
		}

	}

}
