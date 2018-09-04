import java.io.IOException;
import java.util.Scanner;

public class sentenceediting {
public static void main(String args[]){
	System.out.println("Enter String");
	Scanner ip=new Scanner(System.in);
	String str=ip.nextLine(),str1="";
    int len=str.length();
    
    for(int i=0;i<len-1;i++)
    {
    	if(str.charAt(i)==str.charAt(i+1)&& str.charAt(i)==' ') {
    		//System.out.print("Flagged");
    		//i++;
    	}
    		
    	else
    		str1+=str.charAt(i);
    	 //
    }
    str1+=str.charAt(len-1);
    String arr[]=str1.split(" ");
    System.out.println("Enter word to be deleted");
    String word=ip.nextLine();
    System.out.println("Enter position");
    Scanner inp=new Scanner(System.in);
    int pos=inp.nextInt();
    for(int i=pos-1;i<arr.length-1;i++)
    arr[i]=arr[i+1];
    str1="";
    for(int i=0;i<arr.length-1;i++)
    {
    	//System.out.println(arr[i]);
    	str1+=arr[i]+" ";
    }
    System.out.println(str1);
}

}
