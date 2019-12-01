package patterninJava;

import java.util.Scanner;

public class MainTest {

	private static Scanner input;

	public static void main(String[] args) {
		int n = 0,  m = 0;
		input = new Scanner(System.in);
		System.out.print("Please enter m: ");
		m = input.nextInt();
		System.out.print("Please enter n: ");
		n = input.nextInt();
		Test.printStars(n);
		Test.printStars1(n);
		Test.printStars2(m, n);
	}

}
