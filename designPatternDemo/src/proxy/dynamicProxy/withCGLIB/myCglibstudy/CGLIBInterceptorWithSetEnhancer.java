package proxy.dynamicProxy.withCGLIB.myCglibstudy;

import java.lang.reflect.Method;
import org.apache.log4j.Logger;

import net.sf.cglib.proxy.Enhancer;
// �������Ĵ���������
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLIBInterceptorWithSetEnhancer implements MethodInterceptor{
	Logger logger=Logger.getLogger(CGLIBInterceptorWithSetEnhancer.class);
	Object proxyedObject;//�����������
	
	public CGLIBInterceptorWithSetEnhancer(Object proxyedObject)
	{
		this.proxyedObject=proxyedObject;
	}
	
	// ͨ�ô���:��־,�쳣,����
	/**
	 * @param Object: proxyClass ������Ķ���
	 * @param Method: method ������ķ����������
	 * @param Object[]: arguments ������ķ����Ĳ����������������ʽ��ֵ
	 * @return Object: ���ص��ǵ�ǰ����ķ����ķ���ֵ
	 * @param MethodProxy: methodProxy
	 */
	@Override
	public Object intercept(Object proxyClass, Method method, Object[] arguments, MethodProxy methodProxy) 
				throws Throwable {
		logger.info(method.getName()+"��ִ��");
		Object result= method.invoke(proxyedObject, arguments);
		logger.info(method.getName()+"ִ�н���");
		return result;
	}
	
	public Object getProxy(){
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(proxyedObject.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
}
