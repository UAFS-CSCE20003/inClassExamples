package exceptions;

public class CustomException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public CustomException(String message) {
		super(message);
	}
	
	
	public static int fun1(int start, int end) {
		int result=-1;
		
		try {
			if(start < end) {
				result=end-start;
			}else {
				throw new CustomException("Start is Larger than End");
			}
		}catch(CustomException e) {
			System.out.printf("My Custom Errom Handler\n");
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int result = fun1(20,10);
		System.out.printf("%d\n", result);
		
	}
	

}
