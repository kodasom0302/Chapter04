package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {
		
		ArrayList<Point> pList=new ArrayList<Point>();
		
		Point p01=new Point(2,2);
		Point p02=new Point(3,3);
		Point p03=new Point(4,4);
		
		pList.add(p01);	//Point(2,2)가 아닌 주소(p01)를 넘긴 것
		pList.add(p02);
		pList.add(p03);
		pList.add(p01);
		
		System.out.println("size: "+pList.size());
		
		//변수로 y값 구하기
		System.out.println(p01.getY());
		/*
		//리스트를 통해서 y값 구하기
		Point var01=pList.get(0);
		var01.getY();
		*/
		
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		
		System.out.println("--------------------------------");
		
		//전체 출력
		for (int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("-------------------------------------");
		
		pList.remove(0);
		for (int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("-------------------------------------");
		
		pList.remove(p02);
		for (int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println(pList.toString());

	}

}
