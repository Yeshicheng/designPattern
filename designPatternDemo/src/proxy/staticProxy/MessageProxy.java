package proxy.staticProxy;

import org.apache.log4j.Logger;

public class MessageProxy implements MessageHandler {

	private Logger logger = Logger.getLogger(MessageHandler.class);
	private MessageHandler messageHandler = new MailMessageHandler();
	
	public MessageProxy(MessageHandler messageHandler) {
		this.messageHandler = messageHandler;
	}
	
	@Override
	public void sendMessage(String msg) {

		logger.info("·¢ËÍmessage");
		messageHandler.sendMessage(msg);
	}

	@Override
	public void receiveMessage(String msg) {

		logger.info("½ÓÊÕmessage");
		messageHandler.receiveMessage(msg);
	}

}
