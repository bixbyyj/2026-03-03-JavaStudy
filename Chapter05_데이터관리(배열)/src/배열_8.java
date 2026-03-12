// 컴퓨터와 가위바위보 10번 해서 2승 6패 2무
import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int win=0, lose=0, same=0;
		String[] res= {"가위", "바위", "보"};
		Scanner scan=new Scanner(System.in);
		
		for (int i=1;i<=10;i++)
		{
			int com=(int)(Math.random()*3);
			System.out.println("가위(0), 바위(1), 보(2)");
			
			System.out.println("가위바위보를 내세요:");
			int user=scan.nextInt();
			if (user<0 || user>2)
			{
				System.out.println("잘못된 입력입니다.");
				i--;
				continue;
			}
			System.out.println("컴퓨터:"+res[com]);
			System.out.println("사용자:"+res[user]);
			
			int r=com-user;
			if (r==-1 || r==2)
			{ 
				System.out.println("User win");
				win++;
			}
			else if (r==1 || r==-2)
			{
				System.out.println("Computer win");
				lose++;
			}
			else
			{
				System.out.println("비겼다!");
				same++;
			}
			
		}
		System.out.printf("%d승-%d무-%d패\n", win,same,lose);
		
		/*for(int i=0;i<=9;i++)
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2)");
		
		int user=scan.nextInt();
		System.out.println("사용자:"+res[user]); 
       
		int com=(int)(Math.random()*3); //0 1 2 난수 발생
		System.out.println("컴퓨터 : "+ res[com]);	
		
		System.out.println("====결과값====");
		int result=com-user;
		
		if (result == -1 || result==2)
		{ 
			System.out.println("User win");
		}
		else if (result == 1 || result==-2)
		{
			System.out.println("Computer win");
		}
		else
		{
			System.out.println("비겼다!!");*/
		}
		
			

			
		}
	   
	    
	
       
	
	



