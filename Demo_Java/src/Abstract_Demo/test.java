package Abstract_Demo;

public class test extends Employee {

	public static void main(String[] args) {
		
		Employee em=new test();
		em.empdetails("Arjun", 12345);
		em.salary();
		em.address();
	}

	@Override
	public int salary() {
		
		System.out.println("employee salary ");
		return 0;
	}

	@Override
	public String address() {
		
		System.out.println("Employee adress ");
		return null;
	}

}
