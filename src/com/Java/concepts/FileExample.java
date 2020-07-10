package com.Java.concepts;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File file;
		String mycontent = "This is my Data which needs to be written into the file";
		try {
			file = new File("C:\\newfile.txt");
			fos = new FileOutputStream(file);
			// FileInputStream to read the file
			fis = new FileInputStream(file);

			/*
			 * This logic will check whether the file exists or not. If the file
			 * is not found at the specified location it would create a new file
			 */
			if (!file.exists()) {
				file.createNewFile();
			}

			byte[] bytesArray = mycontent.getBytes();

			fos.write(bytesArray);
			fos.flush();
			System.out.println("File Written Successfully");

			/*
			 * Passed the FileInputStream to BufferedInputStream For Fast read
			 * using the buffer array.
			 */
			bis = new BufferedInputStream(fis);

			/*
			 * available() method of BufferedInputStream returns 0 when there
			 * are no more bytes present in the file to be read
			 */
			while (bis.available() > 0) {
				System.out.print((char) bis.read());
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("The specified file not found" + fnfe);
		} catch (IOException ioe) {
			System.out.println("I/O Exception: " + ioe);
		} finally {
			try {
				if (bis != null && fis != null && fos != null) {
					fis.close();
					fos.close();
					bis.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in close(): " + ioe);
			}
		}
	}
}
