import java.util.Scanner;

public class 이항연산자_산술_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* 
          Scanner scan=new Scanner(System.in);
        System.out.println("정수 입력:");
        int num=scan.nextInt();
        
        String res=(num%2==0)?"짝수":"홀수";
        System.out.println(num+"is"+res);
        
        int no=369;
        System.out.println(no/100);
        System.out.println(no%10);
        System.out.println((no%100)/10);            
	}*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		String result=((year%4==0)&&(year%100!=0))||(year%400==0)?"윤년입니다":"윤년이 아닙니다";
		System.out.println(result);
	  }
}
		
		
		


