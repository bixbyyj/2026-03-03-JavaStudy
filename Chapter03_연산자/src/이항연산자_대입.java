/*
 * 대입연산자 = 서열 마지막
 * 
 * 복합대입연산자
 * +=, -=, *=, /=, >>=, <<=, &=, |=, ^=
 * 
 *  형변환
 *     int a='A'; ==> a=65
 *     double d=10 ==> d=10.0
 *     
 *     char c=' '; <= 반드시 한칸을 띄워야함 '' = null
 *     
 */
public class 이항연산자_대입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=65;
		char d=(char) ((int)(Math.random()*26)+65);
		
		System.out.println(c);
		System.out.println("d="+d);
		
				
	}

}
