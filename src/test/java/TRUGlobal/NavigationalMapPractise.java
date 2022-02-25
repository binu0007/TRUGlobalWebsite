package TRUGlobal;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigationalMapPractise {

	public static void main(String[] args)
	{
		NavigableMap<Integer, String> Nmap=new TreeMap<Integer, String>();
		Nmap.put(1, "Binu");
		Nmap.put(2, "Bhai");
		Nmap.put(3, "Ambani");
		Nmap.put(4, "TRUGlobal");
		
		System.out.println("Descending order "+ Nmap.descendingMap());
		System.out.println("Head Map "+Nmap.headMap(2, true));
		System.out.println("Tail Map: " +Nmap.tailMap(4, true));
		System.out.println("Sub Map " +Nmap.subMap(1, false, 3, true));

	}

}
