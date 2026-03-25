/*
 *  인터페이스 : 추상 메소드의 일종 (다중 상속이 안되는 단점 보완)
 *  1. 메소드를 정해둔다
 *     => 모든 개발자가 동일한 메소드(기능)를 구현
 *     
 *  2. 인터페이스 사용할 때
 *     1) 이미 어떤 걸 구현해야 하는지 알고 있을 때
 *     2) 여러 개발자가 동시에 개발 가능
 *     3) 내부 구현이 변경되어도 메소드는 그대로 유지
 *     4) 유지보수가 편리하다
 *     5) 표준화가 가능하다 : 가독성/유지보수
 *     6) 결합도가 낮다 : 수정 시 다른 클래스에 영향이 가지 않음
 *     7) 소스의 통일화 : 분석 가능
 *     8) 서로 다른 클래스를 연결해서 사용 가능 => 리모콘처럼 작동
 *     9) 관련된 클래스를 한 개의 이름으로 제어할 수 있음     
 *     10) 독립적으로 사용 가능
 *     
 *     
 * --------------------------------------
 *     인터페이스           클래스
 *     기능 설정            구현
 *    메소드 선언          메소드 구현
 *     상속(다중)           단일
 *    implements         extends
 *    
 *  interface=>         class=>class
 *     interface
 *   
 *  interface=>
 *       class
 *       
 *  interface A          class A extends B
 *  interface B 
 *       extends A
 *  interface C
 *       extends B
 *   
 *   interface C
 *       extends A,B
 *                             
 * 3. 구성 요소
 * 
 * public interface InterfaceName
 * 
 * 변수 식별자와 동일 / 첫자는 대문자
 * 
 * {
 * -----------------------------
 * 변수 : 상수형 변수만 저장
 * 
 * int a=10; => 반드시 값을 지정 해야함
 * 
 * 기본형 : public static final(자동첨부)
 * -----------------------------
 * 선언된 메소드 : 추상메소드
 * 공통으로 구현 해야하는 부분을 설정
 * ex) 회원가입 시
 *      아이디 중복 체크
 *      비밀번호 규칙 적용
 *      우편번호 검색
 *      이메일 중복 체크
 *      전화번호 중복 체크
 * 
 * void display(); <<괄호 안은 상속 받은 쪽에서 채우면 됨
 * 
 * 기본형 : public abstract(자동첨부)
 * -----------------------------
 * 구현된 메소드 default : 최근에 추가된 기능
 * 
 * 기본형 : public default 리턴형 메소드(매개변수)
 *               {
 *               
 *               }
 * 
 * -----------------------------
 * static
 * -----------------------------
 * }
 * 
 * 4. 사용처
 *   1) 윈도우의 이벤트 처리
 *       JButton / JTextField / Mouse Click . . .
 *       => interface
 *   2) 결합성이 낮은 프로그램 (Spring)
 *   3) 여러 개 있는 경우 
 *       데이터베이스 / 파일 / 네트워크
 * 
 * 
 * vs 추상클래스 : 둘 다 객체 생성이 안됨 (new (x) )
 *              => 상속해서 자식 쪽에서 구현해야함.
 * 
 * 인터페이스 : 무엇을 해야할 지 알려주기만 함
 * 추상클래스 : 기본은 만들어져있음 나머지는 구현해야함
 * 
 *               인터페이스          추상클래스
 * ---------------------------------------
 * 개념           설계 중심          기본+규칙
 *               규칙             (재사용 중심)
 * ---------------------------------------
 * 구현           거의 없음         실제구현+구현없음
 *              (선언만)
 * ---------------------------------------
 * 상속           다중 상속          단일 상속
 *              implements        extends
 * ---------------------------------------
 * 사용 목적       강제성 o          공통기능 재사용
 *              수정이 유연함
 * ---------------------------------------
 *              개발시간 단축
 *              소스가 통일화 됨
 *           => 그래서 주로 사용함
 * ---------------------------------------
 * 
 *  ** 인터페이스도 구현된 메소드가 가능함
 *             1. default 메소드 
 *             2. static 메소드
 *             
 *  *** 인터페이스는 모든 요소가 public
 *               변수는 상수형만 사용 가능 = 반드시 초기값이 있어야함(final)           
 */
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.util.*;
interface I
{
	int a=10;
	// public static final << 자동으로 자바에서 변수에 첨부해줌
	void display();
	// public abstract << 자동으로 자바에서 메소드에 첨부해줌
	default void aaa() {}
	// public << 자동으로 자바에서 메소드에 첨부해줌
}

interface II
{
	void display();	
	default void aaa() {} 
}

class A implements II
{
	public void display() {} // < public을 빼면 오류가 남 why? 접근지정어는 상속받아야하니까
}

class B implements II
{
	public void display() {} // < public을 빼면 오류가 남 why? 접근지정어는 상속받아야하니까
	public void aaa() {} // < 필요한 위치에서 부모 interface의 default를 오버라이드(재정의) 해올 수 있음
}

class C implements II
{
	public void display() {} // < public을 빼면 오류가 남 why? 접근지정어는 상속받아야하니까
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list=new LinkedList<String>();
        list.add("홍길동");
        list.add("이순신");
        list.add("심청이");
        
        for (String name:list)
        {
        	System.out.println(name);
        }
        
	} 

}
