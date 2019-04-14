package com.json;

import java.io.*;
import java.lang.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class valid {

	public static void main(String[] args) throws IOException {

		try {

			FileInputStream fstream = new FileInputStream(
					"C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\tes.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			Boolean isValid = true;

		
			while ((strLine = br.readLine()) != null) {
				isValid = true;
				isValid = validate(strLine);

				if (isValid == false) {
					// fr.write(strLine+"\n");
				} else {
					System.out.println("Json is valid");
				}
			}
	

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean validate(String jsonstr) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			mapper.readTree(jsonstr);

			return true;
		} catch (IOException e) {
			System.out.println(jsonstr);
			return false;
		}
	}

}
