package proxy.dynamicProxy.withJDKProxyByGetProxy;

public class TestPriactise {

	public static void main(String[] args) {
		
		MyInterceptor myInterceptor = new MyInterceptor(new DiagramMessage());
		MessageHandler messageHandler = (MessageHandler)myInterceptor.GetProxy();
		messageHandler.sendMessage("���÷�װ��Ķ�̬����ģʽ����senMessage���������");
		
	}

}
