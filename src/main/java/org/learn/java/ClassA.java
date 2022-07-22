package org.learn.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

public class ClassA {
	
	@PostConstruct
	public void init() {
		System.out.println("Init method of class A get called");
	}
	
	@PreDestroy
	public void predestroy() {
		System.out.println("Destroy method of class A get called");
		
	}

	public String doSomething() {
		return "hello world";
	}
}
