package packg6;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		vowels obj=new vowels();
		System.out.println(obj.count_vowels(st));
		
	
	}
	public int count_vowels(String st) {
		int count=0;
		for(char el:st.toCharArray()) {
			if(el=='a'||el=='e'||el=='i'||el=='o'||el=='u')
			{
				count++;
			}
		}
		return count;
	}

}
