package Polymorphism;

public  class Compiletime_PM {
	
	 int multiply(int a , int b)
	{
		return a*b;
	}
	
	 int multiply(int a , int b, int c)
		{
		 System.out.println("Inside multiply int ");
			return a*b*c;
		}
	 
	 int multiply(double a , int b, int c)
		{
		 System.out.println("Inside multiply double");
			return (int)a*b*c;
		}
	public static void main(String []args)
	{
		Compiletime_PM X = new Compiletime_PM();
		System.out.println(X.multiply(5,4));
		System.out.println(X.multiply(5,4,10));
		double pi=3.14;
		System.out.println(X.multiply(pi,10,10));
	}

}
