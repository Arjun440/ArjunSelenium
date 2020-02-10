package JavaProgrammes;

public class duplicateArrays {

	public static void main(String[] args) {

		//Find duplicate numbers in Arrays
		
		int arr[]= {1,2,2,4,5,5,6,8};
		
		System.out.println("Finnding the duplicate number");
		
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
