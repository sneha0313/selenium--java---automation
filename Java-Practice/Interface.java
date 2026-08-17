package oops;

interface Cardetails{
	public void accelaration();//abstract method
	public void speedlimit();//abstract method
	public void torque();//abstract method
}

class bmw implements Cardetails{

	@Override
	public void accelaration() {
		System.out.println("Benz A");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("Benz S");
		
		
	}

	@Override
	public void torque() {
		System.out.println("Benz T");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		bmw ob=new bmw();
		ob.accelaration();
		ob.speedlimit();
		ob.torque();
		
		
		

	}

}
