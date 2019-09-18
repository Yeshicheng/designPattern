package proxy.dynamicProxy.withJDKProxyByGetProxy;

import java.lang.reflect.Proxy;

public class TestInterceptor {

	public static void main(String[] args) {
		
		//newProxyInstance �����е�ʱ��̬������̬������ķ���
		// 1. ��̬��������һ����ʳ�������ڴ��Ͽ��ٵ�һ���ռ���࣬������ִ�н����������ᱻ����
		// 2. ��Ȼ��̬������һ���ڴ�����ʱ�����õ��࣬��classĿ¼�²������������������Ƕ�̬������ͬ����Ҫ���������
		// 3. Ϊʲô��Ҫ�������? ��Ϊ��̬������Ҫ��ȡһ��Class�����Ҳ�������������������
	
		MyInterceptor myInterceptor = new MyInterceptor(new DiagramMessage());
		// ��̬��������Ҫ����������������������ʱ��һ��
		Object proxyObject = Proxy.newProxyInstance(DiagramMessage.class.getClassLoader(), 
				new Class[]{MessageHandler.class}, myInterceptor );
		MessageHandler messageHandler = (MessageHandler)proxyObject;
		messageHandler.sendMessage("Hello Word!");
		
	}

}
