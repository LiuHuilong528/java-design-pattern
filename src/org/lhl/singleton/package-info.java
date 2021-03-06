/**
 * 设计模式 -- 单例 有三种： 1.普通的 - 线程不安全 2.急切初始化 - 线程安全的 3.双重检查加锁 4.利用静态内部类
 * -线程安全,在getInstance()中减少同步使用
 * 
 * 使用场景：
 * 序列号生成器或资源管理器，或者需要考虑资源消耗太大
 * 
 * @author carl
 *
 */
package org.lhl.singleton;