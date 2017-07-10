package org.lhl.observepattern;

import java.util.Observable;

/**
 * 被观察者 - 主题
 * 
 * @author datatoucher
 *
 */
public class SpecialRepoter extends Observable {

	public void getNewNews(String msg) {
		this.setChanged();//设置changed 变化标签值为 true
		this.notifyObservers(msg);//通知观查者有变化
	}
}
