package ArraysDemo;

public class Arraydemo2 {

	public static void main(String[] args) {
		
		int student_ID[]=new int[5];
		
		student_ID[0]=(int) 100.99;
		student_ID[1]=200;
		student_ID[2]=300;
		student_ID[3]=400;
		student_ID[4]=500;
		
		//Type Limitation
		
		int sizeofarray=student_ID.length;
		
		System.out.println(sizeofarray);
		
		for(int i=0;i<sizeofarray;i++)
		{
			System.out.println("Student id numbers "+student_ID[i]);
		}
		
	}

}
