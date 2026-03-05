/*
 *  byte / long => 정수
 *  
 *  100L
 *  
 *  데이터형
 *   = 기본형 : 자바에서 제공하는 데이터형
 *   = 참조형 : 사용자 정의
 *   
 *   큰 데이터형에 작은 데이터 ok
 *   반대는 x
 *   byte<short<int<long<float<double
 *    => 하위 서열로 옮길 때 형 변환(casting) 필요
 *   
 *   long은 8byte고 float은 4byte 지만 실수기 때문에 상위데이터라고 판단
 *   
 */

public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte b1=Byte.MIN_VALUE;
        byte b2=Byte.MAX_VALUE;
        
        System.out.println("byte는 범위:"+b1+"~"+b2);
        
        long l1=Long.MIN_VALUE;
        long l2=Long.MAX_VALUE;
        
        
        System.out.println("long은 범위:"+l1+"~"+l2);
        
        short s1=Short.MIN_VALUE;
        short s2=Short.MAX_VALUE;
        // => 사용 빈도가 거의 없다
        System.out.println("short는 범위:"+s1+"~"+s2);
        
        int i1=Integer.MIN_VALUE;
        int i2=Integer.MAX_VALUE;
        
        System.out.println("int는 범위:"+i1+"~"+i2);
        
        //


        

	}

}
