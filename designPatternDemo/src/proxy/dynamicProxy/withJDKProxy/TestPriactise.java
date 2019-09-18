package proxy.dynamicProxy.withJDKProxy;

import java.lang.reflect.Proxy;


public class TestPriactise {

	public static void main(String[] args) {
		
		MyInterceptor myInterceptor = new MyInterceptor(new DiagramMessage());
		Object proxyObject = Proxy.newProxyInstance(DiagramMessage.class.getClassLoader(),
				new Class[] {MessageHandler.class}, myInterceptor);
		MessageHandler messageHandler = (MessageHandler)proxyObject;
		messageHandler.sendMessage("11111");
		
	}

}
