/*
 * 
 * ++/-- => 정수형
 * 
 * ! => boolean
 * 
 * => 범위에 없는 값
 * => !(score>=0 && score<=100) << 오류
 * 
 * 
 * 
 */
public class 단항연산자_부정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean b=false;
        int i=0;
        while(i<10)
        {
        	b=!b;
        	if(b==true)
        		System.out.println("사용자");
        	else
        		System.out.println("컴퓨터");
        	i++;
        }
	}

}
