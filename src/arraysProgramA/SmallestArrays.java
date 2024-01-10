package arraysProgramA;

import java.util.Scanner;

public class SmallestArrays {
	public static void main(String[] args) {
		int a[]=new int[5];
		int min;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Eneter you element");
		for(int i=0;i<a.length;i++) {
			a[i]=scanner.nextInt();
		}
		min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("smallest Element "+min);
		}

}
