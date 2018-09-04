import java.util.*;
import java.io.*;
public class ijkintegers {
public static void main(String args[])throws IOException{
	
	Scanner ip= new Scanner(System.in);
	int arr[]=new int[10],i;
	System.out.println("Enter Array");
	for(i=0;i<10;i++)
		arr[i]=ip.nextInt();
	System.out.println("Enter Number");
	int k=ip.nextInt();
	String pairs="";
	for(i=0;i<9;i++)
	{
		for(int j=i+1;j<=i+3&& j<10;j++)
		{
			if(arr[i]==arr[j])
				pairs=pairs + i + ',' +j+"  ";
		}
	}
	System.out.println(pairs);
}
}
