package ReadingDataFromExcelSheet;

import java.io.File;
import java.io.PrintWriter;
public class  CreatingCSV 
{
	public static void main(String[] args) 
	{
		try
		{
			PrintWriter pw= new PrintWriter(new File("D:/ReadDataFromExcel/Employee.csv"));
			StringBuilder sb=new StringBuilder();
			sb.append("	EmpID	"  +  ",");
			sb.append("	FirstName	" + ",");
			sb.append("	LastName	" + ",");
			sb.append("	MiddleName	" + ",");
			sb.append("	Address	" + ",");
			sb.append("	PhoneNumber	" + "\r\n");
			
			
			sb.append("	1000	" 		 +  ",");
			sb.append("	Binu	"  		 +  ",");
			sb.append("	Bhai	"  		 +  ",");
			sb.append("	Ambani	"  		 +  ",");
			sb.append("	Patna	"  		 +  ",");
			sb.append("	9334979801	" 	 + "\r\n");
	
			sb.append("	1001	"  		 +  ",");		
			sb.append("	chandra	"  		 +  ",");
			sb.append("	shekar	" 		 +  ",");
			sb.append("	singh	" 		 +  ",");
			sb.append("	Tamil Nadu	" 	 +  ",");
			sb.append("	9334967612	"	 + "\r\n");
			
			sb.append("	1002	" 		 +  ",");			
			sb.append("	Amritha	" 		 +  ",");	
			sb.append("	Patiyala	"	 +  ",");
			sb.append("	Rani	"  		 +  ",");
			sb.append("	kerla	" 		 +  ",");
			sb.append("	8763343801	"	 + "\r\n");
			
			pw.write(sb.toString());
			pw.close();
			System.out.println("  Waoooooooooo Your CSV File is Created Go and Check your Location");
		}
		
		catch (Exception e)
		{
				System.out.println("Go and check code ONCE:");
		}
}
}

