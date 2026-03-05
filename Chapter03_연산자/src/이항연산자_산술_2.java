import java.util.Scanner;

public class 이항연산자_산술_2 {
 
	public static void main(String[] a) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 입력:");
		int kor=scan.nextInt();
		
		System.out.print("영어 입력:");
		int eng=scan.nextInt();
		
		System.out.print("수학 입력:");
		int math=scan.nextInt();
		 
		int total=kor+eng+math;
		double avg=(kor+eng+math)/0.0;
		
		System.out.println("국어 점수:"+kor);
		System.out.println("수학 점수:"+math);
		System.out.println("영어 점수:"+eng);
		
		System.out.println("총 점수:"+total);
		System.out.printf("평균 점수:%.3f\n",avg);
		
		System.out.println(5%0.0);
		
		
	}
}


