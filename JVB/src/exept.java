import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class exept {

	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream(
				"C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\result_CMP_BOL_V6.0_20000.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream, "UTF-8"));

		String jsonString;
		while ((jsonString = br.readLine()) != null) {
			try {

				JsonObject jsonObject = new JsonParser().parse(jsonString).getAsJsonObject();

				String duns = jsonObject.getAsJsonObject("OrderProductResponse")
						.getAsJsonObject("OrderProductResponseDetail").getAsJsonObject("InquiryDetail")
						.get("DUNSNumber").getAsString();
				System.out.println(duns);
				  String fileName = "C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\result_CMP_BOL_V6.0_20000_duns.txt";
				  BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
				writer.write(duns);
				writer.close();
			}

			catch (Exception e) {
				System.out.println("Exception");
			}
		}
	}
}
