/*
 *  웹 개발
 *  => String / ArrayLsit/ Integer
 *    ------- 자바에서 지원하는 메소드 => 리턴형 / 매개변수 / 어떤 값 읽기
 *    
 *    비교
 *    
 *    equals ex) Id.pwd / equalsIgnorCase 검색
 *                       => 대소문자 무시
 *                       
 * 
 * 
 * 
 * 
 */
public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String hong="admin";
        String shim="admin";
        String park=new String("admin");
        String lee="Admin";
        
        if (hong==shim)
        System.out.println("hong=shim");
        
        else
        	System.out.println("hong과 같지 않다");
        
        if (hong.equals(park)) 
        {
        	System.out.println("hong과 park는 같다");
        }
        else
        {
        	System.out.println("hong과 shim은 같지 않다");
        }
        
        
        		
	}

}
