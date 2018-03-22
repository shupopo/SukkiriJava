package Chap9;

import java.io.FileInputStream;
import java.io.IOException;

public class problem1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fw.txt");
		fis.close();
	}

}
