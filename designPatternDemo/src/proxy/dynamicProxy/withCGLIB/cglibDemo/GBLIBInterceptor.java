package proxy.dynamicProxy.withCGLIB.cglibDemo;
/**
 * CGLIB ��̬����ģʽCGLIB������ʾ������
 */
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class GBLIBInterceptor implements MethodInterceptor {
	Logger logger=Logger.getLogger(GBLIBInterceptor.class.getName());
	Object proxyedObject;//�����������
	public GBLIBInterceptor(Object proxyedObject)
	{
		this.proxyedObject=proxyedObject;
	}
	
	public void beforeMethod(Method method)
	{
		logger.info(method.getName()+"��ִ��");
		//System.out.println("��ʼִ��");
	}

	/**
	 * ����ҵ�񷽷�ִ��֮���һ��ͨ�ô��뷽��
	 */
	public void afterMethod(Method method)
	{
		logger.info(method.getName()+"ִ�н���");
	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] arguments, MethodProxy arg3) throws Throwable {
		this.beforeMethod(method);
		Object result=method.invoke(proxyedObject, arguments);
		this.afterMethod(method);
		return result;
	}
	

}
