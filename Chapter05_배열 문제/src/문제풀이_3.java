import java.util.Arrays;

public class 문제풀이_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr=new int[5];
       
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i] = (int)((Math.random()*5)+1);
       }
       System.out.println(Arrays.toString(arr));
	}

}
