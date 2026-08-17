package packg6;

class Animal{
	public void animaldetails() {
		System.out.println("Animal");
	}
}

class Dog extends Animal{
	public void dogdetails() {
		System.out.println("dog");
	
}
}

class Cat extends Animal{
	public void catdetails() {
		System.out.println("cat");
	
}
}

public class Hierarchialinheritance {
	public static void main(String[] args) {
		
		Cat ob=new Cat();
		Dog oj=new Dog();
		ob.catdetails();
		ob.animaldetails();
		oj.dogdetails();
		oj.animaldetails();
	   

	}

}
