package ArraysDemo;

public class ArrayDemo3 {

	public static void main(String[] args) {

		String Student_Name[]=new String[5];

		Student_Name[0]="Yeshu";
		Student_Name[1]="Arjun";
		Student_Name[2]="Adrian";
		Student_Name[3]="Chintan";
		Student_Name[4]="Javeed";
		
		int sizeofarray=Student_Name.length;
		
		for(int i=0;i<sizeofarray;i++)
			
		{
			System.out.println("Name of the Students "+Student_Name[i]);
		}
				
				
			
				
	}

}
