package array;

public class Relace {
	public static void RelaceArray(int[][] arr, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}

	}

}
