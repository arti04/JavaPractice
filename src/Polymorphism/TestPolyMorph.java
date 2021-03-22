package Polymorphism;

import java.util.Arrays;

class P1{
	 static void method1()
	{
		System.out.println("P1 -Method 1");
	}
}
class P2 extends P1{
	static void method1()
	{
		System.out.println("P2 -Method 1");
	}
}

class ElpsisExample {
	
	 void method1(String name, String Lname, Object... a)
	{
		System.out.println(a.getClass().getSimpleName());
		System.out.println(Arrays.toString(a));
		System.out.println(a.toString());
		System.out.println(a);
	}
	 void method1(String name, String Lname, Long... a)
		{
			System.out.println(a.getClass().getSimpleName());
			System.out.println(Arrays.toString(a));
		}
	 /*
	 @Override
	 public String toString()
	 {
		return   "Custom return Statement";
	 }*/
}
public class TestPolyMorph  {
	
	
	public static void main (String[] args)
	{
		P1 p1 = new P1();
		P1 p2 = new P2();
		ElpsisExample exp = new ElpsisExample();
		exp.method1("Arti", "Goswami","Infy",77780,95);
		exp.method1("Arti", "Goswami",76,"Infy",77780);
		exp.method1("Arti", "Goswami",7475483758847586L);
		p1.method1();
		p2.method1();
		System.out.println(exp);
		
		
	}
	

}
