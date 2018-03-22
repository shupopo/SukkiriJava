package Chap9;

import java.util.Scanner;

public class CalcMercari {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		double result = (input + 900) / 0.9;
		System.out.println((int)result);
	}

}
