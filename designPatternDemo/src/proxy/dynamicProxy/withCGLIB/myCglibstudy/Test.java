package proxy.dynamicProxy.withCGLIB.myCglibstudy;


import proxy.entity.DiagramMessage;

public class Test {

	public static void main(String[] args) {
		
		// 1. ͨ����Ҫ����������������һ��CGLIB����������
		CGLIBInterceptorWithSetEnhancer cGLIBInterceptorWithSetEnhancer=new CGLIBInterceptorWithSetEnhancer
				(new DiagramMessage());
		
		/*
		 * 2. ����һ��������Ķ��󣨷�װԭ����һ�����ݣ�
		 2. ����һ��Enhance����
		 3. ����������Enhancer����Ϊ��ǰ���������ø��ࣨ��������ࣩ
				����˵�ǣ�ͨ�����������������һ��������ʵ�ִ���ģʽ��
			����������ɸ�����Enhancer��һ������䵱��
			3.1 Ϊ�����������������(enhancer)
			3.1 �����ص�����
		 4. ���ø��������enhancer����һ�����������
		*/		
		Object $proxy=cGLIBInterceptorWithSetEnhancer.getProxy();
		
		//3. ��������Ķ�������ת�ͣ�תΪ�������������͡�4��5�����Ժϲ���
		DiagramMessage obj=(DiagramMessage)$proxy;
		
		//4. ���ñ�����Ķ���ķ���/ְ��
		obj.sendMessage("��װenhancer�����ִ�й���");

	}
	
}




