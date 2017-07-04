package org.lhl.factory.abstractfactory;
/**
 * 具体产品：
 * @author datatoucher
 *
 */
public class SummerTextField implements TextField {

	@Override
	public void display() {
		System.out.println("显示浅蓝色边框！");
	}

}
