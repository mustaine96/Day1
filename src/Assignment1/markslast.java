package Assignment1;

import java.util.Scanner;

public class markslast {
public static void main(String args[]) {
	Scanner ip=new Scanner(System.in);
	float s1[]=new float[3], s2[]=new float[3] ,s3[]=new float[3];
	System.out.println("Enter s1 marks");
	for(int i=0;i<3;i++)
	{
		s1[i]=ip.nextFloat();
	}
	System.out.println("Enter s2 marks");
	for(int i=0;i<3;i++)
	{
		s2[i]=ip.nextFloat();
	}
	System.out.println("Enter s3 marks");
	for(int i=0;i<3;i++)
	{
		s3[i]=ip.nextFloat();
	}
	
	System.out.println("Total of subject 1"+(s1[0]+s2[0]+s3[0]));
	System.out.println("Total of subject 2"+(s1[1]+s2[1]+s3[1]));
	System.out.println("Total of subject 3"+(s1[2]+s2[2]+s3[2]));
	System.out.println("Avg of subject 1"+(s1[0]+s2[0]+s3[0])/3);
	System.out.println("Avg of subject 2"+(s1[1]+s2[1]+s3[1])/3);
	System.out.println("Avg of subject 3"+(s1[2]+s2[2]+s3[2])/3);
	
}
}
