package oops;

interface TVRemote{
	public void button();
	public void number();
}
interface smartTVRemote extends TVRemote
{
	public void voice();
	}
class TV implements smartTVRemote{

	@Override
	public void button() {
		System.out.println("Button");
		
	}

	@Override
	public void number() {
		System.out.println("Number");
		
	}

	@Override
	public void voice() {
		System.out.println("Voice");
		
		
	}
	
}
public class Interfaceeg {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.button();
		ob.number();
		ob.voice();
		
		

	}

}
