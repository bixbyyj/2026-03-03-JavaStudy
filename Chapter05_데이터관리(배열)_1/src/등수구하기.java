/*
 *  3명의 학생 => kor eng math 점수 입력 => 총점/평균/학점/등수
 * 
 */
import java.util.Scanner;
public class 등수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int[] kor=new int[3];
        int[] eng=new int[3];
        int[] math=new int[3];
        
        int[] total=new int[3];
        int[] rank=new int[3];
        
        char[] grade=new char[3];
        double[] avg=new double[3];
        
        String[] name=new String[3];
        
        for (int i=0;i<3;i++)
        {
        	System.out.print((i+1)+"번째 국어 점수: ");
            kor[i]=scan.nextInt();
            
            System.out.print((i+1)+"번째 영어 점수: ");
            eng[i]=scan.nextInt();
            
            System.out.print((i+1)+"번째 수학 점수: ");
            math[i]=scan.nextInt();
            
            total[i]=kor[i]+eng[i]+math[i];
            avg[i]=total[i]/3.0;
        
            
            String s=switch((int)(avg[i]/10))
                {
                	case 10,9->"A";
                	case 8->"B";
                	case 7->"C";
                	case 6->"D";
                	default->"F";
                };
                grade[i]=s.charAt(0);
	    }
        for (int i=0;i<3;i++)
        {
        	rank[i]=1;
        	for (int j=0;j<3;j++)
        	{
        		if (total[i]<total[j])
        		{
        			rank[i]++;        			
        		}
        	}
        }
        for (int i=0;i<3;i++)
        {
        	System.out.printf("%5d%5d%5d%7d%7.2f%3c%3d\n", 
        			kor[i], eng[i], math[i], total[i], avg[i], grade[i], rank[i]);
        }
    }
}

