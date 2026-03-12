import java.util.*;
public class 문제풀이_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr=new int[10];
       int total=0;
       
       for (int i=0;i<arr.length;i++)
       {
    	   arr[i]=(int)((Math.random()*10)+1);
    	   total +=arr[i];
       }
       
       double avg=total/10.0;
       System.out.println(Arrays.toString(arr));
       System.out.println("총 합:"+total);
       System.out.println("평균:"+avg);
       
	}

}
