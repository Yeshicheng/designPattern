package proxy.dynamicProxy.withJDKProxyByGetProxy;

import java.lang.reflect.Proxy;

public class TestInterceptor {

	public static void main(String[] args) {
		
		//newProxyInstance 在运行的时动态创建动态代理类的方法
		// 1. 动态代理类是一个零食保存在内存上开辟的一个空间的类，当代码执行结束，类对象会被回收
		// 2. 虽然动态代理是一个内存上临时创建好的类，在class目录下不会物理保存下来，但是动态代理类同样需要类加载器。
		// 3. 为什么需要类加载器? 因为动态代理类要获取一个Class类对象，也必须借助类加载器来完成
	
		MyInterceptor myInterceptor = new MyInterceptor(new DiagramMessage());
		// 动态代理类需要借助被代理类的类加载器临时用一下
		Object proxyObject = Proxy.newProxyInstance(DiagramMessage.class.getClassLoader(), 
				new Class[]{MessageHandler.class}, myInterceptor );
		MessageHandler messageHandler = (MessageHandler)proxyObject;
		messageHandler.sendMessage("Hello Word!");
		
	}

}
