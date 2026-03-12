import java.util.Scanner;
public class 문제풀이_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    int[] arr=new int[10];
    
    System.out.println("정수 10개를 입력하세요.");
    
    for(int i=0;i<arr.length;i++)
    { 
    	arr[i]=scan.nextInt();
    	
    }
    int a=arr[2];
    int b=arr[4];
    int last=arr[9];
    
    System.out.printf("%d는 세번째 숫자 %d는 다섯번째 숫자 %d는 마지막 숫자", a, b, last);
	}

}
