package org.lhl.observepattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者 - 订阅者
 * 
 * @author datatoucher
 *
 */
public class PeopleDaily extends NewspaperOffice implements Observer {

	/** 主题 */
	private Observable observable;

	public PeopleDaily(SpecialRepoter repoter) {
		this.observable = repoter;
		repoter.addObserver(this);// 订阅主题
	}

	/**
	 * 得到消息
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof SpecialRepoter) {
			System.out.println("People's Daily brings you the latest news!");
			System.out.println(arg);
		}
	}

	/**
	 * 取消订阅
	 * 
	 * @author datatoucher
	 */
	public void remove() {
		observable.deleteObserver(this);
	}

	public static void main(String[] args) {
		SpecialRepoter observee = new SpecialRepoter();
		PeopleDaily people = new PeopleDaily(observee);
		observee.getNewNews("共产主义实现了");
	}
}
