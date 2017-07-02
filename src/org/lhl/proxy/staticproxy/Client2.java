package org.lhl.proxy.staticproxy;

import org.lhl.proxy.IVehicle;
import org.lhl.proxy.noproxy.Car;

/**
 * 通过代理对象对目标对象进行交互
 * @author carl
 *
 */
public class Client2 {

	public static void main(String[] args) {
		IVehicle c = new Car("Botar");
		IVehicle v = new VehicleProxy(c);
		v.start();
		v.forward();
		v.reverse();
		v.stop();
	}

}
