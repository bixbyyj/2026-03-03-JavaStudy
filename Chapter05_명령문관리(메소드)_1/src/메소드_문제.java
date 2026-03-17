import java.util.Scanner;
public class 메소드_문제 {
	
	static String[] ids= {"admin", "09658"};	
	
	static boolean idcheck(String inputId)
	{
		for (String existingId : ids)
		{
			if (existingId.equals(inputId))
			{
				return true;
			}
			
		}
		return false;
	};	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 while(true) 
	        {
        Scanner scan=new Scanner(System.in);
        System.out.println("아이디를 입력하세요 : ");
        String user=scan.next();
        
       
          if (idcheck(user))
           {
        	System.out.println("로그인 되었습니다.");
        	break;
           }
          else 
           {
        	System.out.println("존재하지 않는 아이디 입니다.");      
        	
           }
        
        }
	}
}