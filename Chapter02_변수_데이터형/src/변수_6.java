/*
 *  String  : 문자열 여러개를 한 번에 저장할 수 있는 참조형 데이터형 
 *   => 웹 가능 많이 사용되는 데이터형
 *   => 클래스형으로 사용이 가능
 *   => 문자열 결합
 *     + : 산술식으로도 가능하지만, 문자열 결합으로도 씀  
 *  ex "Hello" + "Java" = "Hello Java"
 *  ex 7+7+"7"+7+7=14777
 *  ex 7+7+"7"+(7+7)=14714
 *  
 *  boolean :  존재 여부
 *          => 장바구니에 값 있는지?
 *          0=>false
 *          1=>true
 *          => 조건문 / 반복문에서 주로 사용
 *          => 데이터형의 크기는 사용할 수 없다, 형변환도 안됨
 *          
 *  변수값 교환        
 *          => 임시 변수 만들어주면 됨
 */
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Call By Value
        int a=10;
        int b=20;
        
        int temp=a; // temp=10
        a=b; // a=20
        b=temp; // b=10
        
        System.out.println("a="+a);
        System.out.println("b="+b);		

	}

}
