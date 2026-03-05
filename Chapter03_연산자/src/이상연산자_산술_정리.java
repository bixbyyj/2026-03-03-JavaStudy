/*
 *  2진법을 10진법으로 => Ob
 *  10진법을 2진법으로 => Integer.tobinaryString
 *  
 *   증감 / 산술 / 비교 / 논리 / 대입
 *   -------------------------
 *   부정 / 비트이동 / 비트
 *  
 * 
 */
import java.util.Scanner;
import java.text.*;
public class 이상연산자_산술_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("국어 점수:");
        int kor=scan.nextInt();
        		
        System.out.println("영어 점수:");
        int eng=scan.nextInt();
        
        System.out.println("수학 점수:");
        int math=scan.nextInt();
        
        int total=kor+eng+math;
        
        double avg=total/3.0;
        
        double[] limits= {50, 60, 64, 67, 70, 74, 77, 80, 84, 87, 90, 94, 97};
        String[] score= {"F", "D-", "D0", "D+", "C-", "C0", "C+", 
        		"B-", "B0", "B+", "A-", "A0", "A+"};
        
        ChoiceFormat cf=new ChoiceFormat(limits,score);
        
        System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+math);
        System.out.println("총점:"+total);
        System.out.println("평균:"+avg);
        System.out.println("학점:"+cf.format(avg));
        
        }
        		
        		
        
	}


