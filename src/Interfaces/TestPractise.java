package Interfaces;
import java.util.Scanner;
public class TestPractise {
public static void main(String []args)
{
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	int  t=Integer.parseInt(str);
	int sum=0,n=0;
	int len=str.length();
	sum=t;
	while(t>0)
	{
		sum = sum +t%10;
		t=t/10;
		if(t>10)
		{
			sum=sum + t;
		}
		//ctr++;
	}
	while(n<len-2)
	{
	sum=sum+Integer.parseInt(str.substring(n));
	n++;
	}
	
	System.out.println(sum);
	
	
}
}
