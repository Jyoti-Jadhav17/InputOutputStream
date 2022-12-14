package com.output.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;


public class WriteLineByLineCode {
 public static void main(String[] args) {
	 try {
		 
	 
	 FileWriter fw = new FileWriter("E:\\WriteCode.txt");
	 fw.write("velocity corporate 1 ");
	 fw.close();
	 }catch(Exception e) {
		 System.out.println(e);
		 System.out.println("success");
		
		 
	 }
}
}
