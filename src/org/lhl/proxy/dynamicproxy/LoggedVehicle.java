package org.lhl.proxy.dynamicproxy;

import org.lhl.proxy.IVehicle;
/**
 * 动态代理与装饰者模式
 * 下例是装饰者模式 - 只能给一个接口代理，<br/>
 * 而动态代理可以给所有的对象代理-见 {@link GenericLogger}
 * 为 Car 类增加日志记录
 * @author carl
 *
 */
public class LoggedVehicle implements IVehicle {

	private IVehicle v;
	public LoggedVehicle(IVehicle v) {
		this.v=v;
	}
	@Override
	public void start() {
		System.out.println("Log Entry:Vehicle "+v.getName()+" started");
		v.start();
	}

	@Override
	public void stop() {
		System.out.println("Log Entry:Vehicle "+v.getName()+" stoped");
		v.stop();
	}

	@Override
	public void forward() {
		System.out.println("Log Entry:Vehicle "+v.getName()+" going forward");
		v.forward();
	}

	@Override
	public void reverse() {
		System.out.println("Log Entry:Vehicle "+v.getName()+" going reverse");
		v.reverse();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
