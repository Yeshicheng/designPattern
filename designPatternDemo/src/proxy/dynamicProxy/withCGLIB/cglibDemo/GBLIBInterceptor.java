package proxy.dynamicProxy.withCGLIB.cglibDemo;
/**
 * CGLIB 动态代理模式CGLIB拦截器示例代码
 */
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class GBLIBInterceptor implements MethodInterceptor {
	Logger logger=Logger.getLogger(GBLIBInterceptor.class.getName());
	Object proxyedObject;//被代理类对象
	public GBLIBInterceptor(Object proxyedObject)
	{
		this.proxyedObject=proxyedObject;
	}
	
	public void beforeMethod(Method method)
	{
		logger.info(method.getName()+"被执行");
		//System.out.println("开始执行");
	}

	/**
	 * 就提业务方法执行之后的一个通用代码方法
	 */
	public void afterMethod(Method method)
	{
		logger.info(method.getName()+"执行结束");
	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] arguments, MethodProxy arg3) throws Throwable {
		this.beforeMethod(method);
		Object result=method.invoke(proxyedObject, arguments);
		this.afterMethod(method);
		return result;
	}
	

}
