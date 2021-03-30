import java.io.*;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.Serializable;
import java.util.Arrays;

class Address implements Serializable{
	String a,b;
	String c[] = new String[10];
	
	Address( String a, String b, String c[])
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public String toString()
	{
		return (a.toString()+" "+b.toString()+" "+Arrays.toString(c));
	}
}

public class SerializableWriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Address testA;
		    try {
		    	 testA= new Address("Lets","See",new String[]{"what","is","the","result"});
		    	FileWriter myWriter = new FileWriter("testFile");
		    	String str="Files in Java might be tricky, but it is fun enough! string\n";
		        myWriter.write(str);
		        //myWriter.append(testA);
		        myWriter.close();
		        System.out.println("Successfully wrote to the file.");
		      } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		    FileOutputStream fos = null;
		    ObjectOutputStream out = null;
		    testA= new Address("Lets","See",new String[]{"what","is","the","result"});
			     try
			     {
			    	 fos = new FileOutputStream("testFile1");
			       out = new ObjectOutputStream(fos);
			       out.writeObject(testA);
			       out.close();
			     }
			     catch(IOException ex)
			     {
			       ex.printStackTrace();
			     }
		}
}

