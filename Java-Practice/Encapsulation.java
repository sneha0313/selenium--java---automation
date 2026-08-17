package oops;

class Emplyee{
	private String Empnmae;
	private String Empdesgn;
	private int empid;
	//right click/source/set setters and getters
	public String getEmpnmae() {
		return Empnmae;
	}
	public void setEmpnmae(String empnmae) {
		Empnmae = empnmae;
	}
	public String getEmpdesgn() {
		return Empdesgn;
	}
	public void setEmpdesgn(String empdesgn) {
		Empdesgn = empdesgn;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Emplyee ob=new Emplyee();
		ob.setEmpnmae("Sneha");
		ob.setEmpid(01);
		ob.setEmpdesgn("Test Engineer");
		System.out.println(ob.getEmpid());
		System.out.println(ob.getEmpnmae());
		System.out.println(ob.getEmpdesgn());
		
		

	}

}
