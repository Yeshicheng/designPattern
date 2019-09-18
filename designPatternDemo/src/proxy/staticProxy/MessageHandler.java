package proxy.staticProxy;

/**
 * 静态代理模式
 * Message接口
 * @author 叶诗程
 */
public interface MessageHandler {
	
	public void sendMessage(String msg);
	
	public void receiveMessage(String msg);
	
}
