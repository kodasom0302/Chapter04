package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		//로또 번호 중복 체크
		Set<Integer> iSet=new HashSet<Integer>();
		
		while (true) {
			if (iSet.size()>=6) {
				break;
			}
			int no=(int)(Math.random()*45)+1;
			iSet.add(no);
		}
		for (Integer num:iSet) {
			System.out.println(num.toString());
		}
		
		/* 내가 혼자 시도해본 것 - 중복 체크는 됐으나 6개보다 적게 나오는 경우 존재함
		int[] lArray=new int[6];
		Set<Integer> lSet=new HashSet<Integer>();
		
		for (int i=0; i<6; i++) {
			lArray[i]=(int)((Math.random()*45)+1);
			lSet.add(lArray[i]);
		}
		
		System.out.println(lSet.toString());
		*/

	}

}
