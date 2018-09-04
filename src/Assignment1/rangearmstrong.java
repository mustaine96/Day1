package Assignment1;

public class rangearmstrong {
public static void main(String args[]) {
	int a=0,fl=0,i=0;
	for(i=100;i<=999;i++)
	{   fl=0;
		a=i;
		while(a!=0) {
			fl+=Math.pow(a%10, 3);
			a/=10;
		}
		if(i==fl)
			System.out.println(i);
	}
}
}
