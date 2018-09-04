package Assignment1;

import java.util.Scanner;

public class bubblesort {
public static void main(String args[]) {
	Scanner ip=new Scanner(System.in);
	int a[]=new int[15];
	System.out.println("Enter array");
	for(int i=0;i<15;i++)
		a[i]=ip.nextInt();
	for(int i=0;i<14;i++)
		for(int j=0;j<14-i;j++)
			if(a[j]>a[j+1]) {
				int fl=a[j];
				a[j]=a[j+1];
				a[j+1]=fl;
				
			}
				
	for(int i=0;i<15;i++)
		System.out.println(a[i]);
}
}
