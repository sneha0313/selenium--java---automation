package oops;

class Parent{
	public void job() {
		System.out.println("Engineer");
	}
	public void phone() {
		System.out.println("Samsung");
	}
}
class Child extends Parent{
	public void job() {
		System.out.println("Doctor");
		/*
		super.job();
		*/
	}
	public void phone() {
		System.out.println("Nothing");
		super.phone();
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.job();
		ob.phone();
		//access modifiers prgrm
		/*
		AccessModifiers oj=new AccessModifiers();
		oj.b=13;
		oj.c=15;
		*///
		

	}

}
