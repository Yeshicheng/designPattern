package proxy.dynamicProxy.withJDKProxyByGetProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.log4j.Logger;

public class MyInterceptor implements InvocationHandler {

	Object proxyedObject ;
	private Logger logger = Logger.getLogger(MyInterceptor.class);
	
	public MyInterceptor(Object proxyedObject) {
		this.proxyedObject = proxyedObject;
	}
	
	/**
	 * @param proxy��һ���������������
	 * @param method��һ���������������ķ����ķ������
	 * @param args�Ǹ÷�������Ҫ�Ĳ���
	 * @return �������Ķ���ķ�������֮��ķ���ֵ
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		logger.info("������MyInterceptor"+method.getName()+"���ÿ�ʼ");
		Object returnResult = method.invoke(proxyedObject, args);
		logger.info("������MyInterceptor"+method.getName()+"���ý���");
		return returnResult;
		
	}
	
	public Object GetProxy() {
		return Proxy.newProxyInstance(proxyedObject.getClass().getClassLoader(), proxyedObject.getClass().getInterfaces(), this);
	}

}