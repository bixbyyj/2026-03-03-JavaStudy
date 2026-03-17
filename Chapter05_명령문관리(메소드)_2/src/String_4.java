/*
 * 
 *  변환
 *   toUpperCase => 대문자 변환 => 리턴형 String
 *   toLowerCase => 소문자 변환 => 리턴형 String
 *   replace => 지정된 문자 => 리턴형 String
 *   replaceAll => 정규식을 이용하는 방식 => 리턴형 String
 */
public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="Hello Java";
        
        System.out.println("대문자로 변환: "+ msg.toUpperCase());
        System.out.println("소문자로 변환: "+ msg.toLowerCase());
        System.out.println("원래 데이터"+ msg);
        
        String s=msg.replace('l', 'm');
        System.out.println(s);
        
        s=msg.replace("Java", "Python");
        System.out.println(s);
        
        s=msg.replaceAll("Jav", "Pyth");
        System.out.println(s);
        
        
        
	}}     
        		


