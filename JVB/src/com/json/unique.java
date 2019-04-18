package com.json;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

import org.json.*;

class unique {
	public static void main(String[] args) throws JSONException, IOException {
		FileInputStream fstream = new FileInputStream(
				"C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\tes.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream, "UTF-8"));
		// String str="{ \"name\": \"Alice\", \"age\": 20,\"duns\":\"403322258\"}";

		for (int i = 0; i <= 1; i++) {
		
			System.out.println(br.readLine());
			System.out.println("Total number of rows are: "+i);	
		}
			try
			{
			JSONObject obj = new JSONObject(br.readLine());
			System.out.println(obj);
			String n = obj.getString("duns");
			System.out.println("duns is " + n);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	finally {	
br.close();
	}
	}

}
