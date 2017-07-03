package org.lhl.singleton;
/**
 * 急切创建实例，类加载完成就初始化
 * 这样可以保持线程的安全性 
 * @author carl
 *
 */
public class EagerlySingleton {
	private static EagerlySingleton uniqueInstance = new EagerlySingleton();
	
	private EagerlySingleton(){}
	
	public EagerlySingleton getInstance(){
		return uniqueInstance;
	}
}
