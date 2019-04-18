import java.io.*;

import org.json.JSONObject;

public class fileread {

	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream(
				"C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\tes.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream, "UTF8"));

		String strLine;

		// Read File Line By Line
		while ((strLine = br.readLine()) != null) {
			// Print the content on the console
			System.out.println(strLine);
		}

		// Close the input stream
		fstream.close();

	}

}
