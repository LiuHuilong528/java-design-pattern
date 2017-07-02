package org.lhl.proxy.staticproxy;

/**
 *  代理用于控制对 <em>目标对象的访问</em>，而不是增强目标对象的功能
 *  代理控制对象的方法：
 *	1.Synchronization	-同步
 *	2.Authentication	-权限认证
 *	3.Remote Access		-远程访问
 *	4.Lazy instantiation-对象延迟初始化 
 */
import org.lhl.proxy.IVehicle;

public class VehicleProxy implements IVehicle {

	private IVehicle v;
	
	public VehicleProxy(IVehicle v) {
		this.v=v;
	}
	@Override
	public void start() {
		System.out.println("VehicleProxy:Begin of start()");
		v.start();
		System.out.println("VehicleProxy:End of start()");
	}

	@Override
	public void stop() {
		System.out.println("VehicleProxy:Begin of stop()");
		v.stop();
		System.out.println("VehicleProxy:End of stop()");
	}

	@Override
	public void forward() {
		System.out.println("VehicleProxy:Begin of forward()");
		v.forward();
		System.out.println("VehicleProxy:End of forward()");
	}

	@Override
	public void reverse() {
		System.out.println("VehicleProxy:Begin of reverse()");
		v.reverse();
		System.out.println("VehicleProxy:End of reverse()");
	}

	@Override
	public String getName() {
		return v.getName();
	}

}
