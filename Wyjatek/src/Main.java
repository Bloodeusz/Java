import java.io.*;


public class Main {
	public static void main(String[] args) throws Exception
	{
		try {
		      Main z = new Main();
		      z.wypisz(null);
		    } 
			catch (NullPointerException w)
			{
		    throw new Exception(w);
		    }

	}

	
	void wypisz(String s) {
	    System.out.println(s.length());
	  }

}
