package org.lhl.factory.simplefactory;

public abstract class Product {

	//公共方法
	public void methodSame(){
		System.out.println("Everyproduct are same!");
	}
	
	//抽象方法-子类覆盖
	public abstract void methodDiff();
}
