package com.sist.inter;
import java.util.Scanner;
import java.util.Random;

interface Game{
	public void start();
}

class MoleGame implements Game
{
	@Override
	public void start()
	{
		Scanner scan=new Scanner(System.in);
		Random rand=new Random(); // 난수 발생 1~3 => 두더지가 나올 번호(랜덤)
		
		// 점수 계산 하기 위한 변수 초기화
		int score=0;
		
		//게임 => 5번 : 1~3 => 선택 입력해서 1~3번 중 두더지가 배정된 번호 맞추기
		System.out.println("^^ 두더지 게임 시작!");
		System.out.println("1~3 사이에 두더지가 나오면 위치를 맞추세요.");
		
		for(int i=1;i<=5;i++)
		{
			int mole=rand.nextInt(3)+1; // nextInt(3) => 0~2번까지 3개이므로 +1하면 1~3
			System.out.println("\n[라운드 "+i+"]");
			System.out.println("두더지가 나타났다!(1~3) : ");
			//시작시간
			long startTime=System.currentTimeMillis();			
			int input=scan.nextInt();
			long endTime=System.currentTimeMillis();
			
			//걸린 시간
			long time=endTime-startTime;
			
			if(time>2000)
			{
				System.out.println("⏰ 타임 오버! 실패");
				continue;
			}
			
			if(input==mole)
			{
				System.out.println("🎇 정답!");
				score++;
			}
			else
			{
				System.out.println("😥 오답!");
			    
			}			
						
		}
		System.out.println("🎇 당신의 점수는 "+(score*20+"점 입니다!"));
	}
}

class SpeedGame implements Game{
	public void start()
	{
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("⚡순발력 게임 시작!!");
        System.out.println("👍 지금!이 뜨면 Enter를 누르세요!");
        System.out.println("빨리 누르면 실패");
        
        try
        {
        	System.out.println("\n");
        	Thread.+
        }catch(Exception e) {}
        
	}
	
}
public class 인터페이스_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("게임 선택[두더지 게임(1), 순발력 게임(2)]");
        
        int select=scan.nextInt();
        Game game=null;
        
        if (select==1)
        {
        	game=new MoleGame();
        }
        
        else if (select==2)
        {
        	game=new SpeedGame();
        }
        
        game.start();
	} 

}
