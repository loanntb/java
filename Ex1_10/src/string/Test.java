package string;

import java.util.HashMap;

public class Test {

	public static void ReverseString(String str) {
		StringBuffer st = new StringBuffer();
		st.append(str);
		st = st.reverse();
		System.out.println(st);
	}

	public static void CountString(String str) {
		HashMap<String, Integer> conter = new HashMap<>();
		for (char c : str.toCharArray()) {
			String newstr = c + "";
			if (!conter.containsKey(str)) {
				conter.put(newstr, 1);
			} else {
				conter.put(newstr, conter.get(str) + 1);
			}
		}
		System.out.println(conter);
	}
}
