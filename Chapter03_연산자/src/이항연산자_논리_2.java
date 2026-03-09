/*
 * 논리연산자 : 조건문 (유효성 검사, 범위, 기간 확인 등..), 반복문
 * 조건 => 부정 / 논리/ 비교에 사용 가능
 * 
 * 1. ************중요 조건문 / 반복문
 * 
 * 2. 제어문 
 * 
 */

import java.util.Scanner;
public class 이항연산자_논리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력(0~100):");
		
		int score=scan.nextInt();
		
		String res=score>=0 && score<=100?"정상입력":"비정상입력";
		System.out.println("res:"+res);
		
	}

}
