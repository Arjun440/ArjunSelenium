package PolymorphismDemo;

public class Student {
	
	public Student(String name, int age)
	{
		System.out.println(name +" "+age);
	}

	public Student(String name, int age, double marks)
	{
	System.out.println(name +" "+age+"  "+marks);
	}
	
	public static void main(String[] args) {
		
		Student obj=new Student("Tom", 15);
		Student obj1=new Student("Jerry", 26, 45.45);
	}

}
