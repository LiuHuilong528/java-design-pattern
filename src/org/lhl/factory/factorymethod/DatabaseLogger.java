package org.lhl.factory.factorymethod;
/**
 * 具体实现类
 * @author datatoucher
 *
 */
public class DatabaseLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("DatabaseLogger ！");

	}

}
