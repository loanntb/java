package array;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row, col;
		do {
		    System.out.print("Please enter dimension which is a positive number: ");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next(); 
		    }
		    row  = input.nextInt();
		} while (row <= 0);
		do {
		    System.out.print("Please enter dimension which a positive number: ");
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next(); 
		    }
		    col = input.nextInt();
		} while (col <= 0);
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Enter value for element [" + i + ", " + j + "]: ");
				arr[i][j] = input.nextInt();
			}
		}

		System.out.println("print array: ");
		Relace.RelaceArray(arr, row, col);
		
	}

}
