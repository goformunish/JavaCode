package co.munish.util;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Arrayl {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		ArrayList<String> names=new ArrayList<String>(); 
		al.add("Munish");
		al.add("Kumar");
		al.add("Sharma");
		names.add("Munish");
		names.add("Kumar");
		names.add("Sharma");
		
names.set(2,"Kumaran");
		for (int i=0;i<al.size();i++)
		{
//System.out.println(al.get(i));
	}
System.out.println(al);
		java.util.Iterator<String> it=names.iterator();
		while (it.hasNext())
		{
	System.out.println(it.next());
		}
		for (String i: names)
		{
System.out.println(i);	
		}
		ArrayList namecopy=new ArrayList();
		ArrayList namebackup=new ArrayList();
		namecopy.addAll(names);
		namecopy.add("Ji");
		for (int i=0;i<namecopy.size();i++)
		{
		System.out.println(namecopy.get(i));
		}
		if (namecopy.containsAll(names))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("They are not same");
		}
			names.clear();
			if (names.isEmpty())
{
	System.out.println("There is nothing present in the name");
}
	}

}
