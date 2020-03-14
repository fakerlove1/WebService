package com.ak.service.impl;

import com.ak.service.UserService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class UserServiceImpl implements UserService {

	@WebMethod
	@Override
	public String sayHi(String uname) {
		System.out.println("hi,"+uname);
		return "hi,"+uname;
	}
}