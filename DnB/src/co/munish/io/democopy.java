package co.munish.io;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class democopy {

	public static void main(String[] args) {
		File in_fil = new File("C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\tes.txt");
		System.out.println(in_fil.exists());
		FileInputStream fsin = null;
		FileOutputStream fsout = null;
		try {
			fsin = new FileInputStream(in_fil);
			fsout = new FileOutputStream("C:\\Users\\C58810\\ECD\\DnB\\Data\\initial_load_2019_20000\\20000\\tes1.txt");
			int content;
			while ((content = fsin.read()) != -1) {

				System.out.println(content);
				fsout.write(content);

			}
			System.out.println(content);
			System.out.println("File copied successfully");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		try {
			fsin.close();
			fsout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
