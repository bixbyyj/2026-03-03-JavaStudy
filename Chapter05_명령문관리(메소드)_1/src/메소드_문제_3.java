import java.util.Arrays;
import java.util.Scanner;
public class 메소드_문제_3 {
	
	
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력(0~32767);");
		return scan.nextInt();								
	}
    
	static int[] binary(int num)
	{
		int[] b=new int[16];
		int index=15;
		
		while(true)
		{
			b[index]=num%2;
			num/=2;
			if(num==0)
			{
				break;
				
			}
			index--;
		}
		return b;
	}
	
	static void print(int[] arr)
	{
		for (int i=0;i<arr.length;i++) {
		if (i%4==0 && i!=0)
    	{
    		System.out.print(" ");
    		
    	} 
		System.out.print(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int num=input();
			
			int[] binary = binary(num);
			
			print(binary);
			
		}

	}

}
