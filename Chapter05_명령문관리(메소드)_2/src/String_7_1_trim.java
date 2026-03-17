import java.util.Scanner;
public class String_7_1_trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg=" Hello Java ";
        System.out.println("문자의 갯수: "+msg.length());
        System.out.println("문자의 갯수: "+msg.trim().length());
        
        String s=msg.trim();
        System.out.println("문자의 갯수: "+s.length());
        
        
        String id="admin";
        Scanner scan=new Scanner(System.in);
        System.out.println("아이디 입력");
        String mid=scan.nextLine();
        if(id.equals(mid.trim()))
        {
        	System.out.println("로그인 성공!!");
        }
        else if(id.equals(mid.replaceAll("\\s+" , "")))
        {
        	System.out.println("로그인 성공!");
        }
	
        else
        {
        	System.out.println("로그인 실패");
        }
	}

}
