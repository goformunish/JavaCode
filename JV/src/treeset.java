import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class treeset {

	public static void main(String[] args) throws IOException, IOException {
		try
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\output.txt"),
				"UTF-8"));
		TreeSet<Integer> ts=new TreeSet<Integer>();
String line;
while ((line=br.readLine())!=null)
{
	ts.add(Integer.parseInt(line));
}
java.util.Iterator<Integer> it=ts.iterator();
while (it.hasNext())
{
	System.out.println(it.next());
}
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}

	}

}
