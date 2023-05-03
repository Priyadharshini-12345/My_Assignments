package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Alpha");
		list.add("Sigma");
		list.add("Shrikanth");
		list.add("Delta");
		list.add("Gamma");
		list.add("Shilpa");
		for(int i=0;i<list.size();i++)
		{
			String string = list.get(i);
			if(string.startsWith("S"))
			{System.out.println(list.get(i));	}
		}
		list.add("Pie");
		int size = list.size();
		System.out.println("Size of the list "+size);
		list.add("Pie");
		for(int i=0;i<list.size();i++)
		{System.out.println(list.get(i));}
		list.add(3, "Choco");
		list.set(1, "Zudio");
		list.remove("Pie");
		System.out.println("Updated list");
		for(int i=0;i<list.size();i++)
		{System.out.println(list.get(i));}
	}

}
