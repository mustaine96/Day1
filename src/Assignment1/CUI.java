package Assignment1;

import java.util.Scanner;

public class CUI {
 
	public static void main(String args[]) {
		 int fl=0;
		Scanner ip= new Scanner(System.in);
		String uid="vipagraw", pass="password";
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter uid");
			String u=ip.nextLine();
			System.out.println("Enter password");
			String p=ip.nextLine();
			if(u.equals(uid) && p.equals(pass)) {
				System.out.println("Welcome");
				break;
			}
			else
			{
				fl++;
			}
		}
		if(fl==3)
			System.out.println("Contact Admin");
	}
}
