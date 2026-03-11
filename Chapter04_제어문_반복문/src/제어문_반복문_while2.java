/* 
 *   1. while 
 *      사용자가 구구단 => 단을 입력하면 
 *      해당 단을 출력 
 *      -------------------------
 *      변수 => 사용자가 입력한 단이 필요
 *             -------------------
 *             루프변수 : 1~9
 *      
 */
import java.util.Scanner; // 사용자가 입력이 있는 경우 
/*
 *   nextInt() =====> 정수 입력 
 *   nextDouble() ====> 실수 입력 
 *   next()  =====> 문자열 입력 ==> 공백이 있는 경우 
 *   nextLine() ====> 문자열 ===> 공백 포함 
 *   ---------------- 문법 
 *   
 */
public class 제어문_반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("원하는 단입력?");
        int dan=scan.nextInt(); // 사용자 요청변수 
        // 1.사용자 요청한 데이터 저장 
        // 2. 요구사항 출력 === 처리 
        int i=1; // 1~9까지 변경되는 변수 : 루프(반복문)
        // 출력 
        while(i<=9)
        {
        	System.out.printf("%d * %d = %2d\n",
        			dan,i,dan*i);
        	// 출력하는 형식을 만든다 
        	// => 명령프롬프트 사용 
        	// 100,000
        	i++; // 9가 될때까지 수행 
        }
        
        
        
	}

}
