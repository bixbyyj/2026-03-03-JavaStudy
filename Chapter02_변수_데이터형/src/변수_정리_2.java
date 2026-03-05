/*
 * 
 * 출력 형식
 * System.out.print(); => 가로 출력 (inline)
 * System.out.println();=> 세로 출력 (block)
 * System.out.printf(); => 서식이 있는 경우
 * 
 * 
 * 선언 방식
 * 선언과 동시에 초기값 데이터형 변수명 = 값
 * 선언만 데이터형 변수;
 * 
 * 초기값
 * 입력 / 윈도우 / 랜덤 / 명시적
 * 
 * 연산처리
 *   => 산술 +, -, *, /, %, &, |, ^, <<, >>
     => 단항 ++(하나 증가), --(하나 감소), 형변환, 부정 연산자 !(not)
     => 논리 &&(and) ||(or)
     => 비교 ==(같다), !=(같지 않다), <, >, <=, >=
     => 대입 =, +=, -=, *=, op=
     
   제어문
     => 조건문
     => 반복문
     => 선택문
     => 반복제어문
 *
 */

public class 변수_정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // System.out.print("국어 영어 수학\n");
       // System.out.print("80  80  80");
		
		/*
		 * System.out.println("Hello"); System.out.println("Java");
		 */
		// %d=> 정수 %s=> 문자열 %c=> 문자 %f => 실수 %n = 줄바꿈
		//System.out.printf("%-3d%-3d%-3d%n", 90, 90 , 90);
		int num=2147483647;
		num++;
		System.out.println(num);
	}

}
