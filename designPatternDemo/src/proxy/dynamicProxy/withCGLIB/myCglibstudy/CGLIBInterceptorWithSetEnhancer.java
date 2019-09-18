package proxy.dynamicProxy.withCGLIB.myCglibstudy;

import java.lang.reflect.Method;
import org.apache.log4j.Logger;

import net.sf.cglib.proxy.Enhancer;
// 第三方的代理依赖包
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLIBInterceptorWithSetEnhancer implements MethodInterceptor{
	Logger logger=Logger.getLogger(CGLIBInterceptorWithSetEnhancer.class);
	Object proxyedObject;//被代理类对象
	
	public CGLIBInterceptorWithSetEnhancer(Object proxyedObject)
	{
		this.proxyedObject=proxyedObject;
	}
	
	// 通用代码:日志,异常,事务
	/**
	 * @param Object: proxyClass 代理类的对象
	 * @param Method: method 被代理的方法反射对象
	 * @param Object[]: arguments 被代理的方法的参数，对象数组的形式传值
	 * @return Object: 返回的是当前代理的方法的返回值
	 * @param MethodProxy: methodProxy
	 */
	@Override
	public Object intercept(Object proxyClass, Method method, Object[] arguments, MethodProxy methodProxy) 
				throws Throwable {
		logger.info(method.getName()+"被执行");
		Object result= method.invoke(proxyedObject, arguments);
		logger.info(method.getName()+"执行结束");
		return result;
	}
	
	public Object getProxy(){
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(proxyedObject.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
}
