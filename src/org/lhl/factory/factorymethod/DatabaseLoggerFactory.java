package org.lhl.factory.factorymethod;
/**
 * 具体工厂类：数据库日志记录器
 * @author datatoucher
 *
 */
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		//其他的逻辑判断，资源获取等
		Logger log = new DatabaseLogger();
		return log;
	}

}
