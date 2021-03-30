public class System{
	
	public static PrintStream out = new PrintStream();

}

class PrintStream {

	private String badWords[] = {"bad","kill"};

	public void println(String message) throws BadWordException{
		for(String word : badWords){
			if(message.toLowerCase().contains(word)){
				throw new BadWordException();
			}
		}
		java.lang.System.out.println(message);
	}

	public void print(String message) throws BadWordRuntimeException{
		for(String word : badWords){
			if(message.toLowerCase().contains(word)){
				throw new BadWordRuntimeException();
			}
		}
		java.lang.System.out.println(message);
	}

	/**
	 * Bad coding practice to declare a custom error. If required use checked/compile Exception.
	 */
	public void printMessage(String message) throws BadWordError{
		for(String word : badWords){
			if(message.toLowerCase().contains(word)){
				throw new BadWordError();
			}
		}
		java.lang.System.out.println(message);
	}

}
