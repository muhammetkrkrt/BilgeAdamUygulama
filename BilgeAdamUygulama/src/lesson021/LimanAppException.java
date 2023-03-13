package lesson021;

public class LimanAppException extends RuntimeException{

	private EErrorType errorType;

	public LimanAppException(EErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
	}

	public EErrorType getErrorType() {
		return errorType;
	}

	public void setErrorType(EErrorType errorType) {
		this.errorType = errorType;
	}




	
}
