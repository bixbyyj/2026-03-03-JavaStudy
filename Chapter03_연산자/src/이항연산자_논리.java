/*
 *  논리연산자
 *   => 최적화 연산자
 *   => 연산기호
 *     && => 둘 다 참이어야 true
 *     || => 둘 중 하나만 참이면 true
 * 
 */
public class 이항연산자_논리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=9;
		boolean res= x>10 || ++y==x;
		System.out.println("결과값:"+res);
		System.out.println("y="+y);

	}

}
