//main=> 프로그램 시작점 => 프로그램 안에는 반드시 main이 한 개 이상
import java.util.Scanner;
public class 제어문_선택조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String id="admin"; String pwd="1234";
		 */
        Scanner scan=new Scanner(System.in);
        
        System.out.print("아이디 입력:");
        String id=scan.next();
        
        System.out.print("비밀번호 입력:");
        String pwd=scan.next();
        
		
        if(id.equals("admin") && pwd.equals("1234"))
        {
        	System.out.println("로그인 되었습니다.");
        }
        else
        {
        	System.out.println("로그인에 실패하였습니다.");
        	
        }
        		
	}

}
