package ArraysDemo;

public class Arraydemo4 {

	public static void main(String[] args) {
		
		int Student[][]=new int[2][2];
		
		Student[0][0]=30;
		Student[0][1]=40;
		Student[1][0]=50;
		Student[1][1]=60;
		
		//Limitation of size
		
		System.out.println("Students in class  "+Student[1][1]);

	}

}
