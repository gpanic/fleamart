package com.fleamart.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="helloBean")
@RequestScoped
public class HelloBean {
	public String getHello() {
		return "Hello world!";
	}
}
