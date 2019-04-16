import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class hashdemo {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>(); 
		hs.add(10);
		hs.add(10);
		hs.add(15);
		hs.add(20);
		hs.add(25);
		hs.add(35);
		hs.add(15);
		java.util.Iterator<Integer> it=hs.iterator();
		while (it.hasNext())
		{
			int i=it.next();
			System.out.println(i);
		}

	}

}
