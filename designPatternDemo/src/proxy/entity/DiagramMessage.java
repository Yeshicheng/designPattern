package proxy.entity;


/**
 * @see MessageProxy
 * @author Ҷʫ��
 *
 */
public class DiagramMessage implements MessageHandler{

	/**
	 * @param 
	 */
	@Override
	public void sendMessage(String msg) {
		System.out.println("ʹ��ͼ����message:"+msg);
	}

	@Override
	public void receiveMessage(String msg) {
		System.out.println("ʹ��ͼ�����message:"+msg);
	}

}
