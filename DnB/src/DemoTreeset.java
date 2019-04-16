import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DemoTreeset {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(); 
		ts.add("Munish");
		ts.add("Kumar");
		ts.add("Sharma");
		ts.add("Kumar");
		ts.add("Sharma");
		ts.add("Kapil");
		ts.add("Apple");
java.util.Iterator<String> it=ts.iterator();
		while (it.hasNext())
		{
			String str=it.next();
			System.out.println(str);
		}
	}

}
