package com.bptn.course.week4_instuctorLed._31_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("sample.txt");
			writer.write("This is a new file! \n");
			writer.write("Kyra is so cool!! <3 \n");
			System.out.println("File created");
			writer.close();
		} catch (IOException e) {
			System.out.println("Something went wrong when creating the file.");
			e.printStackTrace();
		}
	}

}
