package proxy.dynamicProxy.withJDKProxyByGetProxy;

/**
 * ��̬����ģʽ
 * Message�ӿ�
 * @author Ҷʫ��
 */
public interface MessageHandler {
	
	public void sendMessage(String msg);
	
	public void receiveMessage(String msg);
	
}
