package packg6;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		Method2 ob=new Method2();
		ob.triangle();
		System.out.println(ob.circle());
		ob.rectangle(10, 5);
		System.out.println(ob.square(5));
	}
	public void triangle()
	{
		 Scanner sc=new Scanner(System.in);
		   int b=sc.nextInt();
		   int h=sc.nextInt();
		   double area=0.5*b*h;
	
		   System.out.println(area);
		
	}
	public double circle()
	{
		Scanner sc=new Scanner(System.in);
		   int r=sc.nextInt();
		   double area=3.14*r*r;
		   return area;
	}
	
	public void rectangle(int l,int b)
	{
		int area=l*b;
		System.out.println(area);
	}
	
	public int square(int l)
	{
		int area=l*l;
		return area;
	}
	
	
	

}
