package Ejemplo2;

public class Message {
	private String message;
	
	public Message (String pMessage) {
		this.message = pMessage;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}

}
