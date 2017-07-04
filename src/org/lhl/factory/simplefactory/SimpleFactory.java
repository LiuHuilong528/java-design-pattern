package org.lhl.factory.simplefactory;

public class SimpleFactory {

	public static Product getProduct(String name){
		Product product = null;
		if(ConcreteProduct.class.getSimpleName().equals(name)){
			product = new ConcreteProduct();
		}else if(ConcreteProductNo1.class.getSimpleName().equals(name)){
			product = new ConcreteProductNo1();
		}
		return product;
	}
}
