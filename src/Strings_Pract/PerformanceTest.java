package Strings_Pract;

/*  */
public class PerformanceTest {
	
	
	public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Rocks");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Rocks");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis(); 
        
        String str = new String("Java");  
        for (int i=0; i<10000; i++){  
            str=str+"Rocks";  
        }  
        System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + "ms");  
        
	}  

}
