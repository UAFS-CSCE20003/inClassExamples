package exceptions;

public class CustomException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/*******************************************************************************************************************************
	 * Unchecked Exception: Extends RuntimeException. The calling code is not forced to catch it or declare it in a throws clause. *
	 *  Use this for programmatic errors or invalid business logic.                                                                *
	 * Checked Exception: Extends Exception. The calling code must handle it using a try-catch block or                            *
	 * declare it in the method signature using throws.                                                                            *
	 *******************************************************************************************************************************/
	public CustomException(String message) {
		super(message);
	}
	
	
	public static int fun1(int start, int end) throws CustomException {
		int result=-1;
		
		if(start < end) {
			result=end-start;
		}else {
			throw new CustomException("Start is Larger than End");
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int result;
		try {
			result = fun1(20,10);
			System.out.printf("%d\n", result);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
