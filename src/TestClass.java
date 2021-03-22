/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
import java.math.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {

        /*Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char[] names=name.toCharArray();
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        for(int i=0; i<name.length();i++){
        	count.put(names[i], count.getOrDefault(names[i],0)+1); }
        char c= ' ';
        int max = 0;
        Set<Character> b = count.keySet();
        Character[] a = new Character[b.size()];
        b.toArray(a);
        Arrays.sort(a); 
        for(char i : a ){
            if(count.get(i)>max){
                max = count.get(i);
                c = i;
            }
        }
   
        System.out.println(c+" "+max);
        
/*
        for(int i=0; i<name.length();i++){
            count.put(names[i], count.getOrDefault(names[i],0)+1);
        }

        char m = ' ';
        int max = 0;
        Set<Character> b = count.keySet();
        Character[] a = new Character[b.size()];
        b.toArray(a);
        Arrays.sort(a);

        for(char i : a){
            if(count.get(i)>max){
            	System.out.println(count.get(i));
            	
                max = count.get(i);
                m = i;
            }
        }
        Character x = m;
        System.out.println(x+" "+max);
        System.out.println(count);
s.close();
    	int housex=0,housey=0;
    	 Scanner s = new Scanner(System.in);
         int t_c = Integer.parseInt(s.nextLine()); 
         while(t_c>0)
         {
             int n = Integer.parseInt(s.nextLine()); 
             String arr[] = new String[n]; 
             for (int i=0; i<n;i++)
             {
            	 arr[i] = s.nextLine();
                 int  x =Integer.parseInt(arr[i].split(" ")[0]);
                 int  y =Integer.parseInt(arr[i].split(" ")[1]);
                 int  h =Integer.parseInt(arr[i].split(" ")[2]);
                 
                 if(Math.abs(x)>Math.abs(y))
                	 housex=housex+h;
                 else if(Math.abs(x)<Math.abs(y))
                	 housey=housex+h;
                	 
             }
             if(housex==housey)
            	 System.out.println("YES");
             else
            	 System.out.println("NO");
             t_c--
         }*/
    	
    	System.out.println(2^2);
    	System.out.println(2^4);
    	System.out.println(5^5);
    	System.out.println(2^6);
    }
}