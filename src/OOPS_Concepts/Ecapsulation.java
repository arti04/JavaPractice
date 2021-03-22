package OOPS_Concepts;

public class Ecapsulation {
	
	public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();
 
        // setting values 
        obj.setName("Reena");
        obj.setLoc("Pune");
        obj.setRoll(25);
 
        // Displaying values 
        System.out.println("Student name: " + obj.getName());
        System.out.println("Student Loacation: " + obj.getLoc());
        System.out.println("Student roll: " + obj.getRoll());
 
      
    }

}


class Encapsulate {
    private String Name;
    private int Roll;
    private String Location;
 
    
    public String getLoc() { return Location; }
 
    public String getName() { return Name; }
 
 
    public int getRoll() { return Roll; }
 
 
    public void setLoc(String Loc) { Location = Loc; }
 
    
    public void setName(String newName)
    {
        Name = newName;
    }
 
    
    public void setRoll(int newRoll) { Roll = newRoll; }
}
 
