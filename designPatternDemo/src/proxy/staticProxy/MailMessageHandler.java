package proxy.staticProxy;


/**
 * @see MessageProxy
 * @author Ҷʫ��
 *
 */
public class MailMessageHandler implements MessageHandler{

	/**
	 * @param 
	 */
	@Override
	public void sendMessage(String msg) {
		System.out.println("ʹ���ʼ�����message");
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println("ʹ���ʼ�����message");
	}

}
