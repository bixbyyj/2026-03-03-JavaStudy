/*
 * 
 *  학생 => 3명: 성적관리
 *  kor/eng/math
 *    => 총점 / 평균 / 학점
 *    
 *    배열 필요성
 *    프로그램 : 데이터 여러개를 한개의 이름 => 배열 / 클래스
 *    명령문을 한 개 이름으로 통합해서 관리 => 메소드
 *    클래스 여러개를 한 개 이름으로 관리 => 인터페이스
 */
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       
       int kor1,kor2,kor3;
       int eng1,eng2,eng3;
       int math1,math2,math3;
       int total1,total2,total3;
       double avg1,avg2,avg3;
       char score1,score2,score3;
       
       System.out.println("첫번째 학생의 국어 점수:");
       kor1=scan.nextInt();

       System.out.println("첫번째 학생의 영어 점수:");
       eng1=scan.nextInt();
       
       System.out.println("첫번째 학생의 수학 점수:");
       math1=scan.nextInt();
       
       total1=kor1+eng1+math1;
       avg1=total1/3.0;
       
       System.out.println("두번째 학생의 국어 점수:");
       kor2=scan.nextInt();

       System.out.println("두번째 학생의 영어 점수:");
       eng2=scan.nextInt();
       
       System.out.println("두번째 학생의 수학 점수:");
       math2=scan.nextInt();
       
       total2=kor2+eng2+math2;
       avg2=total2/3.0;
       
       System.out.println("세번째 학생의 국어 점수:");
       kor3=scan.nextInt();

       System.out.println("세번째 학생의 영어 점수:");
       eng3=scan.nextInt();
       
       System.out.println("세번째 학생의 수학 점수:");
       math3=scan.nextInt();
       
       total3=kor3+eng3+math3;
       avg3=total3/3.0;
       
       System.out.printf("%5d%5d%5d%5d%7.2f\n",kor1,eng1,math1,total1,avg1);
       System.out.printf("%5d%5d%5d%5d%7.2f\n",kor2,eng2,math2,total2,avg2);
       System.out.printf("%5d%5d%5d%5d%7.2f\n",kor3,eng3,math3,total3,avg3);
    		   
	}

}
