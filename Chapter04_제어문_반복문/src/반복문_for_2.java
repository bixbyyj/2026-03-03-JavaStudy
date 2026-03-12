/*
 * 사용자로부터 단을 받아서 구구단
 */
import java.util.Scanner;
public class 반복문_for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner scan=new Scanner(System.in);
		 * 
		 * System.out.println("몇 단을 출력할까요?"); int num=scan.nextInt();
		 * 
		 * for (int i=1;i<=9;i++) System.out.printf("%d * %d = %d\n", num, i, num*i);
		 */
		
		/*
		 * for (int i=1;i<=12;i++) System.out.printf("%d * %d = %d\n", i, i, i*i);
		 */
		
		String str="Hello Java";
		/*
		 * for (int i=0;i<str.length();i++) { System.out.println(str.charAt(i)); }
		 */
			
		/*
		 * System.out.println(); for(int i=str.length()-1;i>=0;i--) {
		 * System.out.println(str.charAt(i) ); }
		 */
		
		int a=0;
		
		int b=0;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='A' && c<='Z')
				a++;
			
			else
				b++;
			
		}
		
		System.out.println("대문자:"+a);
		System.out.println("소문자:"+b);
	}
			
        
	}


