package org.lhl.factory.abstractfactory;

/**
 * 具体工厂
 * 
 * @author datatoucher
 *
 */
public class SpringSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SpringButton();
	}

	@Override
	public TextField createTextField() {
		return new SpringTextField();
	}

	@Override
	public ComboBox createCombobox() {
		return new SpringComboBox();
	}

}
