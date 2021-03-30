/**
     * class BadWordException: throws an exception on printing invalid words in a string.
*/

public class BadWordException extends Exception{

    /**
     * Exception in Serializable thus need to define the serialVersionUID.
     */
    private static final long serialVersionUID = 4964172851962173209L;

    public BadWordException(){
        super();
    }

     public BadWordException(String error){
        super(error);
     }

     public BadWordException(String error, Throwable cause){
         super(error, cause);
     }

}