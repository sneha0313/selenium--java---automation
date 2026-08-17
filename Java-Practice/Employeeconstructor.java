package packg6;

public class Employeeconstructor {
	
	int empid;
	String empname;
	
	public Employeeconstructor(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
	}
	
	

	public static void main(String[] args) {
		
		Employeeconstructor emp=new Employeeconstructor(10,"Sneha");
		System.out.println(emp.empid);
		System.out.println(emp.empname);
		emp.display();
	

	}
	

}
