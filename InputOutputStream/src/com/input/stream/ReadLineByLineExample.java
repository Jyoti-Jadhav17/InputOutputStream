package com.input.stream;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadLineByLineExample {
	  public static void main(String[] args) {
		try {
			
	FileInputStream fis = new FileInputStream("E:\\ReadCode.txt");
		 Scanner sc = new Scanner(fis);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			
		}
		sc.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
	}


