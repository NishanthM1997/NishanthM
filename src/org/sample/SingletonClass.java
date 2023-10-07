package org.sample;

public class SingletonClass {

	private static SingletonClass singlcls = null;

	private SingletonClass() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor is called");
	}

	public static SingletonClass getInstance() {
		if (singlcls == null) {
			
			System.out.println("singleton class value"+singlcls);
			singlcls = new SingletonClass();
		} else {
			
			System.out.println("singleton class value"+singlcls);
			return singlcls;
		}
		return singlcls;
	}

}
