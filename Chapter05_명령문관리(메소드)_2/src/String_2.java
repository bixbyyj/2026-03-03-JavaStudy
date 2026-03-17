import java.util.Scanner;
public class String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] subject= {
        		"혼자 배우는 자바",
        		"자바 And Spring",
        	    "자바가 필요한 oracle and Java"
        };
       Scanner scan=new Scanner(System.in);
       System.out.print("검색어 입력 :");
       String fd=scan.next();
       System.out.println("시작하는 문자열 찾기");
       
       for(String data:subject)
       {
    	   if(data.startsWith(fd))
    	   {
    		   //검색어로 시작하는 걸 읽어온다.
    		   //웹의 쿠키 읽기
    		   System.out.println(data);
    		
    	   }
       }
       
       System.out.println("끝나는 문자열 찾기");
       for(String data:subject)
       {
    	   if(data.endsWith(fd))
    	   {
    		   //검색어로 시작하는 걸 읽어온다.
    		   //웹의 쿠키 읽기
    		   System.out.println(data);
    	   }
       }
       
       System.out.println("포핟묀 문자열 찾기");
       for(String data:subject)
       {
    	   if(data.contains(fd))
    	   {
    		   //검색어로 시작하는 걸 읽어온다.
    		   //웹의 쿠키 읽기
    		   System.out.println(data);
    	   }
       }
	}
}
