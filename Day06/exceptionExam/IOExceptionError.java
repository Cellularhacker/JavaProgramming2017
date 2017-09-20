//2017-09-20 KST IOExceptionError.java
package exceptionExam;

import java.io.*;

public class IOExceptionError {
	public static void main(String[] args) {
		FileReader file = new FileReader("a.txt");
		// If "a.txt" doesn't exist?
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char) i);
		}
		file.close();
	}
}