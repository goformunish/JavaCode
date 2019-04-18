import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class arraysrt {

	public static void main(String[] args) throws IOException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream("C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\output.txt"),
				"UTF-8"));
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\uniqe.txt", true));
		String line;
		ArrayList al = new ArrayList();
		while ((line = br.readLine()) != null) {
			al.add(line);
			bw.append(line + "\n");
		}
		System.out.println(al);
		try {
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));

			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		br.close();
		bw.close();
	}

}
