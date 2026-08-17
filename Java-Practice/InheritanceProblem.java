package oops;

class Person{
	String name;
	int age;
	int phonenumber;
	String address;
	int sal;
	public void printmethod()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Phonenumber="+phonenumber);
		System.out.println("Address="+address);
		System.out.println("Salary="+sal);
	}
}

class Employee extends Person{
	String department;
}

class Manager extends Person{
	String specialization;
}


public class InheritanceProblem {

	public static void main(String[] args) {
		Employee el=new Employee();
		el.name="Leeza";
		el.age=22;
		el.phonenumber=8907549;
		el.address="Karikattuparambil";
		el.sal=35000;
		System.out.println(el.department="Data scientist");
		el.printmethod();
		

	}

}
