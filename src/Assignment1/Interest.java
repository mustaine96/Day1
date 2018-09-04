package Assignment1;

import java.util.Scanner;

public class Interest {
public static void main(String args[]) {
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter principle, rate, and time");
	int pr=ip.nextInt(), rate=ip.nextInt(), time=ip.nextInt();
	
	float si=(pr*rate*time)/100;
	float ci=(float) (pr*Math.pow((1+ rate/100), time));
	System.out.println("Simple Interest= "+ si);
	System.out.println("Compund interest compunded yearly= "+ci);
	
}
}
