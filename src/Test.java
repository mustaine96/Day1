import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	System.out.println("Enter String");
	Scanner ip=new Scanner(System.in);
	String str=ip.nextLine(),arr[]=str.split("\\s+");
	System.out.println(arr.length);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
}
}
