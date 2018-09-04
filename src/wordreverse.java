import java.util.*;
import java.io.*;
public class wordreverse {
public static void main(String args[])throws IOException
{
	BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
	String sent=ip.readLine();
	String words[]=sent.split(" ");
	String fin="";
	int i;
	for(i=0;i<words.length;i++)
	{
		String rev="";
		for(int j=words[i].length()-1;j>=0;j--)
		{
			rev=rev+words[i].charAt(j);
		}
		fin+=rev+" ";
	}
	System.out.println(fin);
}
}
