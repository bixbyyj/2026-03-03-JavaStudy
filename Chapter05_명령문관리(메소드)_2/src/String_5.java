/*
 *  Hello Java
 *  0123456789
 *  
 *  원하는 위치부터 뒤에 전체
 *  substring(6)
 *  부분적으로 자르기
 * 
 * 
 * 
 */
public class String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="0123456789";
        
        System.out.println(msg.substring(3));
        
        System.out.println(msg.substring(1,6));
        
        String title="Hello Java,Orcale!!";
        String temp=title.substring(0,10)+"...";
        System.out.println(temp);
        
        
	}

}
