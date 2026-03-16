/*
 *  국 영 수 입력 => 총점 / 평균 / 학점
 *  
 *  메소드 갯수
 *  입력
 *  ------
 *  총점
 *  평균
 *  학점
 *  ------ back
 *  출력
 * ------- front
 * 
 * 
 */
import java.util.Scanner;
public class 메소드_2 {
	// 
	static int input(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(subject +" 입력");
		return scan.nextInt();
	}
	
	static int total(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	
	static double avg(int total)
	{
		return total/3.0;
	}
	
	static String score(int avg)
	{
		String score=switch((int)(avg))
		        {
		        case 10,9 -> "A";
		        case 8 -> "B";
		        case 7 -> "C";
		        case 6 -> "D";
		        default -> "F";
		        };
		        return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor=input("국어 점수");
		int eng=input("영어 점수");
		int math=input("수학 점수");
		
		/*
		 * int total=kor+eng+math; double avg=total/3.0;
		 * 
		 * String score=switch((int)(avg/10)) { case 10,9 -> "A"; case 8 -> "B"; case 7
		 * -> "C"; case 6 -> "D"; default -> "F"; };
		 */
        
		int t=total(kor,eng,math);
		double a=avg(t);
		
		String s=score((int)(a/10));
		
        System.out.println("총점"+t);
        System.out.println("평균"+a);
        System.out.println("학점"+s);
        
		
		/*
		 * Scanner scan=new Scanner(System.in);
		 * 
		 * System.out.print("국어 입력"); int kor=scan.nextInt();
		 * 
		 * System.out.print("영어 입력"); int eng=scan.nextInt();
		 * 
		 * System.out.print("수학 입력"); int math=scan.nextInt();
		 * 
		 */	
	}

}
