package exceptions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class uncheckedexpection {
	public static void main(String[] args) {
		//Arithmatic Exception
//		int a=-10,d=15,f=0;
//		int h,i;
//		System.out.println(a);
//		i=a/f;System.out.println(i);
//		h=f/d;System.out.println(h);
		//String out of Bounds Exception
//		String string="Malls & Theatres";
//		System.out.println(string.charAt(6));
//		System.out.println(string.charAt(22));
//		System.out.println(string.substring(22, 30));
		//ArrayIndex Out of Bounds Exception
//		String a[]=new String [5];
//		a[0]="hi";a[2]="hello";a[3]="welcome";
//		int a[]=new int [5];
//		a[0]=5;a[1]=15;a[2]=25;a[3]=35;
//		System.out.println(a[6]);
		//Index out of Bounds Exception
//		List <String> list=new LinkedList<>();
//		list.add("hi");list.add("hello");list.add("welcome");
//		System.out.println(list.get(2));
//		System.out.println(list.get(5));
		//Input Mismatch Exception
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter value");
//		int value = scan.nextInt();
//		System.out.println(value);
		//Null Pointer Exception
//		String s=null;
//		int stringlength = s.length();
//		System.out.println(stringlength);
		//NumberFormat Exception
		String s="110008562225";
		int int1 = Integer.parseInt(s);
		System.out.println(int1);
		}

}


