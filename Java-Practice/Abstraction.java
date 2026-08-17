package oops;

abstract class cars{
	abstract public void accelaration();
	
	public void carengine()
	{
	 System.out.println("Engine details");
	}
}
class kia extends cars{

	@Override
	public void accelaration() {
		System.out.println("Kia accelaration");
		
	}
	
}

class maruthi extends cars{

	@Override
	public void accelaration() {
		System.out.println("maruthi accelaration");
		
	}
	
}



public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		kia ob=new kia();
		ob.accelaration();
		ob.carengine();
		maruthi oj=new maruthi();
		oj.accelaration();
		oj.carengine();
		
		
		

	}

}
