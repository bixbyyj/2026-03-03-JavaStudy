/*
 * 
 * 증감연산자
 *   => 전치 연산자 ++a (증가를 먼저하고 나중에 다른 연산 수행)
 *   => 후치 연산자 a++ (다른 연산 수행 후 증가)
 *   => 정수나 문자만 사용 가능
 *   
 *   ex int a=10;
 *      int b=a++;
 *      
 *      System.out.println(a, b);
 *      a : 11, b : 10
 *      
 *      int a=10;
 *      int b=++a;
 *      
 *      a: 11
 *      b: 11
 */
public class 단항연산자_증감 {
        public static void main(String[] a_ ) {
        	// TODO Auto-generated method stub
        	
           int a=10;
           int b=++a + a++;
        	
        	System.out.println("a="+a+",b="+b);
      
     
        }
}
