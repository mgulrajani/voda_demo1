package com.training.filehandlingdemos;

import java.io.FileWriter;
import java.io.IOException;

public class FWDemo {
	public static void main(String[] args) {
		
		String data =  "this file belongs to Harry";
		
		try {
			FileWriter writer=new FileWriter("output.txt");
			
			writer.write(data);
					
		    System.out.println("wrote the data on the file output.txt ");
			
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
