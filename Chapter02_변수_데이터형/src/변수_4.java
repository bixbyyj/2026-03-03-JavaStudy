/*
 * RAM => 주소 (주소마다 데이터 저장)
 * 
 * 저장 크기
 * 1byte 2byte 4byte 8byte
 * 
 * 지역변수
 *  => stack 공간에 저장
 *  => {변수 선언} 단, 블럭이 종료가 되면 자동 해제
 *  *** 어떤 종료의 값을 저장할 지 미리 지정해야 된다
 *       ex) 학점 문자 'A' => 정수 65
 *       
 * 캐멀스타일
 * -------
 *    가독성 : fileName=> 헝가리안 스타일
 *    
 *    선언 + 초기값
 *    int   kor=90; => 90을 kor에 저장해라
 *    초기값이 없으면 오류
 *    
 *    
 * byte + byte는 int로 받아야함
 * ex
 * byte b1=10;
 * byte b2=20;
 * byte b3=b1+b2; <= 오류 int로 받아야함
 */
public class 변수_4 {
   
	 public static void main(String[] a) {
		 // TODO Auto-generated method stub
		char grade = 'A';
	    System.out.println(grade);
		 
		 
	 }
}
