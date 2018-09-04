import java.io.*;
import java.util.*;
public class listofnames {
public static void main(String srgs[])throws IOException{
	BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
	Scanner ip=new Scanner(System.in);
	String name[]= new String[31], nam;
	System.out.println("Enter name");
	nam=ip.nextLine();
	System.out.println("Enter size of array");
	int size=ip.nextInt(),fl=0,i;
	//System.out.println("Enter name array");
	
	System.out.println("Enter name array");
	for(i=0;i<size;i++)
	{
		//System.out.println("test");
		//name[i]=ip.nextLine();
		name[i]=p.readLine();
		System.out.println("name at "+i+ " " + name[i]);
		if(name[i].equals(nam)) {
			fl++;
		}
	}
	//System.out.println("name at "+i+ " " + name[i]);
	System.out.println("Frequency=  "+fl);
}
}
