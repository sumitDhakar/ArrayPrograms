package arraysProgramA;

import java.util.Arrays;

public class ComparisonArray {
	public static void main(String[] args) {

		int a[] = { 10, 23, 24, 56, 65, 55 };
		int b[] = { 10, 23, 24, 56, 65, 55 };
		if (Arrays.equals(a, b)) {
			System.out.println("Both are Equals");
		} else {
			System.out.println("Both are not Equals");
		}
	}
}
