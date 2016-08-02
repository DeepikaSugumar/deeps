package logicNum;

import java.util.Scanner;

public class concatword {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two numbers");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println("After Swapping");
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);
	}
		
	


	}