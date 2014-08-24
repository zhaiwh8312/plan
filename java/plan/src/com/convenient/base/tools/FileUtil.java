package com.convenient.base.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {
	
	private static FileReader fileReader;
	private static BufferedReader bufferReader;

	public static String readFile(String filePath) {
		File file = new File(filePath);
		
		StringBuffer sb = new StringBuffer();
		
		try {
			fileReader = new FileReader(file);
			bufferReader = new BufferedReader(fileReader);
			
			String line = "";
			while ((line = bufferReader.readLine()) != null) {
				sb.append(new String(line.getBytes(), "UTF-8"));
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return sb.toString();
	}
}
