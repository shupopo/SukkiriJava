package chap3;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> colors = new HashSet<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("blue");
		System.out.println(colors.size());
 	}

}
