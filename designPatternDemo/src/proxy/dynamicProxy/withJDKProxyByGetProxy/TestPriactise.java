package proxy.dynamicProxy.withJDKProxyByGetProxy;

public class TestPriactise {

	public static void main(String[] args) {
		
		MyInterceptor myInterceptor = new MyInterceptor(new DiagramMessage());
		MessageHandler messageHandler = (MessageHandler)myInterceptor.GetProxy();
		messageHandler.sendMessage("利用封装后的动态代理模式代理senMessage方法并输出");
		
	}

}
