import java.util.Scanner;
public class 제어문_다중조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("몇 월인가요?");
       
       int month=scan.nextInt();
       
       if (month>=3 && month<=5)
       {
          System.out.println("월은 봄입니다.");
       }
          
          else if (month>=6 && month<=8)
          {
        	  System.out.println("월은 여름입니다.");
          }
          
          else if (month>=9 && month<=11)
          {
        	  System.out.println("월은 가을입니다.");
          }
          
          else if (month==12 || month==1 || month==2)
          {
        	  System.out.println("월은 겨울입니다.");
          }
       
          else 
          {
        	  System.out.println("1년은 1월부터 12월까지만 존재합니다.");
          }
       
	}

}
