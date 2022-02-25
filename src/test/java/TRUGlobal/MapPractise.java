package TRUGlobal;

import java.util.*;

public class MapPractise {

	public static void main(String[] args)
	{

		//Map map=new HashMap();
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Binu");
		map.put(2, "Bhai");
		map.put(3, "Ambani");
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey() + " " +m.getValue());
		}
		 
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
	}

}
