package com.ruby.codej;

public class TestRamdaCode {
	public static void main(String[] args) {
		
		System.out.println(useRamdaExcutor());
		
		System.out.println(useBaseExcutor());
	}
	
	
	public static int useRamdaExcutor(){
		RamdaTest rTest2 = (x,y)-> {return x + y;};
		
		return rTest2.test(3, 54);
	}
	
	public static int useBaseExcutor(){
		
		//전통적인 익명 클래스 인스턴스화
		RamdaTest rTest = new RamdaTest() {
			
			@Override
			public int test(int x, int y) {
				return x+y;
			}
		};
		
		return rTest.test(3, 54);
		
	}
}
