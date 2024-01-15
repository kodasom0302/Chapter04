package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		//로또 번호 중복 체크
		int[] lArray=new int[6];
		Set<Integer> lSet=new HashSet<Integer>();
		
		for (int i=0; i<6; i++) {
			lArray[i]=(int)((Math.random()*45)+1);
			lSet.add(lArray[i]);
		}
		
		System.out.println(lSet.toString());

	}

}
