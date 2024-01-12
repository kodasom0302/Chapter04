package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {
	
	private T[] oArray;
	private int crtPos;
	
	public MyList() {
		oArray=(T[])new Object[3];
		crtPos=0;
	}
	
	public void add(T obj) {
		oArray[crtPos]=obj;
		crtPos+=1;
	}
	public int size() {
		return crtPos;
	}
	public T get(int index) {
		return oArray[index];
	}

	@Override
	public String toString() {
		return "MyList [oArray=" + Arrays.toString(oArray) + ", crtPos=" + crtPos + "]";
	}

}
