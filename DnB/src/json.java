import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class json {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Munish");
		al.add("Kumar");
		al.add("Sharma");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
