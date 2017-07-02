package org.lhl.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

import org.lhl.proxy.IVehicle;
import org.lhl.proxy.noproxy.Car;

public class Client4 {

	public static void main(String[] args) {
		IVehicle c = new Car("Botar"); 
		ClassLoader cl = IVehicle.class.getClassLoader();
		IVehicle v = (IVehicle)Proxy.newProxyInstance(cl, new Class[]{IVehicle.class}, new GenericLogger(c));
		v.start();
		v.forward();
		v.reverse();
		v.stop();
	}

}
