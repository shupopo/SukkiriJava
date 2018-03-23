package chap10;

import java.io.*;
import java.util.Properties;

public class problem1 {

	public static void main(String[] args) throws Exception {
		Reader fr = new FileReader("pref.properties");
		Properties p = new Properties();
		p.load(fr);
		String tokyoFood = p.getProperty("tokyo.food");
		System.out.println(tokyoFood);
		fr.close();
	}

}
