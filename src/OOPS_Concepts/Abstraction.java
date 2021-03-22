package OOPS_Concepts;

 public class Abstraction {
	
	public static void main (String []args)
	{
	   Animal myPet = new Dog(); 
	    myPet.animalSound();
	    myPet.sleep();
	}

}


abstract class Animal {
  // Abstract method (does not have a body)
  public  abstract void animalSound();
  // Regular method
  public  void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Dog extends Animal {
  public void animalSound() {
    System.out.println("Bow Bow");
  }
}
  
  class Cat extends Animal {
	  public void animalSound() {
	    System.out.println("Meow Meow");
	  }
  }


 
 
