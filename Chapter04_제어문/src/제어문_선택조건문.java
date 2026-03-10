/*
 *     선택조건문 => true 처리 / false 처리  
 *     형식 
 *        if(조건문)
 *        {
 *           조건 true 일때 처리 
 *        }
 *        else
 *        {
 *           조건 false일때 처리 
 *        }
 *        
 *      => 프로그램에서는 가장 많이 사용되는 문장 
 *      
 *      else문장은 바로 위에 있는 if문장만 제어 
 *      
 *      if()
 *      {
 *      }
 *      -----------------
 *      댓글이 없습니다 
 *      if()
 *      {
 *      }
 *      else
 *      {
 *      }
 *      
 *      => else문장은 단독으로 사용할 수 없다 => if문을 동반 
 *      
 *      
 */
import java.util.Scanner;
// 숫자 2개 입력 => 최대값 / 최소값 
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("첫번째 정수 입력:");
        int num1=scan.nextInt();
        
        System.out.print("두번째 정수 입력:");
        int num2=scan.nextInt();
        
        int num3=num1>num2?num1:num2;
        
        if(num3==num1)
        {
        	System.out.println("최대값:"+num1);
        	System.out.println("최소값:"+num2);
        }
        else
        {
        	System.out.println("최대값:"+num2);
        	System.out.println("최소값:"+num1);
        }
        
	}

}






