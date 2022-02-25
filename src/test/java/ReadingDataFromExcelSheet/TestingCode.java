package ReadingDataFromExcelSheet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestingCode 
{
	String userHeader;
	public void UserInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Header to search:");
		int Col_Num = sc.nextInt();
		for(int j=1; j<=Col_Num; j++)
		{
			 System.out.println("Please enter the column names:\n");
			String userHeader = sc.nextLine();
			 
			 System.out.println("Please Enter the respective Data:");
			 String userData = sc.nextLine();
		}
	}
	
	public void PrintingData() throws Throwable
	{
		BufferedReader reader = new BufferedReader(new FileReader(new File("D:/ReadDataFromExcel/EmployeePractise.csv")));

		String line;
		List<List<String>> allLines = new ArrayList();
		List<String> header = new ArrayList();

		while ((line = reader.readLine()) != null)
		{
			Collections.addAll(allLines, Arrays.asList(line.split(",")));
		}
		System.out.println(allLines);
		
		header = allLines.get(0);
		System.out.println(header);
		
		/*
		 * System.out.println("userHeader is : " + "," + userHeader);
		 * System.out.println(String.format("given headers=%s", userHeader));
		 * 
		 * System.out.println("userHeader is :"+ ","+userData);
		 * System.out.println(String.format("given data=%s", userData));
		 * 
		 * 
		 * List<List<String>> finalData = new ArrayList(); for (int i = 1; i
		 * <allLines.size(); i++) { List<String> eachLine = allLines.get(i); int
		 * headerIndex = header.indexOf(userHeader.trim());
		 * if(eachLine.get(headerIndex).equals(userData)) { finalData.add(eachLine); } }
		 * System.out.println(finalData);
		 */
		
	}

	public static void main(String[] args) throws Throwable 
	{
		TestingCode ts=new TestingCode();
		ts.PrintingData();
		ts.UserInput();
	}

}
