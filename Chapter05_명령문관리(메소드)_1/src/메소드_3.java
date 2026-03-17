/*
 * 
 * 
 *  int total = kor+eng+math;
 *  --------------------------> 메소드 화
 *  
 *  static int totalScore (int kor, int eng, int math)
 *  {
 *     return kor+eng+math;
 *  }
 *  
 *  => int total=totalScore(90,90,90)
 *   
 *   리턴형이 void가 아닐경우 => return 값으로 처리
 *   리턴형이 void일 경우 => 메소드 자체 처리
 *  
 *  
 *  프로그램
 *     => 벤치마킹
 *     => 메소드 : 기능 설정==> 기능에 들어가 있는 데이터 추출
 *     
 *     ------------------------------------------
 *     *****유지 보수 : 메소드 기능 변경*****
 *     
 *     static int method(int a, int b)
 *     {
 *        return a+b;
 *     }
 *     
 *     int add=method(10,20);
 *              ------------ >호출
 *              1. 10=> a
 *              2. 20=> b
 *              3. { 안으로 진입 => return값을 add 에 전송}
 *    
 *    매개변수 / 지역변수
 *    
 *    
 *    메소드
 *      1. 형식
 *         리턴형 / 매개변수 / 메소드명
 *         
 *      2. 호출
 *         메소드명(실제값) => 매개변수가 있는 경우
 *         메소드명() => 매개변수가 없는 상태
 *         
 *      3. 메소드 안에서 선언된 지역변수에게 생명 주기
 *      
 *      4. 저장위치
 *         methodarea => 메소드 저장
 *         stack => 매개변수, 지역변수
 *         heap => 멤버변수 => 클래스 영역에 선언
 *      5. 목적
 *         1) 재사용 : 다른 클래스 연결
 *                  다른 클래스에서 지정한 메소드를 같은 패키지 안에 있으면 불러올 수 있음
 *         2) 반복 제거 : 공통 모듈
 *         3) 유지 보수에 용이함 : 수정/추가
 *         4) 기능별로 나눠서 작업 : 분리 => 한 번에 여러 명이 동시에 작업할 수 있음
 *         5) 가독성이 좋음 => 에러 수정에 용이
 *      
 *                 자바는 객체 지향 프로그램이므로
 *                 메소드/변수를 잘 알아야함
 */
public class 메소드_3 {
	
	static void display()
	{
		System.out.println("display() 진입...");
		System.out.println("기능 처리");
		System.out.println("display() 종료");
	}
	
	static void increment()
	{
		int a=10;
		System.out.println("a="+a);
		a++;
	}
	
	/*
	 *  increment(); a=10
	 *  increment(); a=10
	 *  increment(); a=10
	 *  
	 *  왜냐하면 a는 지역변수기 때문에 블럭 밖에서는 초기화 된다
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        display();
        display();
        display();
        display();
        display();
        
	}

}
