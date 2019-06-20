package com.biz.exec;

public class Exec_01 {
	
	/*
	 * 진입점 method
	 * 원칙 : 모든 프로젝트에 단 한개만 존재를 해야하는 method
	 * 하지만 eclipse 프로젝트 연습을 할때는
	 * 여러개의 진입점 method가 존재를 하기도 한다.
	 * 
	 * 프로젝트를 완성하고
	 * 배포를 하면
	 * 보통 1개의 파일로 묶어서 배포를 한다.
	 * 
	 * 일반사용자는 배포된 1개의 파일을 실행을 하는데
	 * 자바는 그 한개의 파일드 중에 진입점 method를 검색하여 호출하고 실행한다.
	 * 그러면 비로소 우리가 만든 프로젝트가 작동이 되기 시작한다
	 * 
	 * 이때 진입점 method를 찾아서 호출하고 실행하는 자바를
	 * 자바가상머신(JVM)이라고 한다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum =0 ;
		System.out.println(intNum);
		System.out.println("Exec_01");
	}

}
