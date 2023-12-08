package section14;

public class InputErrorException extends Exception {

	private String message;
	
	public InputErrorException(String message) { //String message = "입력이 잘못됐습니다"
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}
