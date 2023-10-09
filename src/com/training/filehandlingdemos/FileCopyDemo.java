package com.training.filehandlingdemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
	
	public static void main(String[] args) {
		
		//read the sun.jpg using FileInputStream
		
		//write on to a file which is linked to FileOutputStream
		//Streams can be source   -- InputStream  --if you are taking the input from the stream , they are input streams , they are source, reading from them
		//Streams can be destination   ---OutputStream
		try {
			
			FileInputStream fis  = new FileInputStream("d:\\mkg\\sun.jpg");
			FileOutputStream fos =  new FileOutputStream("d:\\mkg\\copysun.jpg");
			
			int i=0;
			
			while((i=fis.read())!=-1) {
				
				fos.write(i);
			}
			
			System.out.println("copied sun");
			fis.close();
			fos.close();
			
			
		}
		catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
