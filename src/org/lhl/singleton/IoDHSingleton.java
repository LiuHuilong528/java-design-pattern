/**
 * 
 */
package org.lhl.singleton;

/**
 * IoDH 单例-最好的单例实现方式
 * 
 * @author datatoucher
 *
 */
public class IoDHSingleton {
	private IoDHSingleton(){}
	
	//静态内部类 持有对象 
	private static class HolderClass{
		private final static IoDHSingleton instance = new IoDHSingleton();
	}
	public IoDHSingleton getInstance(){
		return HolderClass.instance;
	}
}
