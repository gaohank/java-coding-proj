package com.web;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Service1 {
	public void test1() throws IOException{
		throw new IOException("ioException");
	}
	public void test2(){
		throw new RuntimeException("err");
	}
}
