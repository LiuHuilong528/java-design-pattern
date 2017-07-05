package org.lhl.prototypepattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 实现 {@link Cloneable} ，方便的原型模式
 * 
 * @author carl
 *
 */
public class WeeklyLog implements Cloneable ,Serializable{

	private static final long serialVersionUID = 1L;

	private String name;

	private Attachment attach;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Attachment getAttach() {
		return attach;
	}

	public void setAttach(Attachment attach) {
		this.attach = attach;
	}

	public WeeklyLog clone() {
		Object obj = null;
		try {
			obj = super.clone();
			return (WeeklyLog) obj;
		} catch (CloneNotSupportedException e) {
			System.out.println("不支持复制！");
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 浅复制克隆 浅复制 - 引用类型成员变量不会复制，与原型对象应用类型成员指向相同的内存地址;
	 * 此处 WeeklyLog Attachment 不需要实现任何接口
	 * @return
	 */
	public WeeklyLog shallowCopyClone() {
		Object obj = null;
		try {
			obj = super.clone();
			return (WeeklyLog) obj;
		} catch (CloneNotSupportedException e) {
			System.out.println("不支持复制！");
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 深度拷贝克隆
	 * 深度克隆，需要对象实现序列化接口（Serialization），将原型对象从内存写到流中，以此方式实现克隆
	 * 此处需要 WeeklyLog Attachment 都实现 Serializable 接口;
	 * @return
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public WeeklyLog deepCopyClone() throws IOException, ClassNotFoundException{
		//将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//从流中将对象读出来
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (WeeklyLog)ois.readObject();
	}
}