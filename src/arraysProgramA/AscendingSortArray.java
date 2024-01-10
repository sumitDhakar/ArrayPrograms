package arraysProgramA;

import java.util.Scanner;

public class AscendingSortArray {
	public static void main(String[] args) {
		int a[] = new int[5];
		int t;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your element");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
	}

}
