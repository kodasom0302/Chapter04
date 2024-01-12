package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {
	
	private Circle[] cArray;
	private int crtPos;
	
	public CircleList() {
		cArray=new Circle[3];
		cArray=0;
	}
	
	public void add(Circle c) {
		cArray[crtPos]=c;
		crtPos+=1;
	}
	
	public int size() {
		return crtPos;
	}
	public Circle get(int index) {
		return cArray[index];
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}

}
