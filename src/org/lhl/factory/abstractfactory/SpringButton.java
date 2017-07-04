package org.lhl.factory.abstractfactory;
/**
 * 具体产品:
 * @author datatoucher
 *
 */
public class SpringButton implements Button {

	@Override
	public void display() {
		System.out.println("显示浅绿色按钮！");
	}

}
