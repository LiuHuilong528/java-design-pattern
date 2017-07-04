package org.lhl.factory.factorymethod;
/**
 * 具体实现类2
 * @author datatoucher
 *
 */
public class FileLogger implements Logger {

	@Override
	public void writeLog() {
		System.out.println("FileLogger !");
	}

}
