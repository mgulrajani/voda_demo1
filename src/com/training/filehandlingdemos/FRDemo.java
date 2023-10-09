package com.training.filehandlingdemos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FRDemo {
	public static void main(String[] args) {
		
		//to read the char based data from the OS level file we use FileReader 
		
		
		char []arr = new char[200];
		
		try {
			FileReader reader =  new FileReader("output.txt");
			
			reader.read(arr);
			
			System.out.println("Reading data from the file");
			System.out.println(arr);
			
			reader.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
