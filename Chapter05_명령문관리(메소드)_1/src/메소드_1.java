/*
 * 프로그램
 *  => 데이터 저장 : 관리 (묶어서 관리 => 배열)
 *  => 명령문 : 명령어 모아서 관리 => 메소드
 *  ----------------------------------- 두 가지를 합쳐서 만드는게 객체지향 프로그램
 *  기능별 분리
 *  
 *    1. 선언부 : return형(처리 결과값 : 한 개만 사용이 가능 ** 데이터가 많으면 배열이나 클래스 사용) + 메소드명(사용자 입력값) (매개변수)
 *                    
 *    2. 구현부 : { 블럭과 블럭 사이 } 
 *    
 *     => 메소드 : 입력 받아서 처리하고 결과 반환하는 가상적인 상자와 같다
 *     
 *     int sum = add (25, 47); => 25와 47이 인수
 *     
 *     int add ( int x, int y)  => int x, int y가 매개변수
 *     {
 *        return x+y;  => x+y; 가 반환값 => 이번 경우에는 다시 sum으로 돌려준다
 *     }   
 *    
 *    
 *    1) 난수 발생 (1~100)
 *    2) 난수 맞추기
 *         입력
 *         비교
 *    3) 힌트 주기
 *    4) 종료 
 *    
 *    메소드의 목적 : 기능 세분화를 통해 재사용/가독성 증대
 * 
 */
import java.util.*;
public class 메소드_1 {
	
	static int rand()
	{
		  int com=(int)(Math.random()*100)+1;  // 1~100 까지 난수
		  return com;
	}

	static int input()
	{
		Scanner scan=new Scanner(System.in);
		
			while(true)
		      {
		    	  System.out.print("1부터 100 사이의 정수를 입력하세요 : ");
		    	  int user=scan.nextInt();
		    	  
		    	  if (user<1 || user>100)
		    	  {
		    		  System.out.println("잘못된 입력입니다.");
		    		  continue;
		    	  }
		    	  return user;
		      }
	}
	
	static void compare (int com, int user)
	{
		
      Scanner scan=new Scanner(System.in);
      //비교
	  if (com<user)
  	  {
  		  System.err.println("입력값보다 작은 수를 입력하세요.");
  	  }
  	  else if (com>user)
  	  {
  		  System.err.println("입력값 보다 큰 수를 입력하세요");
  	  }
  	  else
  	  {
  		  System.out.println("Gameover!");
  		  System.out.print("게임을 다시 할까요?(y/n): ");
  		  char c=scan.next().charAt(0);
  		  if (c=='y'||c=='Y')
  		  {
  			  System.out.println("새로운 게임을 시작합니다.");
  			  process();
  		  }
  		  else
  		  {
  			  System.out.println("Gameover!");
  			 System.exit(0);; //=> 프로그램 자체 종료
  		  }
  		 
  	  }
	}
	static void process()
	{
		int com=rand(); //rand 메소드 안에 난수를 넣어뒀음
		while(true)
		{
			int user=input(); // user 메소드 안에 입력값 과정을 넣어뒀음
			compare(com, user); // compare 메소드 안에 비교하는 메소드를 넣어둠
		}
	}
	public static void main(String[] args) {
		process();
		// TODO Auto-generated method stub
     /* Scanner scan=new Scanner(System.in);
      int com=(int)(Math.random()*100)+1;  // 1~100 까지 난수
      
      while(true)
      {
    	  System.out.print("1부터 100 사이의 정수를 입력하세요 : ");
    	  int user=scan.nextInt();
    	  
    	  if (user<1 || user>100)
    	  {
    		  System.out.println("잘못된 입력입니다.");
    		  continue;
    	  }
    	  else if (com<user)
    	  {
    		  System.err.println("입력값보다 작은 수를 입력하세요.");
    	  }
    	  else if (com>user)
    	  {
    		  System.err.println("입력값 보다 큰 수를 입력하세요");
    	  }
    	  else
    	  {
    		  System.out.println("Gameover!");
    		  break; // while 구문 종료
    		  // system.exit(0) => 프로그램 자체 종료
    	  }
      }
	}*/

}
}
