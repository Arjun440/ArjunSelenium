package Programmes;

import java.util.Scanner;

public class Swapinteger {

	public static void main(String[] args) {
		
		System.out.println("Enter the values of a and b");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("before swapping :" +a+"   "+b);
	/*swapping*/
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping :" +a+"   "+b);
		
		

	}

}
