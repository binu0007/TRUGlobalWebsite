package TRUGlobal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractise {

	public static void main(String[] args)
	{

		ArrayList<String> list=new ArrayList<String>();
		list.add("Binu");
		list.add(("Bhai"));
		list.add("Ambani");
		System.out.println(list);
		for(String FullName:list)
		{
			System.out.println(FullName);
		}
		list.add(3, "Patna");
		System.out.println(list);
		list.addAll(list);
		System.out.println(list);
		
		list.add(4, "Bihar");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.retainAll(list);
		System.out.println(list);
		
		Iterator it=list.iterator();
		System.out.println(it);
		System.out.println(list);
	}

}
