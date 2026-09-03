package inClassSep3;

//-----------Inherits from RuntimeException (Unchecked Exception)-------
// Unchecked exception doesn't require a throws or try/catch clause
public class OutOfBoundsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OutOfBoundsException(String message) {
		super(message);
	}
}
