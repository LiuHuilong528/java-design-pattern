/**
 * 设计模式 -- 单例
 * 有三种：
 * 1.普通的 		- 线程不安全
 * 2.急切初始化	- 线程安全的
 * 3.双重检查加锁	-线程安全,在getInstance()中减少同步使用
 * @author carl
 *
 */
package org.lhl.singleton;