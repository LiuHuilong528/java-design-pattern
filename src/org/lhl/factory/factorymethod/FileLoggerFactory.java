package org.lhl.factory.factorymethod;
/**
 * 具体工厂类：文件日志记录器工厂
 * @author datatoucher
 *
 */
public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		Logger log = new FileLogger();
		return log;
	}

}
