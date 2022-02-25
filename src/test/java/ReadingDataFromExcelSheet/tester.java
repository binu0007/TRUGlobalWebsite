package ReadingDataFromExcelSheet;

import javax.swing.*;
import java.io.IOException;
import java.util.*;
import java.io.*;


public class tester
{
	public static void main (String [] args ) throws IOException
	{

		boolean cool = checkValidID();
		System.out.println(cool);
	}

	public static boolean checkValidID() throws IOException
	{
		boolean results = false;
		Scanner scan = new Scanner(new File("D:/ReadDataFromExcel/Employee.csv"));
		String s;
		int indexfound=-1;
		String word = JOptionPane.showInputDialog("Enter your Employee ID");
		while (scan.hasNextLine()) 
		{
			s = scan.nextLine();
			if(s.indexOf(word)>-1)
				indexfound++; 
		}
		if (indexfound>-1)
		{ 
			results = true;
		}
		else 
		{
			results = false;
		}
		return results;
	}
}