package com.Jtc;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hello {
	
	String name;
	String message;
	
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hello(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Hello [name=" + name + ", message=" + message + "]";
	}
	
	
	

}
