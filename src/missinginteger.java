import java.io.IOException;
import java.util.*;

public class missinginteger {
public static void main(String args[])throws IOException{
	Scanner ip = new Scanner(System.in);
	int n = 0,i;
	
	System.out.println("Enter n");
	n=ip.nextInt();
	int a[] = new int[n];
	System.out.println("Enter array");
	for(i=0;i<n;i++) {
		a[i]=ip.nextInt();
		if(i!=0)
		for(int j=i;j>0;j--) {
			if(a[j]<a[j-1])
			{
				int fl=a[j];
				a[j]=a[j-1];
				a[j-1]=fl;
			}
		}
	}
	
	for(i=0;i<n-1;i++)
	{
		if((a[i]+1)!=a[i+1])
		{
			System.out.println(a[i]+1);
			i=i+1;
		}
	}
	

}
}
