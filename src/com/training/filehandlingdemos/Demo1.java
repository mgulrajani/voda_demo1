package com.training.filehandlingdemos;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		
		File file = new File("d:\\mkg\\data.txt");
		
		try {
			
			boolean val = file.createNewFile();

			if(val) {
				System.out.println("File got created");
			}
			else {
				System.out.println("fIle already exists");
			}
			
			System.out.println(file.getAbsolutePath());
			System.out.println(file.exists());
			System.out.println(file.canRead());
			System.out.println(file.getTotalSpace());
			
			file.delete();
			if(!file.exists()) {
				System.out.println("file not there");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
