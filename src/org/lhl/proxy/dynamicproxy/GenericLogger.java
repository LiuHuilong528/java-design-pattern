package org.lhl.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 通用代理
 * @author carl
 *
 */
public class GenericLogger implements InvocationHandler {

	private Object target;
	
	public GenericLogger(Object target) {
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("GenericLogger Entry:Invoking "+method.getName());
		return method.invoke(target, args);
	}

}
