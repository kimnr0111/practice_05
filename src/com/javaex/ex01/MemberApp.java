package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member info1 = new Member();
		
		info1.setName("정우성");
		info1.setId("jws");
		info1.setPoint(50000);
		
		Member info2 = new Member();
		
		info2.setName("유재석");
		info2.setId("yjs");
		info2.setPoint(30000);
		
		Member info3 = new Member();
		
		info3.setName("이효리");
		info3.setId("lhr");
		info3.setPoint(40000);

		info1.showInfo();
		info2.showInfo();
		info3.showInfo();
	}

}
