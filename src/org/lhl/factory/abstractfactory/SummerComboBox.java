package org.lhl.factory.abstractfactory;
/**
 * 具体产品
 * @author datatoucher
 *
 */
public class SummerComboBox implements ComboBox {

	@Override
	public void display() {
		System.out.println("浅蓝色边框组合");
	}
}
