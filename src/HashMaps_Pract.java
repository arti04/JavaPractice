import java.util.*;
public class HashMaps_Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()); 
        int f = Integer.parseInt(s.nextLine()); 
		Map<String, Integer> fan = new HashMap<String, Integer>();
		//ArrayList<Integer> arr=new ArrayList();
		
		 //int max =0;
	        for (int i=0; i<n;i++)
	        {
	        	//arr.add(Integer.parseInt(s.next()));
	          fan.put(s.next(), Integer.parseInt(s.next())) ;
	        }
	        List<Map.Entry<String, Integer> > list = 
	                new LinkedList<Map.Entry<String, Integer> >(fan.entrySet()); 
	   
	 
	        /*//arr.addAll(fan.keySet().toArray());
	        Collections.sort( arr, new Comparator<Integer>() { 
	        	@Override
	            public int compare(Integer o1,  
                        Integer o2) 
     { 
	        		if(o1>o2)
	        			return -1;
	        		else if(o1<o2)
	        			return 1;
	        		else
	        			return 1;
	        		 //return ((Comparable) ((Map.Entry) (o1)).getValue()+(Map.Entry) (o1)).getValue())
	                     //    .compareTo(((Map.Entry) (o2)).getValue());
     } 
 }); */
	        
	     
        /*String arr[] = new String[n]; 
        
        int max =0;
        for (int i=0; i<n;i++)
        {
            arr[i] = s.nextLine(); 
        }
        System.out.println("hi");
        //Arrays.sort(arr);
        for (int i=0; i<n;i++)
        {
        	for (int j=i; j<n;j++)
            {
        		if(Integer.parseInt(arr[i].split(" ")[1])>max)
        			max=Integer.parseInt(arr[i].split(" ")[1]);
        	
            }
        	if(n>0)
        	{
        		n--;
        		System.out.println(arr[i].split(" ")[0]);
        	}
        }*/
        
        
	}

}
