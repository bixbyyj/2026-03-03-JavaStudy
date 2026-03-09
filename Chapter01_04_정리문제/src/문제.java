import java.util.Scanner;
import java.util.Random;
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 사과 3개를 저장하는 변수
		int apple=3;
		//2. 연필 5개와 지우개 2개를 변수로
		int penc=5;
		int eras=2;
		//3. 학생 수 30명 변수로
		int num=30;
		//4. 우유 가격 2500원 변수로
		int price=2500;
		//5. 키 175.5 변수로
		double hei=175.5;
		//6. 이름이 민수 변수로
		String name="민수";
		//7. 버스 승객 12명, 지하철 승객 20명 변수로
		int buspas=12;
		int subpas=20;
		//8. 국어 점수 85점 영어 점수 90점
		int kor=85;
		int eng=90;
		//9. 파이 값 3.14 저장하는 변수
		double pi=3.14;
		//10. 노트북 1대 마우스 2개 키보드 1개
		int lap=1;
		int mou=2;
		int keyb=1;
		
		
		//1. 5+3을 더하는 프로그램
		
		System.out.println(5+3);
		
		//2. 10-4
		
		System.out.println(10-4);
		
		//3. 6*7
		
		System.out.println(6*7);
		
		//4. 20/4
		
		System.out.println(20/4);
		
		//5. 15를 4로 나누었을 때 나머지
		System.out.println(15%4);
		
		//6. 8+2한 후 *3
		System.out.println((8+2)*3);
		
		//7. 10을 1 증가하는 코드
		int a=10;
				System.out.println(a++);
		//8. 10을 1 감소
	    int b=10;
	            System.out.println(b--);
	    //9. 7이 5보다 큰지 비교하는 소스
	    int c=7;
	    int d=5;
	    
	    String result=(c>d)?"7이 더 크다.":"5가 더 크다.";
	    System.out.println(result);
	    
	    //10. i=5 j=10 i>3 j<20인지 코드 확인
	    int i=5;
	    int j=10;
	    boolean res=(i>3&&j<20);
	        System.out.println(res);
	    
	    //1. num이 10보다 크면 10보다 큽니다를 출력하세요
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("정수를 입력하세요:");
	    int numb=scan.nextInt();
	    
	    if (numb>10)
	    	System.out.println(numb+"은(는) 10보다 큽니다.");
	    
	    //2. score가 60 이상이면 합격 출력
	    System.out.println("점수를 입력하세요");
	    int score=scan.nextInt();
	    
	    if (score>=60)
	    	System.out.println("합격입니다.");
	    
	    //3. age가 20 이상 성인
	    System.out.println("나이를 입력하세요.");
	    int age=scan.nextInt();
	    
	    if (age>=20)
	    	System.out.println("성인입니다.");
	    
	    //4. num이 짝수면 짝수 홀수면 홀수
	    System.out.println("정수를 입력하세요.");
	    int numbe=scan.nextInt();
	       if (numbe%2==0)
	    	   System.out.println("짝수입니다.");
	       
	       else 
	    	   System.out.println("홀수입니다.");
	    
	    //5. 60이상이면 합격 아니면 불합격
	    System.out.println("점수를 입력하세요");
	    int scor=scan.nextInt();
	       if (scor>=60)
	    	   System.out.println("합격입니다.");
	       else
	    	   System.out.println("불합격입니다.");
	    //6. 
	    System.out.println("온도를 입력하세요");
	    int temp=scan.nextInt();
	        if (temp>=30)
	        	System.out.println("덥다");
	        else 
	        	System.out.println("덥지 않다");
	    //7. 
	    System.out.println("점수를 입력하세요");
	    int scr=scan.nextInt();
	        if (scr>=90)
	        	System.out.println("A");
	        
	        else if (scr>=80)
	        	System.out.println("B");
	        
	        else if (scr>=70)
	        	System.out.println("C");
	        
	        else
	            System.out.println("D");
	     
	    //8. 
	    Random r=new Random();
	    
	    int re=r.nextInt();
	      if (re>0)
	    	  System.out.println(re+"(은)는 양수입니다.");
	      
	      else if(re==0)
	    	  System.out.println(re+"는 0입니다.");
	      
	      else
	          System.out.println(re+"(은)는 음수입니다.");
	      
	    //9. 
	    System.out.println("나이를 입력하세요.");  
	    int ag=scan.nextInt();
	    
	    if (ag<=13 && ag>=0)
	    	System.out.println("어린이 입니다.");
	    
	    else if (ag>=14 && ag<=19)
	    	System.out.println("청소년 입니다");
	    
	    else 
	        System.out.println("성인 입니다");
	    
	    //10.
	    Random k=new Random();
	    
	    int number=k.nextInt();
	         if (number>10)
	        	 System.out.println("10보다 크다");
	         
	         else if (number==10)
	        	 System.out.println("10과 같다");
	         
	         else
	        	 System.out.println("10보다 작다");
	     
	    	
	    	  
	       
	      
	    
	    		
	}

}
