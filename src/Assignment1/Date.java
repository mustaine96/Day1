package Assignment1;

import java.util.Scanner;

public class Date {
public static void main(String args[]) {
	System.out.println("Enter Date in mm,dd,yy");
	Scanner ip= new Scanner(System.in);
	String date=ip.nextLine();
	String month=null;
	String da[]=date.split(",");
	switch(da[1]) {
	case "01": 
	{System.out.println(da[0]+"/January/"+da[2]);
		
	          break;}
	case "02": {System.out.println(da[0]+"/February/"+da[2]);
	break;}
	case "03": {System.out.println(da[0]+"/March/"+da[2]);
	break;}
	case "04": {System.out.println(da[0]+"/April/"+da[2]);
	break;}
	case "05": {System.out.println(da[0]+"/May/"+da[2]);
	break;}
	case "06": {System.out.println(da[0]+"/june/"+da[2]);
	break;}
	case "07": {System.out.println(da[0]+"/July/"+da[2]);
	break;}
	case "08": {System.out.println(da[0]+"/August/"+da[2]);
	break;}
	case "09": {System.out.println(da[0]+"/September/"+da[2]);
	break;}
	case "10": {System.out.println(da[0]+"/October/"+da[2]);
	break;}
	case "11": {System.out.println(da[0]+"/November/"+da[2]);
	break;}
	case "12": {System.out.println(da[0]+"/December/"+da[2]);
	break;}
	
	
	
	}
	}
}

