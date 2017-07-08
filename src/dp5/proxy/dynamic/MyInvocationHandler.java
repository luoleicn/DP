package dp5.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	//������Ķ���    
	private Object target = null;
	//ͨ�����캯������һ������    
	public MyInvocationHandler(Object _obj){
		this.target = _obj;    
	}
	//������    
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {      
		//ִ�б�����ķ���       
		return method.invoke(this.target, args);
	}
}