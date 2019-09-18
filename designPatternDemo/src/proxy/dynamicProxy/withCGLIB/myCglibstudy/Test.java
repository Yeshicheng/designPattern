package proxy.dynamicProxy.withCGLIB.myCglibstudy;


import proxy.entity.DiagramMessage;

public class Test {

	public static void main(String[] args) {
		
		// 1. 通过需要代理的类对象来创建一个CGLIB拦截器对象
		CGLIBInterceptorWithSetEnhancer cGLIBInterceptorWithSetEnhancer=new CGLIBInterceptorWithSetEnhancer
				(new DiagramMessage());
		
		/*
		 * 2. 创建一个代理类的对象（封装原来的一下内容）
		 2. 创建一个Enhance对象
		 3. 借助辅助类Enhancer对象，为当前辅助类设置父类（被代理的类）
				或者说是，通过给被代理的类设置一个子类来实现代理模式，
			该子类就是由辅助类Enhancer的一个对象充当的
			3.1 为代理类设置子类对象(enhancer)
			3.1 创建回调函数
		 4. 利用辅助类对象enhancer创建一个代理类对象
		*/		
		Object $proxy=cGLIBInterceptorWithSetEnhancer.getProxy();
		
		//3. 将代理类的对象向下转型，转为被代理的类的类型【4、5步可以合并】
		DiagramMessage obj=(DiagramMessage)$proxy;
		
		//4. 调用被带离的对象的方法/职责
		obj.sendMessage("封装enhancer对象的执行过程");

	}
	
}




