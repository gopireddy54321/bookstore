package com.cg.bsjc.exception;

@SuppressWarnings("serial")
public class BookStoreException extends Exception {
	public BookStoreException(String errMsg){
		super(errMsg);
	}
}
