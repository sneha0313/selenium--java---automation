package pkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class ResponseCodePg {
	
	String link="https://www.facebook.com";
	
	@Test
	public void Response() {
		
	try {
	      URL u=new URL(link);
	        HttpURLConnection con=(HttpURLConnection)u.openConnection();	
	        int code=con.getResponseCode();
	        System.out.println(code);
	        if(code==200)
	        {
	        	System.out.println("Succesful");
	        }
	        else {
	        	System.out.println("Not Succesful");
	        }
	        
	}
	catch(Exception e)
	{
		
	}
	}

}
