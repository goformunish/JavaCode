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
		ArrayList alint=new ArrayList();
		alint.add(3);
		alint.add(5);
		alint.add(9);
		java.util.Iterator it1=alint.iterator();
		while (it1.hasNext())
		{
			System.out.println(it1.next());
		}
al.set(2,"Kumaran");
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
		for (int i=0;i<namecopy.size();i++)
		{
		System.out.println(namecopy.get(i));
		}
		namecopy.add("Munish");
		if (namecopy.contains("Munish"))
		{
			System.out.println("Munish indeed exists in the Array");
		}
		if (names.containsAll(namecopy))
		{
			System.out.println("Name and Namecopy array are same");
		}
	}

}
