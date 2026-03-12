/*
 *    1. 몇 줄 출력 할거냐 => 1차 for
 *    2. 내용물이 몇개냐   => 2차 for
 *    3. 1차 종료 되어야 for 문 종료
 *    
 *    Label:
 *    for()
 *    {
 *       for()
 *       {
 *          if()
 *          {
 *             break Label; ==> 
 *          }
 *       }
 *    }
 *    
 *             break/continue => 자신의 반복문만 제어
 *             
 * 
 */
public class 제어문_중첩반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i=1;i<=3;i++)
        {
        	for(int j=1;j<=3;j++)
        	{ 
        		System.out.println("i="+i+" j="+j);
        		
        	}
        }
	}

}
