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
	 * @param proxy是一个被代理的类对象；
	 * @param method是一个被代理的类对象的方法的反射对象
	 * @param args是该方法所需要的参数
	 * @return 被代理的对象的方法调用之后的返回值
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		logger.info("拦截器MyInterceptor"+method.getName()+"调用开始");
		Object returnResult = method.invoke(proxyedObject, args);
		logger.info("拦截器MyInterceptor"+method.getName()+"调用结束");
		return returnResult;
		
	}
	
	public Object GetProxy() {
		return Proxy.newProxyInstance(proxyedObject.getClass().getClassLoader(), proxyedObject.getClass().getInterfaces(), this);
	}

}
