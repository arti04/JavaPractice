package Tester;
import java.util.*;
import java.math.*;
public class TestCode {
	

	public static void main(String []args) { 
	    //Implement your logic here and change the return statement accordingly
		/*Scanner s = new Scanner(System.in);
		int t = Integer.parseInt(s.nextLine()); 
	String st= new String();*/
	
	//System.out.println(st.substring(1));
	//System.out.println(st.substring(0,1).equals("A"));
	
		System.out.println(convertStringToInt("45321",4));
	  }
	
	public static int convertStringToInt(String input, int i){
		// Write your code here
        
int x =  Integer.parseInt(input.substring(0,1));
        //System.out.println(x);
if (input.length()==1)
    return x;
  else 
  {
	  int iter =(int) Math.pow(10,i);
      //System.out.println(convertStringToInt(input.substring(1)));
      x = (x)*iter+convertStringToInt(input.substring(1),i-1);
      
      int y=find(2,3);

      return x;
      
  }


        
	}
	
	public int find(int a, int b)
	{
		for(int xi =b; xi<=1; xi--)
		{
			a=a*10;
			 System.out.println(a);
		}
	      System.out.println(a);
		return a;
	}
}
