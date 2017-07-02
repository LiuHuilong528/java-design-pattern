package org.lhl.proxy.noproxy;

import org.lhl.proxy.IVehicle;

/**
 * 直接与Car交互
 * @author carl
 *
 */
public class Client1 {

	public static void main(String[] args) {
		IVehicle v = new Car("Botar");
		v.start();
		v.forward();
		v.stop();
	}
}
