package Chap9;

import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("fw.txt",true);
		fw.write("Hello World!");
		fw.flush();
		fw.close();
		FileReader fr = new FileReader("fw.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
	}

}
