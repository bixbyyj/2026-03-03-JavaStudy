/*
 * 데이터 저장  ====== 데이터 가공 ====== 화면 출력
 *    |                 |              |
 *                   연산처리(연산자)    윈도우/도스
 *                   흐름제어(제어문)     브라우저
 *  
 *   
 *   한 개 저장 : 변수
 *              => 정수 byte short int long (작은 데이터=>큰 데이터는 자동 형변환, 반대 경우는 강제 형변환)    
 *              => 실수 float double
 *              => 논리 boolean
 *              => 문자 char (필요시에 정수로 변환 가능)
 *              => 문자열 String 
 *              
 *              byte<short<int<long<float<double
 *        초기화 : 최초 할당
 *             
 *   여러개 저장 : 배열 / 클래스
 *   
 *   
 *   
 *   
 *   연산자의 종류
 *   
 *     단항 : 피연산자 1개
 *        => 증감 연산자 ++, --
 *        => 부정 연산자 !
 *        => 비트 반전 연산자 ~
 *        => 형변환 연산자
 *     이항 : 피연산자 2개
 *        => 산술 연산자 +, -, *, /, %(나머지 연산자)
 *        => 비교 연산자 ==, !=, <, >, <=, >= 
 *        => 논리 연산자 &&(and), ||(or)
 *        => 대입 연산자 =, +=, -=, *=
 *        => 기타 연산자 <<(왼쪽 비트 이동), >>(오른쪽으로 비트 이동)
 *     삼항 : 피연산자 3개
 *        => (조건식)?(참일 때 값):(거짓일 때 값)
 *        단항>산술>비교>논리/비트>삼항>대입
 *   
 */
public class 연산자_종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("\"홍길동\"");
        System.out.println("Hello\n");
        System.out.println("Java\tOracle");
        
        
	}

}
