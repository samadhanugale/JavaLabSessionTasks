package com.neosoft.sessiontasks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class S14_FileOperations {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); // Reads datathrough console
		System.out.print("Enter your name : ");
		String name = br1.readLine();
		System.out.println("Hi " + name);
		br1.close();

		// Read from file
		File file1 = new File("resources/sample.txt");
		File file2 = new File("resources/sample2.txt");
		BufferedReader br2 = new BufferedReader(new FileReader(file1)); // Reads datathrough console
		String line;

		while ((line = br2.readLine()) != null) {
			System.out.println(line);
			BufferedWriter br4 = new BufferedWriter(new FileWriter(file2, true)); // Append mode, if true removed
																					// rewrite mode
			br4.newLine();
			br4.write(line);
			br4.close();
		}
		br2.close();

		BufferedWriter br3 = new BufferedWriter(new FileWriter(file1, true)); // Append mode, if true removed rewrite
																				// mode
		br3.newLine();
		br3.write("SAMPLE JAVA TEXT WRITTEN BY BUFFER");
		br3.close();
	}
}
