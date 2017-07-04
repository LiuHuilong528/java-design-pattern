package org.lhl.factory.abstractfactory;

/**
 * 具体产品：
 * 
 * @author datatoucher
 *
 */

public class SpringTextField implements TextField {

	@Override
	public void display() {
		System.out.println("显示绿色边框文本框");
	}

}
