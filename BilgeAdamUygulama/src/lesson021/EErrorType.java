package lesson021;

public enum EErrorType {

	OUT_OF_BOUNDS(1001," Sinirlarinin disinda .."),
	SEAT_ALREADY_OCCUPIED(1002 , "Secilen yer dolu"),
	WEIGHT_MISMATCH(1003,"100 kilo altindaki yukler kabul edilemez!!"),
	OUT_OF_SHIFT_DAY(1004,"Cuma gunleri yuk kabul edilmiyorr.."),
	EXPIRED_DATE(1005,"Gecmis bir tarih giremesiniz.");
	
	
	private int code;
	private String message;
	
	private EErrorType() {
		
	}
	private EErrorType(int code, String message) {
		this.code = code;
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public int getCode() {
		return code;
	}
	



}
