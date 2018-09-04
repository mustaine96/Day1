package Assignment1;

import java.util.Scanner;

public class armstrong {
public static void main(String args[]) {
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter number");
	int num=ip.nextInt(),fl=0, a=num;
	while(num!=0)
	{//System.out.println( fl);
		fl+=Math.pow((num%10),3);
		num=num/10;
	}
	if(fl==a)
	{
		System.out.println("Armstrong number");
	}
	else
		System.out.println("jnot Armstrong number"+ fl);
}
}
