package arraysProgramA;

import java.util.Scanner;

public class AverageArrayElement {
	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0;
		double avrg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("Arraye Element");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			sum=a[i]+sum;
			
		}
		avrg=sum/a.length;
		System.out.println(sum +" "+ avrg);
		
	
	}

}
