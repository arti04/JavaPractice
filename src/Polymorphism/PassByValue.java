package Polymorphism;

import java.util.Arrays;

public class PassByValue {
	
	
	public static void main(String args[])
	{
		 String str[]= {"Arti","Goswami","Infy"};
		 String Arr="Arti";
		A test_a = new A();
		System.out.println(str);
		System.out.println(Arrays.toString(test_a.Modify(str)));
		System.out.println(str);
		System.out.println(Arrays.toString(test_a.Print(str)));
		//System.out.println(Arrays.toString(str));
		System.out.println(Arr);
		System.out.println(test_a.Modify(Arr));
		System.out.println(Arr);
		System.out.println(test_a.Print(Arr));
		System.out.println(Arr);
		int var =2;
		System.out.println(test_a.Modify(var));
		System.out.println(test_a.Print(var));
	}

}

class A{
	public String[] Modify(String[] a)
	{
		System.out.println(a);
		a[0]="Golu";
		System.out.println(a);
		return a;
		
				
	}
	
	public String[] Print(String[] c)
	{
		System.out.println(c);
		return c;
				
	}
	
	public String Modify(String a)
	{
		System.out.println(a);
		a="Golu";
		System.out.println(a);
		return a;
		
				
	}
	
	public String Print(String c)
	{
		System.out.println(c);
		return c;
				
	}
	public int Modify(int a)
	{
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		return a;
		
				
	}
	
	public int Print(int c)
	{
		System.out.println(c);
		return c;
				
	}
	
}
