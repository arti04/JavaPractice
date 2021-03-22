import java.util.*;
public class Tester_HackerEarth {

	    public static void main(String args[] ) throws Exception {
	      
	      Scanner s = new Scanner(System.in);
			int t = Integer.parseInt(s.nextLine()); 
			while(s.hasNextLine())
			{
			 List<String> Arr = new ArrayList<String>();// Reading input from STDIN
			 Arr= Arrays.asList(s.nextLine().split(" "));//Arrays.asList(
		   
		    Collections.sort(Arr, new Comparator<String>() {
		    	@Override
		    	public int compare(String a, String b)
		    	{
		    		if(a.length()< b.length())
		    			return -1;
		    		else if(b.length()< a.length())
		    			return 1;
		    		else
		    			return 0;
		    					
		    	}
		    });
	        
		     for (String str : Arr)
		      { 		      
		           System.out.print(str+" "); 		
		      }
	          System.out.println();
		    t--;
	}
	        // Writing output to STDOUT

	        

	    
	    }
}
