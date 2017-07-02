package org.lhl.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

import org.lhl.proxy.IVehicle;
import org.lhl.proxy.noproxy.Car;

public class Client3 {

	public static void main(String[] args) {
		//被代理对象 - 目标对象
		IVehicle c = new Car("Botar");
		ClassLoader cl = IVehicle.class.getClassLoader();
		//代理对象
		IVehicle v = (IVehicle)Proxy.newProxyInstance(cl, new Class[]{IVehicle.class}, new VehicleHandler(c));
		v.start();
		v.forward();
		v.reverse();
		v.stop();
	}

}
