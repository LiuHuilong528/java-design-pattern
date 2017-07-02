package org.lhl.proxy.noproxy;

import org.lhl.proxy.IVehicle;

public class Car implements IVehicle {

	private String name;
	
	public Car(String name){
		this.name = name;
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car "+name+" started!");
	}

	@Override
	public void stop() {
		System.out.println("Car "+name+" stoped!");

	}

	@Override
	public void forward() {
		System.out.println("Car "+name+" going forward!");

	}

	@Override
	public void reverse() {
		System.out.println("Car "+name+" reversed!");

	}

	@Override
	public String getName() {
		return name;
	}

}
