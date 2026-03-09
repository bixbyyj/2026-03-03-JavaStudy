/*
 *    산출물
 *    1. 형식   ==> 벤치마킹
 *    2. 결과값 ==> 출력물 (와이어프레임)
 *    3. 흐름   ==> 유스케이스 다이어그램 , 클래스 다이어그램 , 시퀀스 다이어그램 
 *    4. 순서도 ==> 플로우차트 
 *    ----------
 *    ERD => 구현 => 웹 사이트 
 *           -------------- (X)
 *    형식) 
 *         if(조건문) : 부정 / 비교 / 논리  ==> 단독 => 산술 
 *         {
 *            조건이 true일때 수행 
 *         }
 *         else
 *         {
 *            조건이 false일때 수행 
 *         }
 *         
 *         두개 처리 => 짝수/홀수 , 대문자/소문자 .....
 */
// => 3개의 점수를 받아서 평균 => 60이하 탈락 / 합격 
/*
 *   활용 연산자 
 *   --------
 *    증감연산자 ==> 반복문 
 *    산술연산자 ==> 단독 
 *    ---------
 *    비교연산자
 *    논리연산자
 *    부정연산자
 *    --------- 조건문 , 반복문 
 *    대입연산자 
 *    --------- 단독 : 결과값 받기 
 */
import java.util.Scanner;
public class 제어문_선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        System.out.print("국어 점수 입력:");
        int kor=scan.nextInt();
        
        System.out.print("영어 점수 입력:");
        int eng=scan.nextInt();
        
        System.out.print("수학 점수 입력:");
        int math=scan.nextInt();
        
        // 평균 
        int avg=(kor+eng+math)/3;
        // avg>=60?"합격":"불합격"
        if(avg>=60)
        {
        	System.out.println("합격");
        }
        else
        {
        	System.out.println("불합격");
        }
        
	}

}
