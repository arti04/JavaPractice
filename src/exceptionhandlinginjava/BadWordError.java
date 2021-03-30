
/**
     * class BadWordException: throws an error on printing invalid words in a string.
*/

public class BadWordError extends Error {

    private static final long serialVersionUID = 17834758370275L;

    public BadWordError(){
        super();
    }
    
    public BadWordError(String error){
        super(error);
    }

}
