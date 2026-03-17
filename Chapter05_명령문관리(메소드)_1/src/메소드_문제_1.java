

import java.util.Scanner;
public class 메소드_문제_1 {
	
	static void print(int num)
	{
		for (int i=1;i<=num;i++)
		{
			System.out.printf("%5d\n", i);
		}
	}
	
	static void sum(int num)
	{
	int sum=0;
	
		for (int i=1;i<=num;i++)
		{
			sum+=i;			
		}
		System.out.printf("해당 수 까지의 합은 %d 입니다", sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		while(true)
		{				
		Scanner scan=new Scanner(System.in);
        System.out.println("자연수를 입력하세요 : ");
        
        int num=scan.nextInt();
        
          if (num<=0)
           {
        	System.out.println("0과 음수는 자연수가 아닙니다. 다시 입력하세요");
           }
          else
           {
        	print(num);
        	sum(num);
        	break;
           }
        
        
	     }
	}
}
