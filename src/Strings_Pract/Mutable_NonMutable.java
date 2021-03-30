package Strings_Pract;

import java.util.Arrays;

public class Mutable_NonMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Java";//1
		String s= "Java";
		System.out.println(s1==s);
		String s2 = new String ("Java");//2
		System.out.println(s1==s2);
		StringBuilder s3 = new StringBuilder("Java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.concat("World"));
		System.out.println(s2.concat("World"));
		System.out.println(s3.append("World"));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s1 =s1+"World";
		s=s+"World";
		s2 =s2+"World";
		//s3=s3+"World"; Wont work, append to be used to convert String to Stringbuffer
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s3);
		System.out.println(s2);
		System.out.println(s3.equals(s2));
		

		
		
		

	}

}
