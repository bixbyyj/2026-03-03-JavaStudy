import java.util.*;
public class 메소드_문제_2 {
	
	static String reverse(String alpha)
	{
		String result ="";
		for (int i=alpha.length()-1;i>=0;i--)
		{
			result += alpha.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		
		String alpha=scan.nextLine();
		
		String reversed=reverse(alpha);
		
		System.out.print("결과값 = "+reversed);
	}

}
