/*
 *  객체의 생명주기
 *    
 *    설계 : class{} === 변수의 초기화 === 메모리 저장 === 활용 ========= 소멸
 *         변수/메소드     static/생성자    new        객체.메소드      객체=null / System.gc
 *                                                객체.변수명
 *   변수의 초기화
 *      생성자 : 다른 값을 설정하고 싶을 때 사용
 *           : 클래스 명과 동일
 *           
 *           class A
 *           {
 *              A(){} => 기본 생성자
 *              A(int a){}
 *              --------- 여러개의 생성자를 만들 수 있다
 *           }
 *           
 *           class B
 *           {
 *              B(int b){} => 자동으로 기본생성자는 생성되지 않음
 *           }
 *           
 *           class B
 *           {
 *             // 자동으로 B(){} => 자동으로 생성되는건 기본 생성자
 *           }  
 * 
 */
// 가급적이면 클래스 하나당 파일 1개 만드는게 좋음
class Member implements Cloneable
{
	int a;
	Member()
	{
		a=100;
		System.out.println("Member 생성자 호출 : a= "+a);
	}
	void display()
	{
		System.out.println("객체 활용");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	protected void finalize() throws Throwable { //<<finalize 호출되면 자동으로 객체 소멸
		// TODO Auto-generated method stub
		System.out.println("객체 소멸...");
	}
	
}

public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성 => 생성자 이용
		Member m=new Member();
		// 활용
		m.display();
		// 소멸
		m=null;
	    System.gc();
	}

}
