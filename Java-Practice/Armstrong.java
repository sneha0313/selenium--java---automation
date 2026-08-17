package packg3;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int num=n;
		int sum=0;
		int digit;
		while(n!=0)
		{
			digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		if(sum==num)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
		
		

	}

}
