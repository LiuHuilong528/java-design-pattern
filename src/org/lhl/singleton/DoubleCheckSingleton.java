package org.lhl.singleton;

public class DoubleCheckSingleton {

	/** {@link volatile} 确保多线程可以正确处理 uniqueInstance*/
	private volatile static DoubleCheckSingleton uniqueInstance ;
	
	private DoubleCheckSingleton (){}
	
	public DoubleCheckSingleton getInstance(){
		if(uniqueInstance == null){
			synchronized (DoubleCheckSingleton.class) {
				if(uniqueInstance == null){
					uniqueInstance = new DoubleCheckSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
