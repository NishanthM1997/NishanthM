package org.sample;

public class Main {

	public static void main(String[] args) {
		
		SingletonClass instance = SingletonClass.getInstance();
		System.out.println(instance);
		SingletonClass instance2 = SingletonClass.getInstance();
		System.out.println(instance2);
		SingletonClass instance3 = SingletonClass.getInstance();
		System.out.println(instance3);
	}

}
