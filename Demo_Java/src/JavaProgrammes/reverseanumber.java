package JavaProgrammes;

import java.util.Scanner;

public class reverseanumber {

	public static void main(String[] args) {
	
		
		//Reverse a number 
		
		int num =0;
		int reversenum=0;
		
		System.out.println("Input your number : ");
		//This statement will catch the user input
		Scanner sc=new Scanner(System.in);
		
		//Captured input would  be stores in number num
		num=sc.nextInt();
		
		// != is not equal - returns true of left hand side is not equal to right hand side 
		
		while (num !=0) {
			
			reversenum= reversenum*10;
			reversenum=reversenum +num%10;
			num=num/10;
		}
		System.out.println("Reverse of input numner is "+reversenum);
		
		
	}

}
