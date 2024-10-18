package com.bptn.course.week4_instuctorLed._31_file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FIleUpdateDemo {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("sample.txt", true);
			writer.write("This is a new line! \n");
			writer.write("Kyra is extra cool!! <3 \n");
			System.out.println("File updated");
			writer.close();
		} catch (IOException e) {
			System.out.println("Something went wrong when creating the file.");
			e.printStackTrace();
		}

	}

}
