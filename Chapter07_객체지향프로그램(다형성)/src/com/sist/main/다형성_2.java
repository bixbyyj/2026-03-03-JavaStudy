package com.sist.main;

/*
 * 
 * 1. 오버라이딩/오버로딩
 *  
 *  오버라이딩(재정의) : 메소드 동일
 *  오버로딩 : 리턴형/접근지정어 관계 없음
 *           메소드명 동일 / 매변수가 다른 경우
 *           
 *           final 변수 : 상수
 *           final 메소드 : 오버라이딩 안됨
 *           final class : 상속 안됨
 * 
 * 2. 형변환 : 클래스는 반드시 상속이 있거나 포함이 되어 있는 상태에서만 가능
 *           클래스 크기를 잴 수 있다
 *           
 *           업캐스팅
 *           => 자동형변환
 *           부모 = new 자식
 *           
 *           다운캐스팅
 *           => 강제형변환
 *           class A
 *           
 *           class B extends A
 *           
 *           A a = new B()  <= 자동형변환
 *           B b = (B)new A() <= 강제형변환
 * 
 */

class A
{
	
}

class B extends A
{
	
}

class C extends A
{

}

class D extends A
{
	
}
public class 다형성_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상속 : 재사용, 관련된 클래스를 모아서 관리
		// 웹에 자주 등장 => 메모리 절약 위해서
        A a=new A();
        B b=new B();
        
        A c=new B();
        c=new C();
        c=new D();
        
        
    
        
	}

}
