package Programmes;

public class SwapString {

	public static void main(String[] args) {


		String a="Tom";
		String b="Jerry";
		
		System.out.println("String before swap"+a +"String before swap "+b);
		//Append the two strings
		a =a+b;
		
		//Store intial String a in String b 
		b=a.substring(0, a.length()-b.length());
		
		//Store intial string b in string a
		
		a=b.substring(b.length());
		
		System.out.println("String after swap :"+ a +"String after swap :" +b);		

	}

}
