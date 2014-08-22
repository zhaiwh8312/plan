package com.convenient.base.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReader {
	
	public static String readFile(String filePath) {
		File file = new File(filePath);
		
		InputStream in = null;
		try {
			in = new FileInputStream(file);
			
			int tempbyte;
			while((tempbyte=in.read()) != -1){
				System.out.write(tempbyte);
			}
			in.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		
		return "test";
	}
}
