package proxy.dynamicProxy.withJDKProxy;


/**
 * @see MessageProxy
 * @author Ҷʫ��
 *
 */
public class MailMessage implements MessageHandler{

	/**
	 * @param 
	 */
	@Override
	public void sendMessage(String msg) {
		System.out.println("ʹ���ʼ�����message:"+msg);
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println("ʹ���ʼ�����message:"+msg);
	}

}