package arraysProgramA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PerDfindMathad {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ente your number");
		for(int i=0;i<a.length;i++) {
			a[i]=scanner.nextInt();
		}
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]+" ");
//		}
		System.out.println("Ente your number Array2");
		for(int i=0;i<b.length;i++) {
			b[i]=scanner.nextInt();
		}
	boolean c=	Arrays.equals(a, b);
	System.out.println(" kya Dono array Equal hai"+":"+c);
	}
}
