/**
 * 动态代理类-在Runtime创建类时实现了一系列的制定接口（动态实现了接口）<br/>
 * 代理对象-代理类的实例<br/>
 * 每个代理对象都有相关的 <code> invocation handler object</code>这个 <b>handler</b>
 * 实现了<code>InvocationHandler</code> <br/>
 * 代理对象调用它代理接口的方法会被发送到实例的 invocation handler的invoke()方法</br>
 * 代理类创建使用新的<code>java.lang.reflect.Proxy</code>类</br>
 * 代理类都是 public、final、没有子类的<code>java.lang.reflect.Proxy</code> </br>
 * 不合格的代理类名是不允许的，"$Proxy"是代理类的保留字</br>
 * 代理类在创建时正确的实现了指定的接口</br>
 * 由于以上一点：在代理类的Class对象上调用<code>getInterfaces()</code>得到同创建类时相同的接口数组，顺序也于创建时相同</br>
 * 每个代理类都有个公开的构造器，构造器有个InvocationHandler参数，为代理对象设置代理处理器</br>
 * </br>
 * 动态代理使用：</br>
 * 1. 实现 InvocationHandler 接口创建自己的调用处理器</br>
 * 2. 为 Proxy 类指定 ClassLoader 对象和一组 interface 来创建动态代理类；</br>
 * 3. 通过反射机制获得动态代理类的构造函数，其唯一参数类型是调用处理器接口类型；</br>
 * 4. 通过构造函数创建动态代理类实例，构造时调用处理器对象作为参数被传入</br>
 *   @author carl
 *
 */
package org.lhl.proxy.noproxy;