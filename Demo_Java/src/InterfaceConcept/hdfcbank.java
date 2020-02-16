package InterfaceConcept;

public class hdfcbank implements RBI,USBank{

	@Override
	public void deposite() {
		
		System.out.println("This is for deposite");
		
	}
	public void lockersystem() {
		
		System.out.println("This is used for the lockersystem");
		
	}

	public void transfer() {

		System.out.println("This is for transfer");
		
	}

	

	public void netbanking()
	{
		System.out.println("This is use for the netbanking services");
	}
	@Override
	public void mobilebanking() {

		System.out.println("This is used for mobile banking");
		
	}
	@Override
	public void loan() {
		
		System.out.println("This is used for loan");
		
	}
	
	

}
