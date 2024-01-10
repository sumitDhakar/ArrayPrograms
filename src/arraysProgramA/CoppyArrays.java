package arraysProgramA;

import java.util.Scanner;

public class CoppyArrays {

	public static void main(String[] args) {
		int a[]= new int[5];
		int b[]=new int [10];
		//int c[]=new int [15];
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter you elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Fist arrye Element");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("second arrye Element");
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
	}
}
