package proxy.entity;


/**
 * @see MessageProxy
 * @author 叶诗程
 *
 */
public class DiagramMessage implements MessageHandler{

	/**
	 * @param 
	 */
	@Override
	public void sendMessage(String msg) {
		System.out.println("使用图表发送message:"+msg);
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println("使用图表接受message:"+msg);
	}

}
