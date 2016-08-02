package logicNum;

import java.util.Scanner;

public class concatword {

	public static void main(String[] args) {
		String str;
		String b=""; 
		System.out.println("enter a string");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		String[] input=str.split(" ");
		int str1[]=new int[input.length];
		int counter=0;
		for(int i=0;i<input.length;i++)
		{
			str1[i]=input[i].length();
			counter++;
		}
		System.out.println(counter);
		}
	


	}

