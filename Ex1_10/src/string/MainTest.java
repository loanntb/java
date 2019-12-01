package string;

import java.util.Scanner;

public class MainTest {

	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Enter string to reverse:");
		input = new Scanner(System.in);
		String str = input.nextLine();
		Test.ReverseString(str);
		Test.CountString(str);
	}

}
