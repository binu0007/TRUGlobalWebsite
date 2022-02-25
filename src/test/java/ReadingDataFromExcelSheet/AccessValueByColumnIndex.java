package ReadingDataFromExcelSheet;


import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;



public class AccessValueByColumnIndex
{
    private static final String SAMPLE_CSV_FILE_PATH = "D:/ReadDataFromExcel/Employee.csv";

    public static void main(String[] args) throws IOException
    {
        try 
        (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        )
        
        {
            for (CSVRecord csvRecord : csvParser) 
            {
                // Accessing Values by Column Index
                String EmpID = csvRecord.get(0);
                String FirstName = csvRecord.get(1);
                String LastName = csvRecord.get(2);
                String MiddleName = csvRecord.get(3);
                String Address = csvRecord.get(4);
                String PhoneNumber = csvRecord.get(5);

                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("EmpID : " + EmpID);
                System.out.println("FirstName : " + FirstName);
                System.out.println("LastName : " + LastName);
                System.out.println("MiddleName: " + MiddleName);
                System.out.println("Address: " + Address);
                System.out.println("PhoneNumber: " + PhoneNumber);
                
                System.out.println("---------------\n\n");
            }
        }
    }
}
