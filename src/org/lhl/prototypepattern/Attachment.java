package org.lhl.prototypepattern;

import java.io.Serializable;

/**
 * 浅复制 - 引用类型成员变量不会复制，与原型对象应用类型成员指向相同的内存地址;
 * 
 * @author carl
 *
 */
public class Attachment implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	
	public void download(){
		System.out.println("下载附件！");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
