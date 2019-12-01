package number;

import java.util.Scanner;

public class MainTest {
	private static Scanner input;

	public static void main(String[] args) {
		int n = 0;
		input = new Scanner(System.in);
		boolean check = false;
		while (!check) {
			try {
				System.out.print("Please enter n: ");
				n = input.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("You entered the wrong data type!N must be a positive number ");
				input.nextLine();
			}
			sum.SumNumber(n);
		}

	}

}
