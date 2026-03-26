package com.sist.exception;

import java.lang.reflect.Method;
import java.util.Scanner;

/*   에러가 나는 경우
 *     => 컴파일시 에러 / **실행시 에러** => JavaScript 연동 됐을 때
 *         javac         java
 *     => 1. 사용자 입력 => 유효성 검사 : if 부터 <<< 
 *        2. 개발자 실수 : 그래서 예외처리를 씀
 *        ----------------- 수정이 가능 : 예외
 *        3. 생각하지 못한 에러
 *        ----------------- 에러 
 *        
 * 
 *   예외처리
 *     => 소스 상에서 수정이 가능한 에러
 *   예외처리 범위 (상속도)
 *   
 *   Object
 *     |
 *   Throwable : 예외 처리의 최상위
 *     |                                                                        | 
 *  Exception : 예외                                                           Error : 에러
 *     |
 *  CheckException   
 *    
 *  IOException : 입출력 = 메모리 system.out/system.in
 *                       네트워크
 *                       파일
 *  ClassNotFoundException : 리플렉션 = 클래스 정보를 읽어서 new없이 메모리 할당이 가능
 *                                메모리 할당
 *                                메소드 호출
 *                                변수값 지정
 *  MalformedURLException : URL 주소
 *  InterruptedException : 쓰레드 충돌
 *  SQLException
 *  --------------------------------------------- => 위에 있는 것들은 무조건 예외처리
 *  
 *     |
 * UnCheckExceptoin
 *     |
 *  RuntimeException
 *     |
 *  ArrayIndexOutOfBoundsException : 배열 범위 초과
 *  NullPointerException : 객체가 null 값인 경우
 *  ClassCastException : 형변환 에러
 *  NumberFormatException : 숫자 변환 안되는 경우
 *  ArithmaticException : 0으로 나누는 경우
 *  --------------------------------------------- => 한개씩만 처리할 수 있음
 *  
 *  2. 예외처리 방법
 *    1) 직접 처리 => 에러 복구
 *        try~catch~finally : 가장 많이 사용 됨
 *        try
 *        {
 *         // 정상으로 수행하는 문장
 *         // 일반 처리 문장
 *         ** 개발자가 에러날 걸 예상해야 함 **
 *         
 *        }catch(예외처리 클래스)
 *        {
 *        }
 *        catch(예외처리 클래스)
 *        {
 *        }
 *        .
 *        .
 *        .
 *        finally => 무조건 실행
 *        {
 *        }
 *    2) 간접 처리
 *        에러 회피 throws : 선언만 해서 메소드 호출시에 사용/소스가 완성 된 상태
 *    3) 임의 발생 : 테스트용 임의 에러   
 *    4) 사용자 정의 : 
 *        class My extends Exception
 *        {
 *        }
 *        =>throw 를 이용해서 호출 
 *       
 *  ----------------------------------------------
 *   
 *                                 
 */

class MyException
{
	public void aaa()
	{
		System.out.println("MyException:aaa() Call");
	}
	public void bbb()
	{
		System.out.println("MyException:bbb() Call");
	}
	public void ccc()
	{
		System.out.println("MyException:ccc() Call");
	}
}
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Scanner scan=new Scanner(System.in);
        	System.out.println("입력 : aaa,bbb,ccc>>");
        	String m=scan.next();
        	Class className=
        			Class.forName("com.sist.exception.Myexception");
        	Object obj=
        	className.getDeclaredConstructor().newInstance();
        	// new Myexception()
        	Method[] methods=className.getDeclaredMethods();
        	for(Method mm:methods)
        	{
        		if(mm.getName().endsWith(m))
        		{
        			mm.invoke(obj, null);
        		}
        	}
        }catch(Exception ex) {}
	}

}
