package packg6;

class Car{
	public void display()
	{
		System.out.println("Parent");
	}
}
class Bmw extends Car{
	public void bmwdetails()
	{
		System.out.println("Child");
	
	}

}
public class Singleinheritance {

	public static void main(String[] args) {
	 Bmw ob=new Bmw();
	 ob.bmwdetails();
	 ob.display();

	}

}
