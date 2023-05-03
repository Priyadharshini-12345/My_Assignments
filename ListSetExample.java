package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSetExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Shakthi");
		list.add("George");
		list.add("Arun");
		list.add("Chandru");
		list.add("Eshwar");
		list.add("Bala");
		list.add("Farook");
		list.add("Arun");
		list.add("Bala");
		Set<String> uniqueset = new HashSet<String>(list);
		System.out.println("Unique values "+uniqueset);
		Set<String> nameSet = new HashSet<String>();
		Set<String> duplicateSet = new HashSet<String>();
		for(int i=0;i<list.size();i++)
		{
			if(nameSet.add(list.get(i))==false)
			{
				duplicateSet.add(list.get(i));
			}
		}
		System.out.println("Duplicate Values "+duplicateSet);
		Set<String> treeset = new TreeSet<String>(list);
		System.out.println("Treeset "+treeset);
		Set<String> linkedhashSet = new LinkedHashSet<String>(list);
		System.out.println("linkedHasSet "+linkedhashSet);
		
	}
	
}

