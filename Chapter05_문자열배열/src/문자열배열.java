/*
 *  배열 : 여러개의 같은 데이터형을 모아서 쉽게 관리
 *       => 관리가 쉽다 / 고정적이다 => 한번 변경이 불가능
 *   1. 배열 선언
 *      => 데이터형[] 배열명;
 *      
 *   2. 배열 초기화
 *      => 선언과 동시에 초기화
 *        => 명시적 초기화 : 미리 값을 알고 있는 경우
 *        int[] arr={1,2,3,4,5};  
 *        String[] names={"홍길동", "심청이, "이순신", "김두한"}; : 
 *        => 값을 모르는 경우
 *           1) 파일 읽기
 *           2) DB 읽기*****
 *           3) 크롤링*****
 *           4) random
 *           5) 입력
 *        
 *   3. 배열 출력
 *      => for문 : 인덱스 번호 이용
 *      => 향상된 for문 : 배열에 들어있는 데이터값 이용
 *      => Arrays.toString
 *      
 *   4. 배열 데이터 변경
 *      => 반드시 인덱스 번호 이용
 *      
 *   5. 배열 특징
 *      => 변수 : 한 개의 데이터만 저장
 *      => 배열 : 변수를 여러 개 묶어서 한 번에 저장하는 공간 설정 
 *              > 데이터 관리는 쉬움 (인덱스 번호)
 *              > 같은 데이터 형만 묶을 수 있다 ** (클래스는 다른 데이터도 묶을 수 있음)
 *      => 배열명은 stack에 저장
 *         실제 데이터는 heap에 저장
 *         int[] arr = {1,2,3,4,5};
 *         ---arr---   -----------
 *                      1 2 3 4 5
 *         ---------   -----------
 */
import java.util.Arrays;
public class 문자열배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 반복문 사용이 안됨 => 변수명이 1개가 아니어서
		String hong="홍길동";
        String shim="심청이";
        String kim="김두한";
        String lee="이순신";
        String kang="강감찬";
        
        System.out.println(hong);
        System.out.println(shim);
        System.out.println(kim);
        System.out.println(lee);
        System.out.println(kang);
        
        
        //2. 묶어서 일반for문으로 출력해보자
        String[] names= {hong,shim,kim,lee,kang};
        for(int i=0;i<names.length;i++)
        {
        	System.out.println(names[i]);
        }
        //3. 인덱스보단 실제 데이터로 출력해보자(향상된for문)
        for(String name:names)
        {
        	System.out.println(name);
        }
        //4. 라이브러리로 출력
       System.out.println(Arrays.toString(names));
        //5. 변경 -> 인덱스 이용해서 변경
       names[0]="박문수";
       
       System.out.println(Arrays.toString(names));
       //-------------------------------------------------------------------------------------
	}

}
