/*
 *  1. 저장 => 메모리 저장 구조
 *      => MethodArea
 *         : 정적 변수(static)=클래스 변수 / 메소드 정보
 *         : 생성시점에 컴파일러에 의해 자동 메모리 저장
 *         : new 없이 사용이 가능 / 프로그램 종료 시까지 유지
 *         : 클래스명.변수명/클래스명.메소드 ex) Math.Random()
 *      => Stack
 *         : 지역변수 / 매개변수 저장
 *         : 메소드 호출하면 생성, 메소드 종료하면 소멸
 *         : {} 사이에만 존재
 *      => Heap
 *         : 실제 데이터가 저장되는 공간
 *         : new 로 사용 가능( Scanner, Random r=new Random();)
 *         : 사용하지 않거나 null인 경우 GC(Garbage Collector)에 의해 해제
 *            
 *         
 *  2. 멤버 변수
 *      => 정적 변수 : static
 *      => 인스턴스 변수 : new 사용시 마다 메모리 따로 생성
 *  3. 객체지향 프로그램의 4대 특성
 *      => 캡슐화 
 *      => 상속
 *      => 다형성
 *      => 추상화
 *  4. 상속 / 클래스의 종류
 *  5. 예외처리
 *  6. 라이브러리
 *          
 *          변수
 *            => 기본값
 *               int a;
 *            => 명시적 초기값
 *               int a=100;
 *            => static 블록 : 인스턴스 변수는 사용이 불가능 / static 변수만 사용 가능
 *               static
 *                 {
 *                    구현
 *                 }
 *            => 인스턴스 블록
 *                 {
 *                    구현
 *                 }   
 *          
 *          생성자
 */
import java.io.*;
class Sawon{
	int sabun=100;
	String name="홍길동";
	String dept="개발부";
	String job="사원";
	String loc="서울";
	
    static String company="SIST";
	// 초기화 블록
	{
		/*
		 * sabun=200; String name="심청이"; String dept="총무부"; String job="대리"; String
		 * loc="부산";
		
		 */
		
		try
		{
			FileReader in=
					new FileReader("C:\\javaDev\\sawon.txt");
			int i=0;
			String result="";
			while((i=in.read())!=-1)
			{
				result+=(char)i;
			}
			in.close();
			String[] info=result.split("\\|");
			sabun=Integer.parseInt(info[0]);
			/*
			 * 1. 문자열을 다른 데이터형을 변형
			 *    1) String -> int
			 *        Integer.parseInt("10") => 10
			 *    2) String -> double
			 *        Double.parseDouble("10.0") => 10.0
			 *    3) String -> boolean
			 *        Boolean.parseBoolean("true") => true
			 */
			name=info[1];
			dept=info[2];
			job=info[3];
			loc=info[4];
			
			// 직접 에러 처리
			// throws는 간접 처리 / 에러 예약 => 다음 사용 시에 예외 처리
			// => 자바 : 예외처리를 반드시 한다 / 생략이 가능
		}catch(Exception ex) {}
		
		company="쌍용 강북"; // 인스턴스블록
		
	}
	
	//정적 블록 
	//이 영역은
	static
	{
	    company="SIST 쌍용";
	    
	}
	
	// ********동작 순서  : 기본값 => 명시적 초기화 값 => static 블럭 => 인스턴스 블럭 => 생성자*************
	//                             | 현재는 홍길동                  
}

public class 생성자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		
		System.out.println("데이터 저장된 위치 : "+s1);
		System.out.println("사번 :" +s1.sabun);
		System.out.println("이름 :" +s1.name);
		System.out.println("부서 :" +s1.dept);
		System.out.println("직급 :" +s1.job);
		System.out.println("지역 :" +s1.loc);
		System.out.println("회사명 :"+s1.company);
		

	}

}
