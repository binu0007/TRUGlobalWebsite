package ReadingDataFromExcelSheet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CsvReader_Kumar 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(
				new FileReader(new File("D:\\ReadDataFromExcel/EmployeePractise.csv")));

		String line;
		List<List<String>> allLines = new ArrayList<>();
		List<String> header = new ArrayList<>();

		while ((line = reader.readLine()) != null) 
		{
			Collections.addAll(allLines, Arrays.asList(line.split(",")));
				
		}

		System.out.println(allLines);
		
		header = allLines.get(0);
		System.out.println(header);
		System.out.println("You Can Searched data by Multiple User Input:");

		System.out.println("Please enter the Column Names:\n");
		Scanner sc = new Scanner(System.in);
		String userHeader = sc.nextLine();
		
		String[] array = userHeader.split(",");
		List<String> headerList = Arrays.asList(array);
		
																								
		System.out.println("Please Enter the Corresponding Data");
		String userData = sc.nextLine();
		array = userData.split(",");
		List<String> dataList = Arrays.asList(array);
		
		System.out.println("This is My headerList :"+ " "+headerList);
		System.out.println("This Is My dataList :" + ","+dataList);
		System.out.println("This Is My header :"+ "," + header);
		
		for(int i=0;i<headerList.size();i++) 
		{
			String data = headerList.get(i);
			headerList.set(i, data.trim());
		}
		
		for(int i=0;i<dataList.size();i++) 
		{
			String data = dataList.get(i);
			dataList.set(i, data.trim());
		}
		
		for(int i=0;i<header.size();i++)
		{
			String data = header.get(i);
			header.set(i, data.trim());
		}
		
		List<List<String>> finalData = new ArrayList<>();
		for(int i = 0; i <allLines.size();i++) 
		{
			List<String> eachLine = allLines.get(i);
			
			boolean filter = true;
			for(int j = 0; j<headerList.size();j++)
			{
				String eachHeader = headerList.get(j);
				String eachData = dataList.get(j);
				int headerIndex = header.indexOf(eachHeader.trim());
				
				if(!eachLine.get(headerIndex).trim().equals(eachData))
				{
					filter = false;
				}
			}
			if(filter) 
			{
				finalData.add(eachLine);
			}
		}
		System.out.println("********************************************************************");
		System.out.println(finalData);
	}

}