package com.sist.inter;
/*
 *  기본
 *   => 클래스 : 설계 도구
 *   => 객체 : 실제로 만들어진 것
 *   => 인스턴스 : 객체가 만들어질 때 생기는 하나의 실체
 *      
 *          클래스 =============== 메모리
 *                   인스턴스화      --- 인스턴스 : 클래스를 통해서 만들어진 객체(메모리에 저장되면 인스턴스라고 함)
 *                                            모든 인스턴스는 객체지만 모든 객체는 인스턴스는 아니다
 *                                     |
 *                                   A a
 *                                   
 *   추상클래스의 단점을 보완 : 다중 상속을 가능하게 만들었음
 *   
 *   [접근지정어(public/default)][제어어(static/abstract/final)] class ClassName
 *   
 *   [접근지정어] interface InterfaceName
 *   {
 *      상수형 변수
 *      (public static final) int a=10; << 자동 포함
 *      
 *      new를 사용할 수 없다
 *      상속 받아서 구현한 클래스 이용
 *      
 *     }
 *     
 *     상속 
 *     interface ============= interface
 *               확장 : extends
 *               
 *     interface ============= class
 *              구현 : implements
 *      
 *       class  ============= interface
 *                 error
 *                 
 *    인터페이스 : 오버라이딩 프로그램
 *        오버라이딩 *** 접근 지정어 축소 금지 ***
 *        변수 제외하고 애매하면 public
 *        변수는 public private
 *              
 *   SRP : 단일 책임 => 하나의 클래스는 하나의 일만 하는 것
 *   OCP : 개방/폐쇄 => 기능 추가는 쉽게/기존 코드는 수정 없이
 *   LSP : 리스코프 치환 => 자식은 부모를 완벽히 대체함
 *   ISP : 인터페이스 분리 => 필요한 기능을 쪼개기
 *   DIP : 의존성 역전 => 구체적 클래스에 의존하지말고 추상적 인터페이스를 클래스로 구현시켜라
 *   
 */         
interface figure
{
	String COLOR="black";
	//(public static final)
	public void draw(); // 
	//public (abstract) void == (abstract) public void
	/*
	 *  abstract public void draw();
	 */
}

class line implements figure
{
	@Override
	public void draw()
	{
		System.out.println(COLOR+"를 이용해서 선을 그린다.");
	}
}

class square implements figure
{
	@Override
	public void draw()
	{
		System.out.println(COLOR+"를 이용해서 사각형을 그린다.");
	}
}

class tri implements figure
{
	@Override
	public void draw()
	{
		System.out.println(COLOR+"를 이용해서 삼각형을 그린다.");
	}
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        figure a=new line();
        a.draw();
        
        a=new square();
        a.draw();
        
        a=new tri();
        a.draw();
	}

}
