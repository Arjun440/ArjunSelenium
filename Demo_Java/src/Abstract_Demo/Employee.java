package Abstract_Demo;

public abstract class Employee {
	
	
	private String Empname;
	private int Empid;
	private double salary;
	public void empdetails(String Empname, int Empid)
	{
		this.Empname=Empname;
		this.Empid =Empid;
		System.out.println(Empname);
		System.out.println(Empid);
	}
	
	public String getname()
	{
		return Empname;
	}
	
	public abstract int salary();
	
	public abstract String address();
}
