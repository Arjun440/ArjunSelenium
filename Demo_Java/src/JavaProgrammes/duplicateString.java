package JavaProgrammes;

public class duplicateString {

	public static void main(String[] args) {

		//Find duplicate numbers in Arrays
		
		String arr[]= {"Tom","Jerry","Jerry","MaX"};
		
		System.out.println("Finding the duplicate number");
		
		int length=arr.length;
		
		for (int i = 0; i < length; i++) {
			
			for (int j = i+1; j<length; j++) {
				
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
				
			}
			
		}
		
		
	}

}
