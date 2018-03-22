package Chap9;

import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("fw.txt",true);
		fw.write("Hello World!");
		fw.flush();
		fw.close();
	}

}
