/**
 * 类适配器 <br/>
 * 类适配器模式中适配器和适配者是继承关系<br/>
 * JAVA 中不能继承多个类：类适配器使用受限，目标接口不能是类 典型代码如下：<br/>
 * <code>
 * class Adapter extends Adaptee implements Target {  <br/>
 *  public void request() {  <br/>
 *      specificRequest();  <br/>
 *  }  <br/>
 *} </code>
 * 
 * @author carl
 *
 */
package org.lhl.adapterpattern.typeadapter;