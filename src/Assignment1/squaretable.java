package Assignment1;
import java.lang.Math;
import java.util.Scanner;
public class squaretable {
public static void main(String args[]) {
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter number");
	int num=ip.nextInt();
	System.out.println(num+"*1 =" + num +", Square:"+ Math.pow(num, 2));
	
}
}
