package arraysProgramA;

import java.util.Scanner;

public class SearrchElement {
	public static void main(String[] args) {
		int a[]=new int[5];
		int n;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter element");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("array Elements");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("Serch Element");
n=s.nextInt();
for(int i=0;i<a.length;i++) {
	if(a[i]==n) {
		count++;
	}
}
if(count>0)
	System.out.println( count+" Item Found");
	
else
	System.out.println("Not found");}

}
