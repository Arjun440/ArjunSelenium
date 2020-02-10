package Encapsalation;

public class Encapsalation_Demo {

	private int empID;
	private String empName;
	private int empacnt;
	private int empage;
	
	public static void main(String[] args) {
		
		Encapsalation_Demo obj=new Encapsalation_Demo();
		
		obj.setEmpID(12345);
		obj.setEmpName("Arjun");
		obj.setEmpacnt(456738766);
		obj.setEmpage(27);
		
		System.out.println("Emp id is "+obj.getEmpID());
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpacnt() {
		return empacnt;
	}

	public void setEmpacnt(int empacnt) {
		this.empacnt = empacnt;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	
}
