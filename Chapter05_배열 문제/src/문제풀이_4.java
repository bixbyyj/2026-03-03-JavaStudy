import java.util.*;
public class 문제풀이_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
	  Scanner scan=new Scanner(System.in);
      char[] alpha=new char[5];
      
      System.out.println("알파벳을 입력하세요:");
      
      for (int i=0;i<alpha.length;i++)
      {
    	  alpha[i]=scan.next().charAt(0);
      }
      System.out.print(Arrays.toString(alpha));
      
	}

}
