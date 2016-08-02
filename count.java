package prime;

import java.util.Scanner;

public class count1 {

	public static void main(String[] args) {
		String a;
		System.out.println("Enter a line");
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		int counter = 0;
		for( int i=0; i<a.length(); i++ ) 
		      {
		        counter++;
		    } 

		  System.out.println(counter);

	}

}
