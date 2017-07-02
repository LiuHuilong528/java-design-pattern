package org.lhl.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.lhl.proxy.IVehicle;

public class VehicleHandler implements InvocationHandler {

	private IVehicle v;
	
	public VehicleHandler(IVehicle v) {
		this.v=v;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Vehicle Handler:Invoking "+method.getName());
		
		return method.invoke(v, args);
	}

}
