package org.lhl.factory.abstractfactory;

/**
 * 具体工厂：
 * 
 * @author datatoucher
 *
 */
public class SummerSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SummerButton();
	}

	@Override
	public TextField createTextField() {
		return new SummerTextField();
	}

	@Override
	public ComboBox createCombobox() {
		return new SummerComboBox();
	}

}
