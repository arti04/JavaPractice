package Interfaces;

public class Cars implements Vehicles {
	
	/* public void Wheels()
	{
		System.out.println("Cars");
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vars=9;
	Cars V1 =new Cars();
	System.out.println(vars);
	V1.Wheels();
	V1.print();
	

	}
	
	public void print()
	{
		System.out.println(vars);
	}

}




