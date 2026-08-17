package  oops;

import java.util.Scanner;

public class number_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		int pos=0,neg=0,zero=0;
		int []arr=new int[10];
		for (int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			if(arr[i]<0)
			{
				neg++;
			}
			else if(arr[i]>0)
			{
				pos++;
			}
			else
			{
				zero++;
			}
		}
		System.out.println("Negative: "+neg);
		System.out.println("Postive: "+pos);
		System.out.println("Zeroes: "+zero);
		
		
	}

}