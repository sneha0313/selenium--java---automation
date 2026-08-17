package packg6;

class Birds{
	public void birdsdetails()
	{
		System.out.println("Parent");
	}
}
class Hen extends Birds{
	public void hendetails()
	{
		System.out.println("Parent and child");
	}
}

class Chicken extends Hen{
	public void chickendetails()
	{
		System.out.println("child");
	}
}



public class MultilevelInheritance {

	public static void main(String[] args) {
		Chicken ob=new Chicken();
		ob.chickendetails();
		ob.hendetails();
		ob.birdsdetails();
	

	}

}
