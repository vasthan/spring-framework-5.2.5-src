package com.adc;

public class HelloServiceImpl implements HelloService{
	@Override
	public void hello(String name) {
		System.out.println("hello " + name);
	}
}
