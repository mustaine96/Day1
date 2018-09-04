import java.util.Scanner;

public class price {
public static void main(String args[]) {
	Scanner ip= new Scanner(System.in);
	System.out.println("Enter cost");
	int newItem=ip.nextInt();
	int discount=(35*newItem)/100;
	int newItemprice =newItem-discount;
	
	System.out.println("New price is "+newItemprice);
}
}
