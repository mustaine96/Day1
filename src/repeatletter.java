import java.io.IOException;
import java.util.Scanner;

public class repeatletter {
public static void main(String args[])throws IOException{
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter string");
	String str=ip.nextLine(),str1="";
	int len=str.length();
	String letter[]= str.split("");
	
	for(int i=0;i<len;i++)
	{
		for(int j=i;j<len;j++)
		{
			if(letter[i].equals(letter[j]))
			{
				for(int k=j+1;k<len;k++)
				{
					letter[k-1]=letter[k];
					
				}
				len--;
			}
		}
	}
	
	System.out.println("Output is");
	for(int i=0;i<len;i++)
		str1+=letter[i];
		System.out.println(str1);
}
}
