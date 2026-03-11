/*
 * 반복문의 종류
 *  1. for 
 *      화면 출력 (UI) => 반복 횟수가 정해진 경우
 *      
 *  2. while
 *      데이터베이스 / 네트워크 => 반복 횟수가 없는 경우
 *      
 *  3. do while
 *      게임 => 반복 횟수는 없고 반드시 한 번 이상은 수행
 *  ----------------------
 * 반복 제어
 *  1. break
 *      반복 중단
 *  2. continue
 *      특정 부분 제외할 때 주로 사용
 * 
 * 
 */
public class 반복문_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 출력 => 반복 횟수 지정 => for가 제일 적합함
		/*
		 * System.out.print(1); System.out.print(2); System.out.print(3);
		 * System.out.print(4); System.out.print(5); System.out.print(6);
		 * System.out.print(7); System.out.print(8); System.out.print(9);
		 * System.out.print(10);
		 */
		/*
		 * 1. 형식
		 *    for(초기값;조건식;증가식)
		 *    {
		 *       반복 실행 문장
		 *    }
		 *    
		 * 2. 실행순서
		 *    1) 초기값
		 *    2) 조건식  <----------------------- char, int 형식만 가능
		 *    
		 *           = true ==> 3) 반복 수행문장 수행 ==> 4) 증가식
		 *           = flase => 종료
		 * 
		 * 3. 
		 *     int i=1;
		 *     i<=10   <= true => 문장수행
		 *     i++     <= false => 종류
		 */
		/*
		 * for (int i=1; i<=10; i+=2) { System.out.println(i); }
		 */
		
		/*
		 * for(char i='A';i<='Z';i++) System.out.print(i);
		 */
	    	
	    	
	    
	}
	

}
