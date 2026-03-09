/*
 *  삼항연산자
 *    => 피연산자가 3개인 경우
 *    => 조건?참일 때:거짓일 때;
 *    
 *  if~else
 *    
 */
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int num=(int)(Math.random()*100)+1; System.out.println("num="+num);
		 * 
		 * String result=num%2==0?"짝수":"홀수"; System.out.println(num+"은"+result+"입니다.");
		 */
		
		int num=(int)(Math.random()*2);
		char c=num==0?(char)((int)(Math.random()*26)+65):
		              (char)((int)(Math.random()*26)+97);
	    System.out.println("c="+c);
	    
	    String result=(c>='A' && c<='Z')?"대문자":"소문자";
	    System.out.println(c+"는(은) "+result+"입니다.");
	}

}
