package Assignment1;

import java.util.Scanner;

public class Marks {
public static void main(String args[]) {
	System.out.println("Enter marks");
	Scanner ip=new Scanner(System.in);
	float m1=ip.nextInt(), m2=ip.nextInt(), m3=ip.nextInt();
	if(m1>60 && m2>60 && m3>60)
	{
		System.out.println("Passed");
	}
	else if((m1>60 && m2>60) || (m1>60 && m3>60) || (m2>60 && m3>60))
		System.out.println("Promoted");
	else
		System.out.println("Failed");
}
}
