package org.lhl.singleton;
/**
 * 普通单例
 * @author carl
 *
 */

public class CommonSingleton {

	private static CommonSingleton instance;
	
	private CommonSingleton() {}
	
	/**
	 * 如果没有实例，就创建个实例出来
	 * @return
	 */
	public CommonSingleton getInstance(){
		if(instance == null){
			instance = new CommonSingleton();
		}
		return instance;
	}
}
