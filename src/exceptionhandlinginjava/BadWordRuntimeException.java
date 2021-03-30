
/**
     * class BadWordRuntimeException: throws a runtime exception on printing invalid words in a string.
*/

public class BadWordRuntimeException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public BadWordRuntimeException(){
        super();
    }

    public BadWordRuntimeException(String error){
        super(error);
    }
    
}