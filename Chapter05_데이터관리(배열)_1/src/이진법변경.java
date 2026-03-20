/*
 * 
 * 16bit => 32767
 * 
 * 10
 * 
 * 0000 0000 0000 1010
 */
import java.util.Scanner;
public class 이진법변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int[] binary=new int[16];
        // 저장 순서 => 0부터 or 15부터
        int index=15; //뒤에서부터 저장 하겠다고 초기화 선언
        
        System.out.println("0~32767까지 사이의 숫자를 입력하세요 :");
        int num=scan.nextInt();
        
        System.out.println("라이브러리:"+Integer.toBinaryString(num));
        System.out.println("라이브러리:"+Integer.toOctalString(num));
        System.out.println("라이브러리:"+Integer.toHexString(num));
        
        //횟수가 지정되지 않았음 => while 문 사용
        while(true)
        {
        	//2로 나누고 나머지 저장
        	binary[index]=num%2;
        	//2로 나눠서 1이나 0이 나올 때 까지 반복\
        	//binary[15]= 13%2==1 
        	//13=13/2=6
        	//binary[14]=6%2==0
        	num=num/2;
        	// 1/2 == 0 ; , 0/2 == 0 (cuz int/int == int)
        	if (num==0)
        		break;
        	index--;
        }
        for (int i=0;i<binary.length;i++)
        {
        	if (i%4==0 && i!=0)
        	{
        		System.out.print(" ");
        	}
        	System.out.print(binary[i]);
        }
        
	}

}
