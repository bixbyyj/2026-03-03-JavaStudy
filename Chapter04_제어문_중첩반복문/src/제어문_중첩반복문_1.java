/*
 * 중첩
 * 
 *   if (조건문1) ex) 로그인 됐는데
 *      {
 *         if(조건문2) ex) 아이디가 관리자라면
 *          {
 *          }
 *      }                         => if (조건문1 && 조건문2)
 *      
 *      -------------------------------------
 *      
 *      for (초기값;조건식;증가식)
 *         {
 *             반복 수행 문장
 *         }    
 *         
 *         ****
 *         ****
 *         ****
 *         ****
 *         ****  => 세로 5 가로 4
 *         
 *         ex) 구구단
 *              2*1 3*1   
 *              ... ...
 *              ... ...
 *              2*9 3*9  => 세로 9줄 가로 8행
 */
public class 제어문_중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 구구단 출력
		
		for (int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%d * %d = %2d\t",j,i,j*i);
				// \t => \tab(일정 간격 유지)
				
			
			}
			System.out.println(); // n단을 쓰고 엔터를 눌러주는 역할
		}
	}

}
