package com.sist.lambda;

import java.util.List;

/*
 *  람다 : 익명의 함수 => 블록을 통해서 값처럼 전달
 *  ----------------------------------
 *  1. 기본 문법
 *     () -> {실행문} : 실행문이 하나면 블록 생략 가능
 *     
 *     (a,b) -> {실행문} : 매개변수 자리에 데이터형 없이 변수명만 사용 가능
 *  
 *  2. 장점
 *     => 메소드명 생략 가능
 *     => 매개변수의 데이터형 생략
 *     => 리턴형의 생략
 *  
 *  3. 사용하는 목적
 *     => 코드가 짧고 간결함
 *     => 함수형 프로그래밍이 가능
 *     => 독립적으로 사용 가능 (메소드는 클래스 내에서 사용해야하지만 람다는 클래스 외에서도 선언 가능)
 *     
 *     **c언어랑 비슷해지는듯**
 *     
 *     기존 방식 : 익명 클래스 (extends, implements 없이 메소드 재정의가 가능)
 *     //Runnable => interface
 *     Runnable r=new Runnable(){
 *        public void run(){
 *           System.out.println("Hello");
 *        }
 *     
 *     }
 *     
 *     람다 방식
 *     Runnable r=()->System.out.println("Hello");
 *     
 *  4. 주의 사항
 *     => 람다는 반드시 인터페이스와 함께 사용
 *     => 추상메소드는 1개만 존재
 *     => default/static 처럼 구현된 메소드는 존재 가능
 */

@FunctionalInterface // 람다형이다 라고 공지
// 사용자 정의
// 라이브러리에서 제공하는 것이 많음
interface Calc
{
	public int calc(int a, int b); // 추상 메소드
	default void display() {
		System.out.println("aaa");
	}
	static void aaa()
	{
		System.out.println("bbb");
	}
}
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Runnable r=new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * System.out.println("쓰레드 구동"); } };
		 */
	//	Runnable r=()->System.out.println("쓰레드 구동!");
	//	new Thread(r).start();
		
		Calc add=(a,b)->a+b;
		//        메소드  리턴
		Calc minus=(a,b)->a-b;
		
		System.out.println(add.calc(100, 200));
		System.out.println(minus.calc(10, 20));

	}

}
