import java.util.Scanner;
public class 제어문_선택문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("몇 월인가요?");
       
       int month=scan.nextInt();
       //System.out.println("문자열 입력:");
      // String msg=scan.nextLine();
       //System.out.println(msg);
       /* 값을 받을 떄
          1. 정수 nextInt();
          2. 실수 nextDouble();
          3. 문자열 next(); => 공백 전까지
                  nextLine(); => 엔터(\n) 전까지
        
                 
       */   
       switch(month)
       {
       case 3,4,5 -> System.out.println("봄입니다.");
       case 6,7,8 -> System.out.println("여름입니다.");
       case 9,10,11 -> System.out.println("가을입니다.");
       case 12,1,2 -> System.out.println("겨울입니다.");
       default -> System.out.println("존재하지 않는 달입니다.");
       };
	};

}
