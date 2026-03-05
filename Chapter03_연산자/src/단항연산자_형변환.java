/*
 * 
 *  형변환 연산자
 *   byte<char<int<long<double
 *  
 *   => 제외 : boolean / String
 */
public class 단항연산자_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=80;
        int eng=78;
        int math=88;
        
        int count=3;
        
        int total=kor+eng+math;
        double avg=total/(double)count;
        
        System.out.println("총점:"+total);
        System.out.println("평균:"+avg);
        
        char c='A';
        		System.out.println((int)c);
        int i=65;
        System.out.println((char)i);
        
        int a=123456;
        float d=123456.78F;
        int r=(int)((d-a)*100);
        
        System.out.println(r);
	}

}
