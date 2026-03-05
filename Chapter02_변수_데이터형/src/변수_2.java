import java.util.Scanner;

public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		// system.in => 키보드에서 입력된 값을 읽어오는 역할
		// => 공백/엔터
		System.out.println("국어 점수 입력");
		int 국어=scan.nextInt();
		System.out.println("국어:"+국어);
		
		System.out.println("수학 점수 입력");
		int 수학=scan.nextInt();
		System.out.println("수학:"+수학);
		
		System.out.println("영어 점수 입력");
		int 영어=scan.nextInt();
		System.out.println("영어:"+영어);
		
		int total=국어+수학+영어;
	    double avg=total/3.0;
	    
	    System.out.println("총점:"+total);
	    System.out.printf("평균 점수:%.2f",avg);
	    
	    scan.close();
		
		
		/*int kor=80;
		int eng=90;
		int mat=70;
		
		int total=kor+eng+mat;
		double avg = total/3.0;
		
		System.out.println("평균점수:"+avg);
		
		
		/*int apple=5;
		apple-=2;
       /*int totalapple=5;
       int eatapple=2;
       
       System.out.println("남은 사과의 수:"+(totalapple-eatapple));*/
	}

}
