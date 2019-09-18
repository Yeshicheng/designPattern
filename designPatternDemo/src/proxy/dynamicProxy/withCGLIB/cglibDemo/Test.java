package proxy.dynamicProxy.withCGLIB.cglibDemo;

import net.sf.cglib.proxy.Enhancer;
import proxy.entity.DiagramMessage;

public class Test {

	public static void main(String[] args) {
		
		// 1. ͨ����Ҫ����������������һ��CGLIB����������
		GBLIBInterceptor cGLIBInterceptor=new GBLIBInterceptor
				(new DiagramMessage());
		
		// 2. ����һ��Enhancer����
		//		Enhancer����һ�������࣬CGLIB�������������ɴ�����
		Enhancer enhancer=new Enhancer();

		// 3. ����������Enhancer����Ϊ��ǰ���������ø��ࣨ��������ࣩ
		//		����˵�ǣ�ͨ�����������������һ��������ʵ�ִ���ģʽ��
		//		����������ɸ�����Enhancer��һ������䵱��
		//	3.1 Ϊ�����������������(enhancer)
		enhancer.setSuperclass(DiagramMessage.class);
		//	3.1 �����ص�����
		enhancer.setCallback(cGLIBInterceptor);
		
		//4. ���ø��������enhancer����һ�����������
		Object $proxy=enhancer.create();
		
		//5. ��������Ķ�������ת�ͣ�תΪ�������������͡�4��5�����Ժϲ���
		DiagramMessage obj=(DiagramMessage)$proxy;
		
		//6. ���ñ�����Ķ���ķ���/ְ��
		obj.sendMessage("ͨ��CGLIBʵ�ֶ�̬����");

	}
	
}




