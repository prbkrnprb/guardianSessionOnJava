package in.prabakaran;

public class PolicyException extends RunTimeException {
	
	public PolicyException(String message, String additionalInfo){
		super(message);
		System.out.println(message + " " + additionalInfo);
	}

}
