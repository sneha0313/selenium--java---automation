package packg6;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		Method1 ob=new Method1();
		ob.add();
		System.out.println(ob.sub());
		ob.mul(10,20);
		System.out.println(ob.div(20,10));
		
		

	}
	//method without returntye and without parameters

	public void add()
	{
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);
	}
	
	//method with returntype and without parameters

	public int sub()
	{
		int a=20,b=10,d;
		d=a-b;
		return (d);
	}
	
	//method without returntype and with parametres
	

	public void mul(int a,int b)
	{
		int d=a*b;
		System.out.println(d);
		
	}
	
	// method with returntype and with parameters
	public double div(int a,int b)
	{
		double d=a/b;
		return d;
		
		
	}
	
	
	
	

}
