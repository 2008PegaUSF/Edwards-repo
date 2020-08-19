
public class CustomException extends Exception{

	
	//No Parameter constructor
	public CustomException() {
		super("This is a big bad exception message...BOO");
	}
	
	public void throwCustomException() throws CustomException{
		throw new CustomException();
	}
}
