package JavaProgrammes;

public class FinalizeConecept {

	public static void main(String[] args) {


		FinalizeConecept f1=new FinalizeConecept();

		FinalizeConecept f2=new FinalizeConecept();
		
		f1=null;
		f2=null;
		
		System.gc();
		


	}

}
