import java.util.Random;
public class 제어문_선택조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random r=new Random();
        int i=r.nextInt(100)+1; // 1~100 사이의 정수 추출
        // 1~99
        System.out.println("정수값:"+i);
        
        if(i%3==0)
        	System.out.println(i+"은(는) 3의 배수 입니다.");
        
        else if(i%2==0)
        	System.out.println(i+"은(는) 3의 배수가 아닌 짝수입니다.");
        else 
        	System.out.println(i+"은(는) 3의 배수가 아닌 홀수입니다.");
        	
	}

}
