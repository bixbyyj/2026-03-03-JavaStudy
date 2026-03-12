/*
 *  up down 게임
 * 
 */
import java.util.Random;
import java.util.Scanner;
public class 반복문_for_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner scan=new Scanner(System.in);
        
        Random r=new Random();
        int com=r.nextInt(100)+1;
         
        for(;;)
        {
        	System.out.println("1에서 100 사이의 정수를 입력하세요.");
        	int user=scan.nextInt();
        	if (user>100)
        	{
        		System.out.println("잘못된 입력값입니다.");
        		System.exit(0);
        	}
        	System.out.println("사용자가 입력한 값:"+user);       	
        	
        	
        	if (com>user)
        	{
        		System.out.println(com+", DOWN"+"\ngame OVER!!");
        		System.exit(0);
        	}
        	else if (com == user)
        	{
        		System.out.println("SAME");
        	}
        	else
        	{
        		System.out.println(com+", UP"+"\ncomputer lose");
        		
        	}
        }
        	
	}

}
