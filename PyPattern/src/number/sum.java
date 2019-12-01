package number;

public class sum {

	public static int SumNumber(int n) {
		int i, sum = 0;
		for (i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		return sum;
		
	}

}
