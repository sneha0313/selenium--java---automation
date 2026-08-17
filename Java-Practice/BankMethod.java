package oops;

import java.util.Scanner;

interface BankM{
	public void accountDetails();
	void balance();
	void withdraw();
	void deposit();
}
class Sbi implements BankM{
	int balance=100000;
	static String bankname="SBI";
	int withdraw;
	int deposit;
	int accountNo;
	Scanner sc=new Scanner(System.in);

	@Override
	public void accountDetails() {
		System.out.println("Enter your account number");
		accountNo=sc.nextInt();
		System.out.println("Your account details"+"\n"+accountNo+"\n"+bankname);
		
	}

	@Override
	public void balance() {
		System.out.println("Your current balance"+balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter amount for withdrawal");
		withdraw=sc.nextInt();
		balance=balance-withdraw;
		System.out.println("Your final balance"+balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter amount to deposit");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("Your final balance is"+balance);
			
		
	}
	
}


public class BankMethod {

	public static void main(String[] args) {
		Sbi ob=new Sbi();
		ob.accountDetails();
		ob.balance();
		ob.withdraw();
		ob.deposit();

	}

}
