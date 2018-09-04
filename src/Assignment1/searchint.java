package Assignment1;

import java.util.Scanner;

public class searchint {
public static void main(String args[]) {
	Scanner ip=new Scanner(System.in);
	int a[]=new int[15];
	System.out.println("Enter array");
	for(int i=0;i<15;i++)
		a[i]=ip.nextInt();
	System.out.println("Enter number");
	int num=ip.nextInt();
	for(int i=0;i<15;i++)
		if(a[i]==num)
			System.out.println((i+1));
}
}
