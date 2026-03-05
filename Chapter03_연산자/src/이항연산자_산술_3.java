
public class 이항연산자_산술_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		// Math.random() => 0.0~0.99 *100
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		int d=(int)(Math.random()*100)+1;
		int e=(int)(Math.random()*100)+1;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		
		double avg=(a+b+c+d+e)/5.0;
		System.out.println("평균:"+avg);
		
		

	}

}
