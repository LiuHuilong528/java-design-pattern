package org.lhl.factory.abstractfactory;
/**
 * 抽象工厂
 * @author datatoucher
 *
 */
public interface SkinFactory {

	public Button createButton();
	public TextField createTextField();
	public ComboBox createCombobox();
}
