import java.util.Scanner;


/**
 * Exception
 *      |---Checked Exceptions: Should be logged, handled. Code execution can be continued. ex: FilenotFoundException.
 *      |---UnChecked Exceptions: Unrecoverable Exceptions.
 *              |---Runtime Exceptions: Decided at run time. ex: IndexOutOfBoundException, NullPointerException
 *              |---Errors: Runime failures ex Physical resources exhausted. ex: JVM related errors.
 */

public class Main {
    public static void main(String args[]) {
        
        switch(Integer.parseInt(args[0])){
            case 0:
                /**
                 * try finally block.
                 */
                try{

                    java.lang.System.out.println("Inside try block");
                    java.lang.System.out.println("Inside try block" + 1/0);
                }
                finally{
                    
                    java.lang.System.out.println("Inside finally block");
                }
                break;
            case 1:
                /**
                 * Variable scope with try catch block. The variables defined this way must implement java.lang.Autoclosable interface and has scope in try block only.
                 */
                try(Scanner in = new Scanner(java.lang.System.in);){

                    java.lang.System.out.println("Value of variable is: " + in.nextLine());
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                break;
            
            case 2:
                /**
                 * Custom Runtime Exception.
                 */
                int i = 1/0;
                try {

                    System.out.println(""+1/0+i);
                }
                catch (BadWordException | ArithmeticException e){
                    e.printStackTrace();
                } 
                finally{

                    java.lang.System.out.println("In finally block");
                }
                break;

            case 3:
                /**
                 * Exception Sequence in catch blocks: The sequence of exceptions should always by child class first than parent class. 
                 */
                try {

                    System.out.println("We are good");
                    System.out.println("We are bad");

                }
                catch (Exception e){
                    e.printStackTrace();
                } 
                // catch (BadWordException e) {
                //     e.printStackTrace();
                // }

            case 4:
                /**
                 * Custom Checked Exception
                 */
                try {

                    System.out.println("We are good");
                    System.out.println("We are bad");

                }
                catch (BadWordException e){
                    e.printStackTrace();
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case 6:
                /**
                 * Understanding Runtime Exception.
                 */
                System.out.print("Good word is a good word.");
                System.out.print("Bad word is a kill word.");
                
                break;

            case 7:
                /**
                 * Understanding Error.
                 */
                System.out.printMessage("Good word is a good word.");
                System.out.printMessage("Bad word is a kill word.");
                
                break;
            
            case 5:
                /**
                 * Understanding the behaviour of finally block on kepping a return statement in finally block itself.
                 */
                try {

                    return;
                    //java.lang.System.out.println(""+1/0);
                }
                catch (Exception e){
                    e.printStackTrace();
                    return;
                } 
                finally{
                    java.lang.System.out.println("Inside the finally block.");
                }

            default:
                java.lang.System.out.println("Invalid argument!");
        }
    }
}
