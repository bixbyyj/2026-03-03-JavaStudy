/*
 *   1. 배열 선언
 *   2. 배열 초기화
 *   3. 반복문을 이용한 데이터 출력
 *   4. 배열 복사
 *   5. 동적 생성
 *   
 *   1) 선언
 *      데이터형[] 배열명; 권장사항
 *      데이터형 배열명[]; c언어 호환
 *      
 *      => 정수
 *         int[] arr
 *      => 문자
 *         char[] arr
 *      => 문자열
 *         String[] arr
 *      => 실수
 *         double[] arr
 *      => 논리
 *         boolean[] arr
 *   2) 몇 개?
 *      ex) 10, 20, 30, 40, 50
 *      
 *      int[] arr={10, 20, 30, 40, 50}; // 선언 + 초기화
 *      ==> 참조 변수
 *      stack      heap
 *                  0      1      2       3       4
 *      -arr-      ---------------------------------
 *      100        10      20    30       40      50
 *      -----     -----------------------------------
 *                arr[0]  arr[1] arr[2] arr[3]  arr[4]
 *                 arr[5] => 오류 발생
 *                          ArrayIndexOutOfBoundsException
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] arr= {10, 20}; System.out.println(arr[1]);
		 * 
		 * arr[0]=100; arr[1]=200;
		 * 
		 * System.out.println(arr[0]);
		 */
		int [] arr= {10, 20, 30, 40, 50};
		
		for (int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		for (int a:arr)
		{
			System.out.println(a);
		}
	}

}
