package arraysProgramA;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter item in array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Arraye Elment");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");
		}
		System.out.println("Arraye Reverse Elements");
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]+ " ");
		}
	}

}
