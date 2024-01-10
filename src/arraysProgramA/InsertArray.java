package arraysProgramA;

import java.util.Scanner;

public class InsertArray {
	public static void main(String[] args) {
	
		int size,loc,item,j;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size:");
		size=scanner.nextInt();
		int a[]=new int [size+1];
		System.out.println("Eneter you element");
		for(int i=0;i<size;i++) {
			a[i]=scanner.nextInt();
		}
	System.out.println("Enter Array location");
	loc=scanner.nextInt();
	System.out.println("Enter new item");
	item=scanner.nextInt();
	
	for( j=size;j>loc;j--) {
		a[j]=a[j-1];
	}a[loc]=item;
	size++;
	for(int i=0;i<size;i++) {
		System.out.println(a[i]+" ");
	}
	
	
	}

}
