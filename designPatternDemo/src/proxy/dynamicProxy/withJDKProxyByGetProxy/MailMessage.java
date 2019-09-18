package proxy.dynamicProxy.withJDKProxyByGetProxy;


/**
 * @see MessageProxy
 * @author 叶诗程
 *
 */
public class MailMessage implements MessageHandler{

	/**
	 * @param 
	 */
	@Override
	public void sendMessage(String msg) {
		System.out.println("使用邮件发送message:"+msg);
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println("使用邮件接受message:"+msg);
	}

}
