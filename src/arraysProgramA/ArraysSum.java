package arraysProgramA;

import java.util.Scanner;

public class ArraysSum {
	public static void main(String[] args) {
		int sum=0;
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your element");
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Arreay element");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
			sum=a[i]+sum;
			System.out.println(sum + " nn");
		}
		System.out.println(sum +" "+"addition of array");
	}

}
