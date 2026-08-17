package oops;

public class MethodOverloading {

	public static void main(String[] args) {

		
				MethodOverloading ob=new MethodOverloading();
				ob.add();
				ob.add(8, 9);
				ob.add(2,6.3);
				ob.add(4.5, 8);
			}
			public void add() {
				int a=3,b=9,c;
				c=a+b;
				System.out.println("Sum1: "+c);
			}
			public void add(int a,int b) {
				int c=a+b;
				System.out.println("Sum2: "+c);
			}
			public void add(int a,double b) {
				double c=a+b;
				System.out.println("Sum3: "+c);
			}
			public void add(double a,int b) {
				double c=a+b;
				System.out.println("Sum4: "+c);
			}
		

	}


