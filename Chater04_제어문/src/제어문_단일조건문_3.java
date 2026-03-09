/*
 * 
 * Math.random() => 0.0~0.99
 */
import java.util.Random; //이미 만들어진 클래스를 가지고 온다
public class 제어문_단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random r=new Random();
        // new => 동적메모리 할당 => heap 영역에 저장 => 클래스를 저장할 때 사용
        // 객체 지향
        int num1=r.nextInt(100)+1;
        // 0~99 +1 => 1~100
        int num2=r.nextInt(100)+1;
        int num3=r.nextInt(100)+1;
        /* 
         *  변수 => 반드시 초기값 설정
         *  초기값
         *   1. 명시적초기값
         *       ex) int a=10;
         *   2. 입력 초기값
         *       ex) scanner
         *   3. 컴퓨터가 임의로 설정
         *       ex) random
         *   4. 파일 읽기/오라클 읽기
         *   */
        System.out.println(num1+","+num2+","+num3);
        
        int max=num1;
        if (max<num2)
        	 max=num2;
        if (max<num3)
        	 max=num3;
        
        System.out.println(max+"(이)가 최댓값입니다.");
        
        int min=num1;
        if (min>num2)
        	 min=num2;
        if (min>num3)
        	 min=num3;
        
        System.out.println(min+"(이)가 최솟값입니다.");
        
        int mid=num1+num2+num3-min-max;
        
        System.out.println(mid+"(이)가 중간값입니다.");
        
        
	}

}
