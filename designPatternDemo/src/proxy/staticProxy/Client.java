package proxy.staticProxy;

public class Client {

	public static void main(String[] args) {

		MessageHandler messageHandler = new MailMessageHandler();
		MessageProxy messageProxy = new MessageProxy(messageHandler);
		
		String message = "Hello World!";
		messageProxy.sendMessage(message);
	}

}
