package Assignment1;

import java.util.Scanner;

public class Taxes {
public static void main(String args[]) {
	System.out.println("Enter salary");
	Scanner ip= new Scanner(System.in);
	float salary=ip.nextFloat();
	if(salary<180000)
		System.out.println("no tax");
	else if(181001<salary && salary<300000)
		System.out.println(salary*10/100);
	else if(300001<salary && salary<500000)
		System.out.println(salary*20/100);
	else if(500001<salary && salary<1000000)
		System.out.println(salary*30/100);
}
}
