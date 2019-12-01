package patterninJava;

public class Test {
	// smiple
	public static void printStars(int n) {
		int i, j;

		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// 180

	public static void printStars1(int n) {
		int i, j;

		for (i = 0; i < n; i++) {
			for (j = 2 * (n - 1); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// Symmetrical triangle
	public static void printStars2(int m, int n) {
		int i, j;
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || i == m - 1 || j == n - 1) {
					System.out.println(" 0 ");
				} else {
					System.out.println(" ");
				}
			}
			System.out.println("");
		}
	}
}
